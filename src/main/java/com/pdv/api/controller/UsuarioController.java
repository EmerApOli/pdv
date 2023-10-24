package com.pdv.api.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.pdv.api.dto.UsuarioDTO;
import com.pdv.domain.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/usuarios" , produces ="application/json")
public class UsuarioController {
    @Autowired
public UsuarioService usuarioservice;
    @Autowired
    private ModelMapper modelMapper;


    @ResponseBody
@GetMapping(value = "consultausuario", produces ="application/json " )
public Collection<UsuarioDTO> consultausuario() throws JsonProcessingException {

    Collection<UsuarioDTO> usuariodto = usuarioservice.consultausuario();
    return  usuariodto.stream().toList();


}








}
