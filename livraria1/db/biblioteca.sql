create table livro (
	idlivro serial primary key,
	nome varchar(60) not null,
	genero varchar(25) not null,
	lancamento date not null
);

alter table livro rename column
nome to titulo;

create table cliente (
	cpf varchar(14) primary key not null,
	nome varchar(120) not null,
	email varchar(200) not null
);

create table