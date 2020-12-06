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
ho_ten varchar(45),
id_vi_tri int,
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
id_trinh_do int,
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
id_bo_phan int,
foreign key(id_bo_phan) references bo_phan(id_bo_phan),
ngay_sinh date,
so_cmnd varchar(45),
luong int,
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
id_kieu_thue int,
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
