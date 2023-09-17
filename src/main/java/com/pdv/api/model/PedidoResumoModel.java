package com.pdv.api.model;

import com.pdv.domain.model.ItemPedido;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

@Setter
@Getter
public class PedidoResumoModel {

	private Long codigo;
	private BigDecimal subtotal;
	private BigDecimal taxaFrete;
	private BigDecimal valorTotal;
	private String status;
	private OffsetDateTime dataCriacao;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PedidoResumoModel that)) return false;
		return Objects.equals(getCodigo(), that.getCodigo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigo());
	}
}
