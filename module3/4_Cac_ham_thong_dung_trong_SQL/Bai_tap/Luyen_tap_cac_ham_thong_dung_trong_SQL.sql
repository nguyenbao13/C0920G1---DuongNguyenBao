drop database if exists bai_tap_ham;
create database bai_tap_ham;
use bai_tap_ham;
create table hoc_vien (
id int,
ten varchar(10),
tuoi int,
khoa_hoc varchar(10),
so_tien int
);

insert into hoc_vien(id, ten, tuoi, khoa_hoc, so_tien) value (1, 'Hoang', 21, 'CNTT', 400000);
insert into hoc_vien(id, ten, tuoi, khoa_hoc, so_tien) value (2, 'Viet', 19, 'DTVT', 320000);
insert into hoc_vien(id, ten, tuoi, khoa_hoc, so_tien) value (3, 'Thanh', 18, 'KTDN', 400000);
insert into hoc_vien(id, ten, tuoi, khoa_hoc, so_tien) value (4, 'Nhan', 19, 'CK', 450000);
insert into hoc_vien(id, ten, tuoi, khoa_hoc, so_tien) value (5, 'Huong', 20, 'TCNH', 500000);
insert into hoc_vien(id, ten, tuoi, khoa_hoc, so_tien) value (5, 'Huong', 20, 'TCNH', 200000);

-- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong
select * from hoc_vien where ten = 'Huong';
-- Viết câu lệnh lấy ra tổng số tiền của Huong
select sum(so_tien) as tien_cua_Huong from hoc_vien where ten = 'Huong';
-- Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp
select distinct ten from hoc_vien;
