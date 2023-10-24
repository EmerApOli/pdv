package com.pdv.domain.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pdv.api.dto.UsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

@Service
public class UsuarioService {



    @Autowired
    //private ModelMapper modelMapper;
    public Collection<UsuarioDTO> consultausuario() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

       RestTemplate restTemplate = new RestTemplate();
       String  url = "http://localhost:3000/usuario"  ;

        UsuarioDTO[] response = restTemplate.getForObject("http://localhost:3000/usuario",UsuarioDTO[].class);

         return List.of(response);
      //  return restTemplate.getForObject(url,UsuarioDTO[].class);
    }



    }


