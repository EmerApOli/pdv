package com.pdv.api.model.input;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter
public class ItemPedidoInput {

	private Long produtoId;
	private String produtoNome;
	private Integer quantidade;
	private BigDecimal precoUnitario;
	private BigDecimal precoTotal;
	private BigDecimal desconto;
	private String observacao;


}
