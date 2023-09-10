package com.pdv.api.model.input.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.pdv.domain.model.Pedido;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PedidoResumoModel {

	private Long id;
	private BigDecimal subtotal;
	private BigDecimal taxaFrete;
	private BigDecimal valorTotal;
	private String status;
	private OffsetDateTime dataCriacao;

	
}
