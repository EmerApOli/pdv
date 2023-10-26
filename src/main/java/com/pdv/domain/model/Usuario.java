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

    @Column(nullable = true)
    private Long id;
    @Column(nullable = true)
    private String matricula;
    @Column(nullable = true)
    private String dv;
    @Column(nullable = true)
    private String nome;


}