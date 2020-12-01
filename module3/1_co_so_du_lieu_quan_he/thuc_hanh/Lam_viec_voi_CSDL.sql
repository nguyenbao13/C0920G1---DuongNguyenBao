SELECT * FROM classicmodels.customers;
select * from classicmodels.customers where customerName = 'Atelier graphique';
select * from classicmodels.customers where customerName like '%A%' limit 0, 30;
select * from classicmodels.customers where city in ('nantes','las vegas','warszawa','nyc') limit 0,30;