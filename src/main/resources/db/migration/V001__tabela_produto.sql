create table produto (
  id bigint not null auto_increment,
  nome  varchar(255) null,
  descricao  varchar(255) null,
  preco decimal(10,2) not null,
  ativo  boolean,
  primary key (id),
  unique key uk_produto (id)
) engine=InnoDB default charset=utf8;

insert into produto(nome,descricao,preco,ativo) values ('arroz','arroz doce',4000,1);
insert into produto(nome,descricao,preco,ativo) values ('feijão','feijão doce',10000,1);
insert into produto(nome,descricao,preco,ativo) values ('paçoca','de milho ',50000,1);
