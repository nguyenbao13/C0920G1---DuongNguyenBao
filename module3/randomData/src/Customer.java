public class Customer {
    public static void main(String[] args) {
        //Ho va Ten
        String[] arrHo = {"Nguyen", "Tran", "Le", "Ho", "Pham"};
        String[] arrTenLot = {"Van", "Thi", "Thien", "Thanh", "Duong"};
        String[] arrTen = {"Nhan", "Trang", "Anh", "Bao", "Long", "Khanh", "Hiep", "Huy", "Ly", "Tien", "Trinh", "Phuc"};
        //Ngay sinh
        String[] arrDiaChi = {"Le Duan", "Ham Nghi", "Hoang Hoa Tham", "Dien Bien Phu", "Bach Dang", "Nguyen Hoang",
                "Nguyen Van Linh", "Hoang Dieu", "Ton Duc Thang", "Hai Phong", "Quang Trung", "Dong Da"};
        String[] arrThanhPho = {"Da Nang", "Quang Nam", "Hue", "Vinh", "Quang Ngai", "Quang Tri", "Ha Noi", "HCM"};
        //email
        //address
        //(customers.id_customer, id_typeCustomer(1-5), name, birthday, cmnd, phone number, email, dia chi);
        for (int i = 0; i < 1000 ; i++) {
            int namSinh = 1960 + (int) (Math.random() * ((2018 - 1960) + 1));
            int thangSinh = 1 + (int) (Math.random() * ((9 - 1) + 1));
            int ngaySinh = 10 + (int) (Math.random() * ((28 - 10) + 1));
            int soNha = 10 + (int) (Math.random() * ((200 - 10) + 1));
            //CMND
            long cmnd = 100000000 + (long) (Math.random() * ((999999999 - 100000000) + 1));
            //phone
            String ten = arrTen[0 + (int) (Math.random() * ((11 - 0) + 1))];
            long phoneNumber = 100000000 + (long) (Math.random() * ((999999999 - 100000000) + 1));
            int idTypeCustomer = 1 + (int) (Math.random() * ((5 - 1) + 1));
            System.out.println("(customers.id_customer, " + idTypeCustomer + ", '" +
                    arrHo[0 + (int) (Math.random() * ((4 - 0) + 1))] + ' ' +
                    arrTenLot[0 + (int) (Math.random() * ((4 - 0) + 1))] + ' ' +
                    ten + "', '" + namSinh + "-0" + thangSinh + '-' + ngaySinh + "', '" + cmnd + "', '" +
                    "0" + phoneNumber + "', '" + ten +
                    "0" + i + "@gmali.com', '" + soNha + ' ' +
                    arrDiaChi[0 + (int) (Math.random() * ((11 - 0) + 1))] + ", " +
                    arrThanhPho[0 + (int) (Math.random() * ((7 - 0) + 1))] + "'),"
            );
        }
    }
}
