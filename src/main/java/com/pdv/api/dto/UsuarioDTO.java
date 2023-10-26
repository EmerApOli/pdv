package com.pdv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
@Service
@Getter
@Setter
//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
//@JsonPropertyOrder({ "id","matricula" ,"dv", "nome" })
public class UsuarioDTO implements Serializable {

    private  static  final  long serialVersionUID= 1L;
  //@JsonProperty("id")
    private Long id;
   //@JsonProperty("matricula")
    private String matricula;
   //@JsonProperty("dv")
    private String dv;
   //@JsonProperty("nome")
    private String nome;


}
