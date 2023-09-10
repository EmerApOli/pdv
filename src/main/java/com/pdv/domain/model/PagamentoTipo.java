package com.pdv.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pagamentotipo")
public class PagamentoTipo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Nonnull
	@Column(name = "descricao")
	private String descricao;

	
	@Column(name = "formapagamento")
	private String formaPagamento;
	
	@Column(name = "qtdparcelas")
	private int qtdparcelas;
	
	@Column(name = "datacadastro")
	private Date datacadastro;


}