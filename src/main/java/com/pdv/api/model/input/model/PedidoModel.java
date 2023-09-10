package com.pdv.api.model.input.model;



import com.pdv.domain.model.Item_Pedido;


import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoModel {


    private Long codigo;

    private BigDecimal subtotal;

    private BigDecimal taxaFrete;

    private BigDecimal valorTotal;


    private OffsetDateTime dataCriacao;


    private OffsetDateTime dataConfirmacao;

    private OffsetDateTime dataCancelamento;

    private OffsetDateTime dataEntrega;



    private List<Item_Pedido> ItemPedido;




}
