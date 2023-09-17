create table produto (
  id bigint not null auto_increment,
  nome  varchar(255) null,
  descricao  varchar(255) null,
  preco_unitario decimal(10,2) not null,
  ativo  boolean,
  primary key (id),
  unique key uk_produto (id)
) engine=InnoDB default charset=utf8;