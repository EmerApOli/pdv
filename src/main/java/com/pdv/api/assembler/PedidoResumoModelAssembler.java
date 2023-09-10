package com.pdv.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.pdv.api.model.input.model.PedidoResumoModel;
import com.pdv.domain.model.Pedido;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class PedidoResumoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public PedidoResumoModel toModel(Pedido pedido) {
		return modelMapper.map(pedido, PedidoResumoModel.class);
	}
	
	public List<PedidoResumoModel> toCollectionModel(List<Pedido> pedidos) {
		return pedidos.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
}
