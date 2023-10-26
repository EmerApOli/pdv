package com.pdv;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pdv.api.dto.UsuarioDTO;
import com.pdv.domain.model.Usuario;
import com.pdv.domain.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@RunWith(SpringRunner.class)
class BwpPdvApplicationTests {
    @Autowired
	UsuarioService usuarioService;
    @Autowired
	UsuarioDTO usuarioDTO ;
	@Test
	void contextLoads() throws JsonProcessingException {

		//cenario
		Usuario usuario = new Usuario();


		UsuarioDTO usuarioDTOS = usuarioService.consultausuario2();

		usuario.setId(usuarioDTOS.getId());
		usuario.setNome(usuarioDTOS.getNome());
		usuario.setDv(usuarioDTOS.getDv());
		usuario.setMatricula(usuarioDTOS.getMatricula());
		usuarioService.salvar(usuario);
		assertThat(usuarioDTO).isNotNull();
        assertThat(usuario).isNotNull();

	}

}
