package com.pdv.api.model.input;

import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Setter
@Getter
public class PedidoInput {

	//@Valid
	//@NotNull
//	private RestauranteIdInput restaurante;
	
	//@Valid
//	@NotNull
	//private EnderecoInput enderecoEntrega;
	
	//@Valid
	//@NotNull
	//private FormaPagamentoIdInput formaPagamento;
	
//	@Valid
//	@Size(min = 1)
//	@NotNull
	private List<ItemPedidoInput> itens;
	
}
