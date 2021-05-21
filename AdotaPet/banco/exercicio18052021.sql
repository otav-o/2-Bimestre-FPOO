-- ORM Fundamentos de Programação Orientada a Objetos

create database petshop;

CREATE TABLE cachorro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    datanasc DATE,
    sexo ENUM('M', 'F'),
    raca VARCHAR(30),
    vacinado BOOLEAN,
    castrado BOOLEAN,
    temperamento INT
);

create table gato (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30),
    datanasc date,
    sexo enum('M', 'F'),
    raca varchar(30),
    cor varchar(30),
    domesticado boolean
);

create table usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30),
    email varchar(50),
    datanasc date,
    login varchar(30),
    senha varchar(30),
    tipo 
);

create table endereco (
	id INT PRIMARY KEY AUTO_INCREMENT,
	rua varchar(50),
	bairro varchar(50),
	cidade varchar(50),
	estado varchar(50),
	cep varchar(11),
	complemento varchar(50)
);



create table tipo_usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
)