use furama_resort;
-- Nhân viên: bắt đầu với H|T|K VÀ tối đa 15 chars
select * from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten) <= 15;

-- Khách hàng: tuổi 18-50 VÀ địa chỉ Đà Nẵng|Quảng Trị
select * from khach_hang 
where year(curdate()) - year(ngay_sinh) <= 50 and year(curdate()) - year(ngay_sinh) >= 18
and (dia_chi like "đà nẵng" or dia_chi like "quảng trị");

-- Đếm mỗi khách hàng đặt phòng bao nhiêu lần, hiển thị sắp xếp tăng dần theo số lần đặt và khách hàng là diamond
select hop_dong.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, count(hop_dong.id_dich_vu) as count_hop_dong 
	from hop_dong join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
	join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach 
	where loai_khach.ten_loai_khach = "Diamond"
	group by hop_dong.id_khach_hang
    order by count_hop_dong;
    
-- Hien thi tong tien
select khachhang.id_khach_hang, khachhang.ho_ten, loaikhachhang.ten_loai_khach_hang, hopdong.id_hop_dong, 
	dichvu.ten_dich_vu, hopdong.ngay_lam_hop_dong, hopdong.ngay_ket_thuc, 
    (dichvu.chi_phi_thue + dichvudikem.gia * hopdongchitiet.soluong) as tongtien
    from khachhang  left join hopdong on hopdong.khach_hang_id = khachhang.id_khach_hang
		left join loaikhachhang on khachhang.loai_khach_hang_id = loaikhachhang.id_loai_khach_hang
		left join dichvu on hopdong.dich_vu_id = dichvu.id_dich_vu
		left join hopdongchitiet on hopdong.id_hop_dong = hopdongchitiet.hop_dong_id
		left join dichvudikem on hopdongchitiet.dv_di_kem_id = dichvudikem.id_dv_di_kem;
    
-- hiển thị dịch vụ chưa được khách hàng đặt từ quý 1 năm 2019
select dichvu.id_dich_vu, dichvu.ten_dich_vu, dichvu.dien_tich, dichvu.chi_phi_thue, loaidichvu.ten_loai_dich_vu, hopdong.ngay_lam_hop_dong
	from dichvu join loaidichvu on dichvu.loai_dich_vu_id = loaidichvu.id_loai_dich_vu 
		join hopdong on dichvu.id_dich_vu = hopdong.dich_vu_id
        where not (select count(hopdong.ngay_lam_hop_dong) from hopdong where year(hopdong.ngay_lam_hop_dong) >= 2019) >= 1;
-- Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
	-- cách 1
select distinct khachhang.ho_ten from khachhang;
	-- cách 2
    -- cách 3
    
-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hopdong.ngay_lam_hop_dong) as thang, count( distinct khachhang.ho_ten) as soluong_khachhang
    from hopdong join khachhang on hopdong.khach_hang_id = khachhang.id_khach_hang
    where year(hopdong.ngay_lam_hop_dong) = 2020
    group by month(hopdong.ngay_lam_hop_dong);
    
-- Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hopdong.id_hop_dong, hopdong.ngay_lam_hop_dong, hopdong.ngay_ket_thuc, hopdong.tien_da_coc, count(hopdongchitiet.id_hd_chi_tiet)
	from hopdong join hopdongchitiet on hopdong.id_hop_dong = hopdongchitiet.hop_dong_id
    group by hopdong.id_hop_dong;
    
-- Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dichvudikem.* from dichvudikem 
	join hopdongchitiet on dichvudikem.id_dv_di_kem = hopdongchitiet.dv_di_kem_id
	join hopdong on hopdongchitiet.hop_dong_id = hopdong.id_hop_dong
    join khachhang on hopdong.khach_hang_id = khachhang.id_khach_hang
    join loaikhachhang on khachhang.loai_khach_hang_id = loaikhachhang.id_loai_khach_hang
    where loaikhachhang.ten_loai_khach_hang = 'Diamond' and (khachhang.diachi = 'Vinh' or khachhang.diachi = 'Quảng Ngãi');

-- Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết)
-- , TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hopdong.id_hop_dong, nhanvien.ho_ten as ten_nv, khachhang.ho_ten as ten_khach
	, khachhang.sdt, dichvu.ten_dich_vu, count(hopdongchitiet.dv_di_kem_id), hopdong.tien_da_coc
    from khachhang join hopdong on khachhang.id_khach_hang = hopdong.khach_hang_id
    join nhanvien on nhanvien.id_nhan_vien = hopdong.nhan_vien_id
    join hopdongchitiet on hopdongchitiet.hop_dong_id = hopdong.id_hop_dong
    join dichvu on hopdong.dich_vu_id = dichvu.id_dich_vu
    where year(hopdong.ngay_lam_hop_dong) = 2019 and (month(hopdong.ngay_lam_hop_dong) between 10 and 12);

-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dichvudikem.*, count(hopdongchitiet.id_hd_chi_tiet) from dichvudikem join hopdongchitiet on dichvudikem.id_dv_di_kem = hopdongchitiet.dv_di_kem_id
	group by dichvudikem.id_dv_di_kem