drop database if exists baitap; 
create database baitap;
use baitap;
create table categories (
	id int,
    `name` varchar(50),
    `description` varchar(255)
);
insert into categories values (1,"bao","hahaha"),(2,"nguyen","hihihi");
create table suppliers (
	id int,
    `name` varchar(100),
    email varchar(50),
    phonenumber varchar(50),
    address varchar(255)
);
create table customers (
	id varchar(50),
    firstname varchar(50),
    lastname varchar(50),
    phonenumber varchar(50),
    address varchar(255),
    email varchar(50),
    birthday date
);
insert into customers values ("1", "bao", "duong", "0123", "2/1ndt", "bao@mail.com","2000/12/13");
create table employees (
	id varchar(50),
    firstname varchar(50),
    lastname varchar(50),
    phonenumber varchar(50),
    address varchar(255),
    email varchar(50),
    birthday date
);
create table products (
	id int,
    `name` varchar(50),
    umageurl varchar(255),
    price int,
    discount int,
    stock int,
    categoryid int,
    supplierid int,
    `description` varchar(255)
);
create table orders (
	id int,
    createddate datetime,
    shippeddate datetime,
    `status` varchar(50),
    `description` varchar(255),
    shippingaddress varchar(255),
    shippingcity varchar(50),
    paymenttype varchar(20),
    customerid varchar(50),
    employeeid varchar(50)
);
insert into orders values ("1","2019-6-3 5:45:45","2019-6-3 5:45:45","a","b","c","d","e","f","g");
create table orderdetails (
	id int,
    orderid int,
    productid int,
    quantity int
);