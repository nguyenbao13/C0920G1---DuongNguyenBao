use furama_resort;
-- 2. Nhân viên: bắt đầu với H|T|K VÀ tối đa 15 chars
select * from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten) <= 15;

-- 3. Khách hàng: tuổi 18-50 VÀ địa chỉ Đà Nẵng|Quảng Trị
select * from khach_hang 
where year(curdate()) - year(ngay_sinh) <= 50 and year(curdate()) - year(ngay_sinh) >= 18
and (dia_chi like "đà nẵng" or dia_chi like "quảng trị");

-- 4. Đếm mỗi khách hàng đặt phòng bao nhiêu lần, hiển thị sắp xếp tăng dần theo số lần đặt và khách hàng là diamond
select hop_dong.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, count(hop_dong.id_dich_vu) as count_hop_dong 
from hop_dong join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach 
where loai_khach.ten_loai_khach = "Diamond"
group by hop_dong.id_khach_hang
order by count_hop_dong;
    
-- 5. Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng.
select khach_hang.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.id_hop_dong, 
	dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, 
    (dich_vu.chi_phi_thue + dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong) as tong_tien
from khach_hang left join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem;
    
-- 6. Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được 
-- Khách hàng thực hiện đặt trong quý 1 của năm 2019
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where not(year(hop_dong.ngay_lam_hop_dong) = 2019 and month(hop_dong.ngay_lam_hop_dong) in(1,2,3));

-- 7. Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng 
-- được Khách hàng đặt phòng trong năm 2019.
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, 
loai_dich_vu.ten_loai_dich_vu
from dich_vu join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
join hop_dong on hop_dong.id_dich_vu = dich_vu.id_dich_vu
where year(ngay_lam_hop_dong) = 2018 and 
hop_dong.id_dich_vu not in (select hop_dong.id_dich_vu from hop_dong where year(ngay_lam_hop_dong) = 2019);

-- 8. Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
	-- cách 1
select distinct khach_hang.ho_ten from khach_hang;
	-- cách 2
select khach_hang.ho_ten from khach_hang group by ho_ten;
    -- cách 3
select khach_hang.ho_ten from khach_hang 
union select khach_hang.ho_ten from khach_hang;

-- 9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng 
-- trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_lam_hop_dong) as thang, count(month(ngay_lam_hop_dong)) as so_nguoi_dat_phong
from hop_dong where year(ngay_lam_hop_dong) = 2019
group by month(ngay_lam_hop_dong)
order by month(ngay_lam_hop_dong);
    
-- 10. Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hop_dong.id_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc, 
count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem
from hop_dong join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by hop_dong.id_hop_dong;
    
-- 11. Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dich_vu_di_kem.* from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = 'Diamond' and (khach_hang.dia_chi = 'Vinh' or khach_hang.dia_chi = 'Quảng Ngãi');

-- 12. Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 
-- 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hop_dong.id_hop_dong, nhan_vien.ho_ten as ten_nhan_vien, khach_hang.ho_ten as ten_khach, khach_hang.sdt, 
dich_vu.ten_dich_vu, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_luong_dich_vu_di_kem, hop_dong.tien_dat_coc
from khach_hang join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join nhan_vien on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
where year(hop_dong.ngay_lam_hop_dong) = 2019 and month(hop_dong.ngay_lam_hop_dong) between 10 and 12;

-- 13. Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dich_vu_di_kem.*, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as dich_vu_di_kem_nhieu_nhat from dich_vu_di_kem join hop_dong_chi_tiet 
on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.id_dich_vu_di_kem;