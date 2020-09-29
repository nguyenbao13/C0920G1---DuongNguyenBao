let name = document.getElementById('name');
let idNum = document.getElementById('idNum');
let birthday = document.getElementById('birthday');
let email = document.getElementById('email');
let address = document.getElementById('address');
let customer = document.getElementById('customer');
let discount = document.getElementById('discount');
let amount = document.getElementById('amount');
let rentDay = document.getElementById('rentDay');
let service = document.getElementById('service');
let room = document.getElementById('room');
function output() {
    let ad;
    if (address.value == 'Đà Nẵng') {
        ad = 20;
    } else if (address.value == 'Huế') {
        ad = 10;
    } else if (address.value == 'Quảng Nam') {
        ad = 5;
    } else {ad = 0};
    let rd = parseInt(rentDay.value);
    let rdSale;
    if (rd >= 8) {
        rdSale = 30;
    } else if (rd >= 5 && rd <= 7) {
        rdSale = 20;
    } else if (rd >= 2 && rd <= 4) {
        rdSale = 10;
    } else {rdSale = 0};
    let cu;
    if (customer.value == 'Diamond') {
        cu = 15;
    } else if (customer.value == 'Platinum') {
        cu = 10;
    } else if (customer.value == 'Gold') {
        cu = 5;
    } else if (customer.value == 'Silver') {
        cu = 2;
    } else {cu = 0};
    let se;
    if (service.value == 'Villa') {
        se = 500;
    } else if (service.value == 'House') {
        se = 300;
    } else {se = 100};
    let fee;
    fee = se * rd - ad - rdSale - cu;
    discount.value = ad + rdSale + cu;
    document.getElementById('fee').innerHTML=fee;
    document.getElementById('nameOut').innerHTML=name.value;
    document.getElementById('idNumOut').innerHTML=idNum.value;
    document.getElementById('birthdayOut').innerHTML=birthday.value;
    document.getElementById('emailOut').innerHTML=email.value;
    document.getElementById('addressOut').innerHTML=address.value;
    document.getElementById('customerOut').innerHTML=customer.value;
    document.getElementById('discountOut').innerHTML=discount.value;
    document.getElementById('amountOut').innerHTML=amount.value;
    document.getElementById('rentDayOut').innerHTML=rentDay.value;
    document.getElementById('serviceOut').innerHTML=service.value;
    document.getElementById('roomOut').innerHTML=room.value;
}
function traThongTin() {
    let tempName = document.getElementById('nameOut').textContent;
    name.value = tempName;
    let tempIdNum = document.getElementById('idNumOut').textContent;
    idNum.value = tempIdNum;
    let tempEmail = document.getElementById('emailOut').textContent;
    email.value = tempEmail;
    let tempBirthday = document.getElementById('birthdayOut').textContent;
    birthday.value = tempBirthday;
    let tempAddress = document.getElementById('addressOut').textContent;
    address.value = tempAddress;
    let tempCustomer = document.getElementById('customerOut').textContent;
    customer.value = tempCustomer;
    let tempDiscount = document.getElementById('discountOut').textContent;
    discount.value = tempDiscount;
    let tempAmount = document.getElementById('amountOut').textContent;
    amount.value = tempAmount;
    let tempRentDay = document.getElementById('rentDayOut').textContent;
    rentDay.value = tempRentDay;
    let tempService = document.getElementById('serviceOut').textContent;
    service.value = tempService;
    let tempRoom = document.getElementById('roomOut').textContent;
    room.value = tempRoom;
}
function edit() {
    let choose = prompt(
        '1. Hiển thị thông tin khách hàng.' + '\n' +
        '2. Chỉnh sửa thông tin khách hàng.' + '\n' +
        '3. Hiển thị giá sau khi được giảm giá.');
    switch(choose) {
        case '1':
            alert('Tên: ' + name.value + '\n' +
                'Số CMND: ' + idNum.value + '\n' +
                'Ngày sinh: ' + birthday.value + '\n' +
                'Email: ' + email.value + '\n' +
                'Địa chỉ: ' + address.value + '\n' +
                'Loại khách: ' + customer.value + '\n' +
                'Giảm giá: ' + discount.value + '\n' +
                'Số lượng đi kèm: ' + amount.value + '\n' +
                'Số ngày thuê: ' + rentDay.value + '\n' +
                'Loại dịch vụ: ' + service.value + '\n' +
                'Loại phòng: ' + room.value + '\n');
                break;
        case '2':
            let chooseEdit = prompt('1. Tên: ' + name.value + '\n' +
                '2. Số CMND: ' + idNum.value + '\n' +
                '3. Ngày sinh: ' + birthday.value + '\n' +
                '4. Email: ' + email.value + '\n' +
                '5. Địa chỉ: ' + address.value + '\n' +
                '6. Loại khách: ' + customer.value + '\n' +
                '7. Giảm giá: ' + discount.value + '\n' +
                '8. Số lượng đi kèm: ' + amount.value + '\n' +
                '9. Số ngày thuê: ' + rentDay.value + '\n' +
                '10. Loại dịch vụ: ' + service.value + '\n' +
                '11. Loại phòng: ' + room.value + '\n');
            switch (chooseEdit) {
                case '1':
                    name.value = prompt('Tên:');
                    break;
                case '2':
                    idNum.value = prompt('Số CMND:');
                    break;
                case '3':
                    birthday.value = prompt('Ngày sinh:');
                    break;
                case '4':
                    email.value = prompt('Email:');
                    break;
                case '5':
                    address.value = prompt('Địa chỉ:');
                    break;
                case '6':
                    customer.value = prompt('Loại khách:');
                    break;
                case '7':
                    discount.value = prompt('Giảm giá:');
                    break;
                case '8':
                    amount.value = prompt('Số lượng đi kèm:');
                    break;
                case '9':
                    rentDay.value = prompt('Số ngày thuê:');
                    break;
                case '10':
                    service.value = prompt('Loại dịch vụ:');
                    break;
                case '11':
                    room.value = prompt('Loại phòng');
                    break;
                default: alert('Failed!');
            }
            alert('Tên: ' + name.value + '\n' +
                'Số CMND: ' + idNum.value + '\n' +
                'Ngày sinh: ' + birthday.value + '\n' +
                'Email: ' + email.value + '\n' +
                'Địa chỉ: ' + address.value + '\n' +
                'Loại khách: ' + customer.value + '\n' +
                'Giảm giá: ' + discount.value + '\n' +
                'Số lượng đi kèm: ' + amount.value + '\n' +
                'Số ngày thuê: ' + rentDay.value + '\n' +
                'Loại dịch vụ: ' + service.value + '\n' +
                'Loại phòng: ' + room.value + '\n');
            break;
        case '3':
            let ad;
            if (address.value == 'Đà Nẵng') {
                ad = 20;
            } else if (address.value == 'Huế') {
                ad = 10;
            } else if (address.value == 'Quảng Nam') {
                ad = 5;
            } else {ad = 0};
            let rd = parseInt(rentDay.value);
            let rdSale;
            if (rd >= 8) {
                rdSale = 30;
            } else if (rd >= 5 && rd <= 7) {
                rdSale = 20;
            } else if (rd >= 2 && rd <= 4) {
                rdSale = 10;
            } else {rdSale = 0};
            let cu;
            if (customer.value == 'Diamond') {
                cu = 15;
            } else if (customer.value == 'Platinum') {
                cu = 10;
            } else if (customer.value == 'Gold') {
                cu = 5;
            } else if (customer.value == 'Silver') {
                cu = 2;
            } else {cu = 0};
            let se;
            if (service.value == 'Villa') {
                se = 500;
            } else if (service.value == 'House') {
                se = 300;
            } else {se = 100};
            let fee;
            fee = se * rd - ad - rdSale - cu;
            discount.value = ad + rdSale + cu;
            alert('Tổng chi phí: ' + fee + '$');
            break;
        default: alert('Bạn hãy chọn các chức năng có trong trình đơn');
    }
}
