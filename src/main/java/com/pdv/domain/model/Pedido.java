package com.pdv.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity

public class Pedido {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal subtotal;
	private BigDecimal taxaFrete;
	private BigDecimal valorTotal;


	
	@Enumerated(EnumType.STRING)
	private StatusPedido status = StatusPedido.CRIADO;
	
	@CreationTimestamp
	private OffsetDateTime dataCriacao;

	private OffsetDateTime dataConfirmacao;
	private OffsetDateTime dataCancelamento;
	private OffsetDateTime dataEntrega;








	@JsonIgnoreProperties
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private Collection<ItemPedido> itens = new ArrayList<>();

	public void calcularValorTotal() {
		getItens().forEach(ItemPedido::calcularPrecoTotal);

		this.subtotal = getItens().stream()
				.map(item -> {
					BigDecimal precoTotal = item.getPrecoTotal();
					return precoTotal;
				})
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	//	this.valorTotal = this.subtotal.add(this.taxaFrete);

 public void calcularDesconto(){


		/// 1 estou na breach emerson - 1 alteração

	    ///passei para breach remota  para fazer o commit- 1- alteração.

	   //solicitado tirar o limite

	   //commitar sem merger

	 //entrou o calor na equipe e omerson alterou a memsma linha

	 getItens().stream()
			 .filter(e-> {
					 return e.getQuantidade() < 10 && e.getQuantidade() > 5  && e.getObservacao().equals("CUIDADO");
             })

			 .forEach(item->item.setDesconto(new BigDecimal(String.valueOf(item.getPrecoUnitario().multiply(BigDecimal.valueOf(0.10))))));




 }



}
