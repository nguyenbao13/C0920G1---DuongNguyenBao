drop database if exists furama_resort;
create database furama_resort;
use furama_resort;
create table vi_tri (
id_vi_tri int primary key,
ten_vi_tri varchar(45)
);
create table trinh_do (
id_trinh_do int primary key,
trinh_do varchar(45)
);
create table bo_phan (
id_bo_phan int primary key,
ten_bo_phan varchar(45)
);
create table nhan_vien (
id_nhan_vien int primary key,
ho_ten int,
id_vi_tri int,
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
id_trinh_do int,
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
id_bo_phan int,
foreign key(id_bo_phan) references bo_phan(id_bo_phan),
ngay_sinh date,
so_cmnd varchar(45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45)
);
create table dich_vu_di_kem (
id_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung varchar(45)
);
create table loai_khach (
id_loai_khach int primary key,
ten_loai_khach varchar(45)
);
create table kieu_thue (
id_kieu_thue int primary key,
ten_kieu_thue varchar(45),
gia int
);
create table loai_dich_vu (
id_loai_dich_vu int primary key,
ten_loai_dich_vu varchar(45)
);
create table khach_hang (
id_khach_hang int primary key,
id_loai_khach int,
foreign key(id_loai_khach) references loai_khach(id_loai_khach),
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45)
);
create table dich_vu (
id_dich_vu int primary key,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue varchar(45),
foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
id_loai_dich_vu int,
foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
trang_thai varchar(45)
);
create table hop_dong (
id_hop_dong int primary key,
id_nhan_vien int,
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
id_khach_hang int,
foreign key(id_khach_hang) references khach_hang(id_khach_hang),
id_dich_vu int,
foreign key(id_dich_vu) references dich_vu(id_dich_vu),
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int
);
create table hop_dong_chi_tiet (
id_hop_dong_chi_tiet int,
id_hop_dong int,
foreign key(id_hop_dong) references hop_dong(id_hop_dong),
id_dich_vu_di_kem int,
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
so_luong int
);

insert into vi_tri (id_vi_tri, ten_vi_tri) value (1, 'Giám đốc');
insert into vi_tri (id_vi_tri, ten_vi_tri) value (2, 'Quản lý');
insert into vi_tri (id_vi_tri, ten_vi_tri) value (3, 'Giám sát');
insert into vi_tri (id_vi_tri, ten_vi_tri) value (4, 'Chuyên viên');
insert into vi_tri (id_vi_tri, ten_vi_tri) value (5, 'Lễ tân');
insert into vi_tri (id_vi_tri, ten_vi_tri) value (6, 'Phục vụ');

insert into trinh_do (id_trinh_do, trinh_do) value(1, 'Trung cấp');
insert into trinh_do (id_trinh_do, trinh_do) value(2, 'Cao đẳng');
insert into trinh_do (id_trinh_do, trinh_do) value(3, 'Đại học');
insert into trinh_do (id_trinh_do, trinh_do) value(4, 'Sau đại học');

insert into bo_phan (id_bo_phan, ten_bo_phan) value (1, 'Quản lý');
insert into bo_phan (id_bo_phan, ten_bo_phan) value (2, 'Hành chính');
insert into bo_phan (id_bo_phan, ten_bo_phan) value (3, 'Sale – Marketing');
insert into bo_phan (id_bo_phan, ten_bo_phan) value (4, 'Phục vụ');

insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai_kha_dung)
value (1, 'massage', 123, 123, 'ok');
insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai_kha_dung)
value (2, 'karaoke', 123, 123, 'ok');
insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai_kha_dung)
value (3, 'thức ăn', 123, 123, 'ok');
insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai_kha_dung)
value (4, 'nước uống', 123, 123, 'ok');
insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai_kha_dung)
value (5, 'xe tham quan resort', 123, 123, 'ok');

-- insert into nhan_vien (id_nhan_vien , ho_ten , id_vi_tri , id_trinh_do , id_bo_phan , ngay_sinh, so_cmnd ,luong , sdt , email , dia_chi)
-- value (1,1 , 1 , 1, 1 , '1999-12-12' , 123123123 , 123123123 ,12312312 , 'abc@abc.com' , 'đà nẵng');

-- insert into nhan_vien (id_nhan_vien , ho_ten , id_vi_tri , id_trinh_do , id_bo_phan , ngay_sinh, so_cmnd ,luong , sdt , email , dia_chi)
-- value (2,2 , 2 , 2, 2 , '1999-12-12' , 123123123 , 123123123 ,12312312 , 'abc@abc.com' , 'đà nẵng');

-- insert into nhan_vien (id_nhan_vien , ho_ten , id_vi_tri , id_trinh_do , id_bo_phan , ngay_sinh, so_cmnd ,luong , sdt , email , dia_chi)
-- value (3,3 , 3 , 3, 3 , '1999-12-12' , 123123123 , 123123123 ,12312312 , 'abc@abc.com' , 'quảng nam');

