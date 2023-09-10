package com.pdv.api.model.input;

import java.util.List;


import com.pdv.api.assembler.ItemPedidoInput;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PedidoInput {


	
	//@Valid
	//@Size(min = 1)
	//@NotNull
	private List<ItemPedidoInput> itens;
	
}
