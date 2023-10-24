package com.pdv.domain.repository;

import com.pdv.domain.model.Produto;
import com.pdv.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	//@Query("from Produto where id = :produto")
//	Optional<Usuario> findById(@Param("produto") Long produtoId);
	
	//List<Produto> findByRestaurante(Restaurante restaurante);
	
}
