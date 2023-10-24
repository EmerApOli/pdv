
create table usuario (
  id bigint not null auto_increment,
  matriular  varchar(10) not null,
  dv  varchar(10) not null,
  nome varchar(10) not null,
  dt_admissao varchar(10) not null,
  dt_nasc varchar(10) not null,
  cpf varchar(10) not null,
  pis varchar(10) not null,
  email varchar(10) not null,
  rg varchar(10) not null,
  orgao_emissor varchar(10) not null,
  uf_emissor varchar(10) not null,
  ddd varchar(10) not null,
  celular varchar(10) not null,
  ic_def  varchar(10) not null,
  lotacao_fisica varchar(10) not null,
  lotacval_administrativa varchar(10) not null,

  primary key (id)

) engine=InnoDB default charset=utf8;