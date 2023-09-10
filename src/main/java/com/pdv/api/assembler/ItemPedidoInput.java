package com.pdv.api.assembler;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPedidoInput {

	//@NotNull
	private Long produtoId;
	
	//@NotNull
	//@PositiveOrZero
	private Integer quantidade;
	
	private String observacao;
	
}