-- insert into nhan_vien (id_nhan_vien , ho_ten , id_vi_tri , id_trinh_do , id_bo_phan , ngay_sinh, so_cmnd ,luong , sdt , email , dia_chi)
-- value (4,4 , 4 , 4, 4 , '1999-12-12' , 123123123 , 123123123 ,12312312 , 'abc@abc.com' , 'đà nẵng');

insert into loai_khach (id_loai_khach, ten_loai_khach)
value (1,'Mai nam khánh');

insert into loai_khach (id_loai_khach, ten_loai_khach)
value (2,'Trần Quốc Hưng');

insert into loai_khach (id_loai_khach, ten_loai_khach)
value (3,'Nguyễn Văn Phúc');

insert into loai_khach (id_loai_khach, ten_loai_khach)
value (4,'Lê nguyễn Phúc Khang');

insert into khach_hang (id_khach_hang, id_loai_khach, ho_ten , ngay_sinh , so_cmnd , sdt , email , dia_chi)
value (1,1,'Mai Nam Khanh' , '2000-12-12' , 1313213213,1312312, 'abc@anc.com' , 'đà nẵng');

insert into khach_hang (id_khach_hang, id_loai_khach, ho_ten , ngay_sinh , so_cmnd , sdt , email , dia_chi)
value (2,2,'Trần Quốc HƯng' , '2002-12-12' , 1313213213,1312312, 'abc@anc.com' , 'quảng binh');

insert into khach_hang (id_khach_hang, id_loai_khach, ho_ten , ngay_sinh , so_cmnd , sdt , email , dia_chi)
value (3,3,'Nguyễn Văn Phúc' , '1999-12-12' , 1313213213,1312312, 'abc@anc.com' , 'đà nẵng');

insert into khach_hang (id_khach_hang, id_loai_khach, ho_ten , ngay_sinh , so_cmnd , sdt , email , dia_chi)
value (4,4,'Lê Nguyễn Phúc Khang' , '1997-12-12' , 1313213213,1312312, 'abc@anc.com' , 'Hội An');

insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet , id_hop_dong , id_dich_vu_di_kem , so_luong)
value (2,2,2,13);

insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet , id_hop_dong , id_dich_vu_di_kem , so_luong)
value (3,3,3,14);


insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet , id_hop_dong , id_dich_vu_di_kem , so_luong)
value (4,4,4,15);


insert into hop_dong (id_hop_dong , id_nhan_vien , id_khach_hang , id_dich_vu , ngay_lam_hop_dong , ngay_ket_thuc, tien_dat_coc ,tong_tien)
value (2,2 , 2 , 2, '1999-12-12', '1999-12-12' , 123123123 , 123123123 );

insert into hop_dong (id_hop_dong , id_nhan_vien , id_khach_hang , id_dich_vu , ngay_lam_hop_dong , ngay_ket_thuc, tien_dat_coc ,tong_tien)
value (3,3 , 3 , 3, '1999-12-12', '1999-12-12' , 123123123 , 123123123 );

insert into hop_dong (id_hop_dong , id_nhan_vien , id_khach_hang , id_dich_vu , ngay_lam_hop_dong , ngay_ket_thuc, tien_dat_coc ,tong_tien)
value (4,4 , 4 , 4, '1999-12-12', '1999-12-12' , 123123123 , 123123123 );

insert into loai_dich_vu (id_loai_dich_vu , ten_loai_dich_vu) 
value (1,'vip');

insert into loai_dich_vu (id_loai_dich_vu , ten_loai_dich_vu) 
value (2,'thường');

insert into loai_dich_vu (id_loai_dich_vu , ten_loai_dich_vu) 
value (3,'trung bình');

insert into loai_dich_vu (id_loai_dich_vu , ten_loai_dich_vu) 
value (4,'yếu');

insert into kieu_thue (id_kieu_thue , ten_kieu_thue , gia)
value (1 , 'vip');

insert into kieu_thue (id_kieu_thue , ten_kieu_thue , gia)
value (2 , 'thường');

insert into kieu_thue (id_kieu_thue , ten_kieu_thue , gia)
value (3 , 'trung bình');

insert into kieu_thue (id_kieu_thue , ten_kieu_thue , gia)
value (4 , 'yếu');


insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
value (1,'du lịch' , 123, 123,13 ,1231312, 1 ,1 ,'trong');

insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
value (2,'ở nhà' , 123, 123,13 ,1231312, 1 ,1 ,'trong');

insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
value (3,'đi chơi' , 123, 123,13 ,1231312, 1 ,1 ,'trong');

insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
value (4,'ăn ngủ' , 123, 123,13 ,1231312, 1 ,1 ,'trong');