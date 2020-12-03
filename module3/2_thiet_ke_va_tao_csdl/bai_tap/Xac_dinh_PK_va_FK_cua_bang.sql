drop database if exists bank_account;
create database bank_account;
use bank_account;
create table customers (
customer_number int primary key,
fullname varchar(50),
address varchar(50),
email varchar(50),
phone int
);

create table accounts (
account_number int primary key,
account_type varchar(50),
`date` date,
balance float,
customer_number int,
foreign key(customer_number) references customers(customer_number)
);

create table transactions (
tran_number int primary key,
account_number int,
`date` date,
amounts float,
descriptions varchar(255),
foreign key(account_number) references accounts(account_number)
);