use furama_resort;

insert into vi_tri (id_vi_tri, ten_vi_tri)
value (1, 'Giám đốc'), (2, 'Quản lý'), (3, 'Giám sát'), (4, 'Chuyên viên'), (5, 'Lễ tân'), (6, 'Phục vụ');

insert into trinh_do (id_trinh_do, trinh_do)
value (1, 'Trung cấp'), (2, 'Cao đẳng'), (3, 'Đại học'), (4, 'Sau đại học');

insert into bo_phan (id_bo_phan, ten_bo_phan)
value (1, 'Quản lý'), (2, 'Hành chính'), (3, 'Sale – Marketing'), (4, 'Phục vụ');

-- Nhân viên: bắt đầu với H|T|K VÀ tối đa 15 chars
insert into nhan_vien (id_nhan_vien, ho_ten, id_vi_tri, id_trinh_do, id_bo_phan, ngay_sinh, so_cmnd, luong, sdt, email, dia_chi) value
(1, 'Hung', 1, 1, 1, '1999-12-12', 123123123, 123123123, 12312312, 'abc@abc.com', 'đà nẵng'),
(2, 'Nguyen Tien Van', 1, 1, 1, '1999-12-12', 123123123, 123123123, 12312312, 'abc@abc.com', 'đà nẵng'),
(3, 'Khang', 1, 1, 1, '1999-12-12', 123123123, 123123123, 12312312, 'abc@abc.com', 'đà nẵng'),
(4, 'Khanh Nguyen', 1, 1, 1, '1999-12-12', 123123123, 123123123, 12312312, 'abc@abc.com', 'đà nẵng'),
(5, 'Tam', 1, 1, 1, '1999-12-12', 123123123, 123123123, 12312312, 'abc@abc.com', 'đà nẵng'),
(6, 'Bao Duong', 1, 1, 1, '1999-12-12', 123123123, 123123123, 12312312, 'abc@abc.com', 'đà nẵng');

insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai_kha_dung) value
(1, 'massage', 123, 123, 'ok'),
(2, 'karaoke', 123, 123, 'ok'),
(3, 'thức ăn', 123, 123, 'ok'),
(4, 'nước uống', 123, 123, 'ok'),
(5, 'xe tham quan resort', 123, 123, 'ok');

insert into loai_khach (id_loai_khach, ten_loai_khach)
value (1, 'Diamond'), (2, 'Platinium'), (3, 'Gold'), (4, 'Silver'), (5, 'Member');

insert into kieu_thue (id_kieu_thue, ten_kieu_thue, gia)
value (1, 'năm', 456), (2, 'tháng', 345), (3, 'ngày', 234), (4, 'giờ', 123);

insert into loai_dich_vu (id_loai_dich_vu, ten_loai_dich_vu)
value (1,'villa'), (2,'house'), (3,'room');

insert into khach_hang (id_khach_hang, id_loai_khach, ho_ten, ngay_sinh, so_cmnd, sdt, email, dia_chi) value
(1, 1, 'Trần văn A', '1950-12-12', 1313213213, 1312312, 'abc@anc.com', 'đà nẵng'),
(2, 2, 'Nguyễn Thị B', '2005-12-12', 1313213213, 1312312, 'abc@anc.com', 'quảng bình'),
(3, 3, 'Lê Văn C', '1999-12-12', 1313213213, 1312312, 'abc@anc.com', 'quảng trị'),
(4, 4, 'Trương Thị D', '1997-12-12', 1313213213, 1312312, 'abc@anc.com', 'đà nẵng');

-- insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
-- value (1,'du lịch' , 123, 123,13 ,1231312, 1 ,1 ,'trong');
-- insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
-- value (2,'ở nhà' , 123, 123,13 ,1231312, 1 ,1 ,'trong');
-- insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
-- value (3,'đi chơi' , 123, 123,13 ,1231312, 1 ,1 ,'trong');
-- insert into dich_vu (id_dich_vu , ten_dich_vu , dien_tich , so_tang , so_nguoi_toi_da , chi_phi_thue , id_kieu_thue,id_loai_dich_vu, trang_thai)
-- value (4,'ăn ngủ' , 123, 123,13 ,1231312, 1 ,1 ,'trong');

-- insert into hop_dong (id_hop_dong , id_nhan_vien , id_khach_hang , id_dich_vu , ngay_lam_hop_dong , ngay_ket_thuc, tien_dat_coc ,tong_tien)
-- value (2,2 , 2 , 2, '1999-12-12', '1999-12-12' , 123123123 , 123123123 );
-- insert into hop_dong (id_hop_dong , id_nhan_vien , id_khach_hang , id_dich_vu , ngay_lam_hop_dong , ngay_ket_thuc, tien_dat_coc ,tong_tien)
-- value (3,3 , 3 , 3, '1999-12-12', '1999-12-12' , 123123123 , 123123123 );
-- insert into hop_dong (id_hop_dong , id_nhan_vien , id_khach_hang , id_dich_vu , ngay_lam_hop_dong , ngay_ket_thuc, tien_dat_coc ,tong_tien)
-- value (4,4 , 4 , 4, '1999-12-12', '1999-12-12' , 123123123 , 123123123 );

-- insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet , id_hop_dong , id_dich_vu_di_kem , so_luong)
-- value (2,2,2,13);
-- insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet , id_hop_dong , id_dich_vu_di_kem , so_luong)
-- value (3,3,3,14);
-- insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet , id_hop_dong , id_dich_vu_di_kem , so_luong)
-- value (4,4,4,15);