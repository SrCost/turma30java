drop database if exists db_escola;
create database db_escola;
use db_escola;

create table tb_alunes(
	id bigint auto_increment, primary key(id),
    nota int(2) not null,
    nome varchar(50) not null,
    turma int(2) not null,
    periodo varchar(10) not null
);

select * from tb_alunes;

insert into tb_alunes(nota, nome, turma, periodo) values(8, "Rodrigo Roseo", 30, "Noite");
insert into tb_alunes(nota, nome, turma, periodo) values(7, "Caio Arruda", 30, "Noite");
insert into tb_alunes(nota, nome, turma, periodo) values(8, "Ester Gomes", 30, "Noite");
insert into tb_alunes(nota, nome, turma, periodo) values(7, "Carol Gonsalez", 30, "Noite");
insert into tb_alunes(nota, nome, turma, periodo) values(9, "Emerson Santana ", 30, "Noite");
insert into tb_alunes(nota, nome, turma, periodo) values(8, "Giovanna Santos", 30, "Noite");
insert into tb_alunes(nota, nome, turma, periodo) values(3, "Bruna Amora", 31, "Tarde");
insert into tb_alunes(nota, nome, turma, periodo) values(5, "Aline Soares", 29, "Manhã");

select * from tb_alunes where nota > 7;
select * from tb_alunes where nota < 7;

update tb_alunes set nota = 10 where id = 5;