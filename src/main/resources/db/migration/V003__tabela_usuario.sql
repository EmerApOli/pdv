
create table usuario (
  id bigint not null auto_increment,
  matricula  varchar(10)  null,
  dv  varchar(10) null,
  nome varchar(10)  null,
  dt_admissao varchar(10)  null,


  primary key (id)

) engine=InnoDB default charset=utf8;