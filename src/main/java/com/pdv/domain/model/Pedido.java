package com.pdv.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @JoinColumn(name = "subtotal")
    private BigDecimal subtotal;
    @JoinColumn(name = "taxafrete")
    private BigDecimal taxaFrete;
    @JoinColumn(name = "valorTotal")
    private BigDecimal valorTotal;

   // @Embedded
   // private Endereco enderecoEntrega;

 //   @Enumerated(EnumType.STRING)
   // private StatusPedido status = StatusPedido.CRIADO;

    @JoinColumn(name = "pedido_codigo")
    private OffsetDateTime dataCriacao;

    @JoinColumn(name = "dataconfirmacao")
    private OffsetDateTime dataConfirmacao;
    @JoinColumn(name = "datacancelamento")
    private OffsetDateTime dataCancelamento;
    @JoinColumn(name = "dataentrega")
    private OffsetDateTime dataEntrega;

  //  @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name = "pagamentotipo")
  //  private PagamentoTipo pagamentoTipo;

 


   @JsonIgnore
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<Item_Pedido> ItemPedido= new ArrayList<>();


}