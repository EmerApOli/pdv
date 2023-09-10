package com.pdv.domain.model;

import java.io.Serializable;
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
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	//@NotBlank(message = "nome não pode ser vazio")
	//@Size(min = 5, max = 250)
	 
   @Column(name = "nome")
	private String nome;
   
   @Column(name = "login")
	private String Login;
  
   
   @Column(name = "senha")
	private String senha;
 

   
   @Column(name = "cpfcnpj")
	private String cpfcnpj;
   
   
    @Column(name = "observacao")   
	private String observacao;

    
    @Column(name = "data_nascimento")
	private Date data_nascimento;
    
    @Column(name = "data_cadastro")
	private Date data_cadastro;
	
	 @JsonIgnore
		@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
		private List<Item_Pedido> ItemPedido = new ArrayList<Item_Pedido>();



	@Override
	public int hashCode() {
		return Objects.hash(ItemPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(ItemPedido, other.ItemPedido);
	}




}






	//@ManyToOne
	//@JoinColumn(name = "endereco_codigo")
	//private Endereco endereco;

	//@OneToMany
//	private List<Telefone> telefone;