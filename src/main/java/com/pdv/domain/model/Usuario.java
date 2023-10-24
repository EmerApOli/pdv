package com.pdv.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity

public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String matricula;
    @Column(nullable = false)
    private String dv;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private OffsetDateTime data_admissao;
    @Column(nullable = false)
    private OffsetDateTime dt_nasc;

    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String pis;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String orgao_emissor;
    @Column(nullable = false)
    private String ddd;
    @Column(nullable = false)
    private String celular;
    @Column(nullable = false)
    private String ic_def;
    @Column(nullable = false)
    private String lotacao_fisica;
    @Column(nullable = false)
    private String lotacao_administrativa;


}