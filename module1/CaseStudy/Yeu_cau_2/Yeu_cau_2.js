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
    document.getElementById('12').innerHTML=fee;
}
function edit() {
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