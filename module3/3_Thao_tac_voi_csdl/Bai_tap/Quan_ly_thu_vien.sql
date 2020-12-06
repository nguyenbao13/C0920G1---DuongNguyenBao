-- Sách, loại sách, thẻ thư viện, phiếu mượn
drop database if exists library;
create database library;
use library;
create table books (
-- mã sách, tên sách, nhà xuất bản, tác giả, năm xuất bản, số lần xuất bản, giá, ảnh
book_id int primary key,
book_name varchar(45),
releaser varchar(45),
author varchar(45),
release_year int,
release_times int,
price float,
image varchar(255)
);
