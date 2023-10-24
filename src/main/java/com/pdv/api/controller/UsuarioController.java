package com.pdv.api.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.pdv.api.dto.UsuarioDTO;
import com.pdv.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios" , produces ="application/json")
public class UsuarioController {
    @Autowired
public UsuarioService usuarioservice;


    @ResponseBody
@GetMapping(value = "consultausuario", produces ="application/json " )
public UsuarioDTO consultausuario() throws JsonProcessingException {

    UsuarioDTO usuariodto = usuarioservice.consultausuario();
    return  new ResponseEntity<UsuarioDTO>(usuariodto, HttpStatus.OK).getBody();


}








}
