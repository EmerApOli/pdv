create table pedido (
  id bigint not null auto_increment,
  subtotal decimal(10,2) not null,
  taxa_frete decimal(10,2) not null,
  valor_total decimal(10,2) not null,
  status varchar(10) not null,
  data_criacao datetime not null,
  data_confirmacao datetime null,
  data_cancelamento datetime null,
  data_entrega datetime null,

  primary key (id)


) engine=InnoDB default charset=utf8;
 insert into pedido(subtotal,
 taxa_frete,
 valor_total,
 status,
 data_criacao,
 data_confirmacao,
 data_cancelamento,
 data_entrega) values ( 3.2,23.4,4,'ENTREGUE','2023-09-15','2023-09-15','2023-09-15','2023-09-15');

create table item_pedido (
  id bigint not null auto_increment,
  quantidade smallint(6) not null,
  preco_unitario decimal(10,2) not null,
  preco_total decimal(10,2) not null,
  observacao varchar(255) null,
   desconto decimal(10,2) null,
  pedido_id bigint not null,
  produto_id bigint not null,

  primary key (id),
  unique key uk_item_pedido_produto (pedido_id, produto_id),

  constraint fk_item_pedido_pedido foreign key (pedido_id) references pedido (id),
  constraint fk_item_pedido_produto foreign key (produto_id) references produto (id)
) engine=InnoDB default charset=utf8;





--insert into item_pedido(quantidade, preco_unitario , preco_total , observacao , desconto, pedido_id,produto_id)
--values (23,4.5,5.4,'primeiro',1,1);
