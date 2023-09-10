package com.pdv.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

   
    @Column(name = "descricao")
    private String descricao;

   
   @Column(name = "valor_custo")
    private Double valor_custo;

 
   @Column(name = "valor_venda")
    private Double valor_venda;


   @Column(name = "valor_balanca")
    private Double valor_balanca;


    @Column(name = "data_validade")
    private Date data_validade;

    
   
    @Column(name = "unidade")
    private String unidade;

    @JsonIgnore
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Item_Pedido> ItemPedido = new ArrayList<Item_Pedido>();
	
    /*public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getValor_custo() {
		return valor_custo;
	}


	public void setValor_custo(Double valor_custo) {
		this.valor_custo = valor_custo;
	}


	public Double getValor_venda() {
		return valor_venda;
	}


	public void setValor_venda(Double valor_venda) {
		this.valor_venda = valor_venda;
	}


	public Double getValor_balanca() {
		return valor_balanca;
	}


	public void setValor_balanca(Double valor_balanca) {
		this.valor_balanca = valor_balanca;
	}


	public Date getData_validade() {
		return data_validade;
	}


	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}*/


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}





  

   // @Enumerated(EnumType.ORDINAL)
   // private ProdutoSubstTributaria subtributaria;




}
