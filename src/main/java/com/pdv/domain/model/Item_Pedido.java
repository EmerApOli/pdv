package com.pdv.domain.model;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "item_pedido")
public class Item_Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "descricao")
    private String descricao;

   
    @Column(name = "forma_pagamento")
    private String formaPagamento;
   
    @Column(name = "qtd_parcelas")
    private int qtd_parcelas;
    
    @Column(name = "data_cadastro")
    private Date data_cadastro;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pedido_codigo")
    private Pedido pedido;

   @ManyToOne
    @JoinColumn(name = "produto_id")
   private Produto produto;
   
   @ManyToOne
   @JoinColumn(name = "usuario", nullable = false)
   private Usuario usuario;
 

    
    }