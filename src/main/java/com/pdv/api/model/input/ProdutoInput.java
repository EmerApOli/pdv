package com.pdv.api.model.input;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProdutoInput {

	//@NotBlank
	private String nome;
	
//	@NotBlank
	private String descricao;
	
	//@NotNull
//	@PositiveOrZero
	private BigDecimal preco;
	
//	@NotNull
	private Boolean ativo;
	
}
