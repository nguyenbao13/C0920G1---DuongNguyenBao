drop database if exists products_bai5;
create database products_bai5;
use products_bai5;
create table products (
id int,
product_code varchar(15),
product_name varchar(45),
product_price int,
product_amount int,
product_description text,
product_status varchar(15)
);

insert into products (id, product_code, product_name, product_price, product_amount, product_description, product_status) value
(1, 'ss', 'samsung', 30, 4, 'galaxy note', 'avail'),
(2, 'ip', 'iphone', 30, 4, '12 pro max', 'avail'),
(3, 'vs', 'vsmart', 40, 5, 'the best', 'avail'),
(4, 'nk', 'nokia', 35, 4, 'the legend', 'avail');

ALTER TABLE products ADD INDEX idx_product_code(product_code);
EXPLAIN SELECT * FROM products WHERE product_code = 'vs';

ALTER TABLE products ADD INDEX idx_product(product_name, product_price);
EXPLAIN SELECT * FROM products WHERE product_name = 'vsmart' or product_price = 35;

create view product_views as
select product_code, product_name, product_price, product_status
from products;
select * from product_views;

CREATE OR REPLACE VIEW product_views AS
SELECT id, product_code, product_name, product_price, product_amount, product_description, product_status
FROM products
WHERE product_name = 'vsmart';
select * from product_views;

-- drop view product_views;

delimiter //
create procedure show_all_products ()
begin
select * from products;
end//
delimiter ;
call show_all_products();

DELIMITER //
CREATE PROCEDURE add_new_product (in id int, in product_code varchar(15), in product_name varchar(45), in product_price int, 
in product_amount int, in product_description text, in product_status varchar(15))
BEGIN
  insert into products value (id, product_code, product_name, product_price, product_amount, product_description, product_status);
END //
DELIMITER ;
call add_new_product(5, 'sn', 'sony', 30, 4, 'xperia 1', 'avail');

DELIMITER //
CREATE PROCEDURE update_product_by_id (in id1 int, in product_code1 varchar(15), in product_name1 varchar(45), in product_price1 int, 
in product_amount1 int, in product_description1 text, in product_status1 varchar(15))
BEGIN 
UPDATE products
SET product_code = product_code1, product_name = product_name1, product_price = product_price1, 
product_amount = product_amount1, product_description = product_description1, product_status = product_status1
WHERE id = id1;
END//
DELIMITER ;
call update_product_by_id(2, 'op', 'oppo', 30, 4, 'update', 'avail');

delimiter //
create procedure delete_product (in id1 int)
begin
delete from products
where id = id1;
end//
delimiter ;
call delete_product(4);
