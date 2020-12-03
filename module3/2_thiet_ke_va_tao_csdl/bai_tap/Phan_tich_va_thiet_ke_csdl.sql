drop database if exists automobile_showroom;
create database automobile_showroom;
use automobile_showroom;
create table offices (
office_code varchar(10) primary key,
city varchar(50) not null,
phone varchar(50) not null,
address_line_1 varchar(50) not null,
address_line_2 varchar(50) null,
state varchar(50) null,
country varchar(50) not null,
postal_code varchar(15) not null
);
create table employees (
employee_number int primary key,
last_name varchar(50) not null,
first_name varchar(50) not null,
email varchar(100) not null,
job_title varchar(50) not null,
report_to int,
foreign key(report_to) references employees(employee_number),
office_code varchar(10),
foreign key(office_code) references offices(office_code)
);
create table customers (
customer_number int primary key,
customer_name varchar(50) not null,
contact_last_name varchar(50) not null,
contact_first_name varchar(50) not null,
phone varchar(50) not null,
address_line_1 varchar(50) not null,
address_line_2 varchar(50) null,
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(15) not null,
country varchar(50) not null,
credit_limit float null,
sales_rep_employee_number int,
foreign key(sales_rep_employee_number) references employees(employee_number)
);
create table product_lines (
product_line varchar(50) primary key,
text_description text null,
image varchar(255) null
);
create table products (
product_code varchar(15) primary key,
product_name varchar(70) not null,
product_scale varchar(10) not null,
product_vendor varchar(50) not null,
product_description text not null,
quantity_in_stock int not null,
buy_price float not null,
msrp float not null,
product_line varchar(50),
foreign key(product_line) references product_lines(product_line)
);
create table orders (
order_number int primary key,
order_date date not null,
required_date date not null,
shipped_date date null,
`status` varchar(15) not null,
comments text null,
quantity_ordered int not null,
price_each float not null,
customer_number int,
foreign key(customer_number) references customers(customer_number)
);
create table order_details (
product_code varchar(15),
foreign key(product_code) references products(product_code),
order_number int,
foreign key(order_number) references orders(order_number)
);
create table payments (
customer_number int not null,
foreign key(customer_number) references customers(customer_number),
check_number varchar(50) not null,
payment_date date not null,
amount float not null,
foreign key(customer_number) references customers(customer_number)
);

