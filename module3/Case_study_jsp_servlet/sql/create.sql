drop database if exists furama_jsp_servlet;
create database furama_jsp_servlet;
use furama_jsp_servlet;
create table customer_type (
customer_type_id int primary key,
customer_type_name varchar(45)
);
create table customer (
customer_id int primary key auto_increment,
customer_type_id int,
foreign key (customer_type_id) references customer_type (customer_type_id),
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45)
);