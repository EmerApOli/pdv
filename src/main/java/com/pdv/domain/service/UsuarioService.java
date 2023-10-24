package com.pdv.domain.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pdv.api.dto.UsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UsuarioService {



    @Autowired
    //private ModelMapper modelMapper;
    public  UsuarioDTO consultausuario() throws JsonProcessingException {


        RestTemplate restTemplate = new RestTemplate();
        String  url = "http://localhost:3000/usuario"  ;

        // return  new mo().getForObject("http://localhost:3000/usuario",UsuarioDTO.class);

        return restTemplate.getForObject(url,UsuarioDTO.class);
    }



    }


