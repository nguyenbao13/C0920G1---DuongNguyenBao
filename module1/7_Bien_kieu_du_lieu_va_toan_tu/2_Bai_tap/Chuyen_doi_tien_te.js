//Bài tập ứng dụng chuyển đổi tiền tệ
function chuyenTien() {
    let amount = document.getElementById("amount").value;
    let from = document.getElementById("from").value;
    let to = document.getElementById("to").value;
    let tienChuyen;
    let tienNhap = parseInt(amount);
    //Xét khi 2 dữ liệu bằng nhau

    if (from === to){
        tienChuyen = tienNhap;
    }
    //Chuyển đổi từ tiền Việt Nam

    if (from === "Vn" && to === "US"){
        tienChuyen = tienNhap / 23000;
    }
    if (from === "Vn" && to === "Eu"){
        tienChuyen = tienNhap / 27000;
    }
    //Chuyển đổi từ tiền Mỹ
    if (from === "US" && to === "Vn"){
        tienChuyen = tienNhap * 23000;
    }
    if (from === "US" && to === "Eu"){
        tienChuyen = tienNhap  * 0.86;
    }
    //Chuyển đổi từ tiền châu Âu
    if (from === "Eu" && to === "VN"){
        tienChuyen = tienNhap * 27000;
    }
    if (from === "Eu" && to === "US"){
        tienChuyen = tienNhap / 0.86;
    }
    //In ra thông báo
    document.getElementById('result').innerHTML = 'Số tiền chuyển đổi: ' + tienChuyen;
}