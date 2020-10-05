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

function checkValue() {
do {
    let check = false;
    let countAt = 0;
    let countDot = 0;
    for (let i = 0; i < email.length; i++) {
        if (email.charAt(i) === '@') {
            countAt++;
            for (let j = i + 1; j < email.length; j++) {
                if (email.charAt(j) === '.') {
                    countDot++;
                }
            }
        }
    }
    if (countAt !== 1 || countDot < 1) {
        alert('Email bạn nhập không đúng');
        break;
    } else {
        check = true;
    }
} while (!check)
}
function output() {
    checkValue();
    let ad;
    if (address.value == 'Đà Nẵng') {
        ad = 20;
    } else if (address.value == 'Huế') {
        ad = 10;
    } else if (address.value == 'Quảng Nam') {
        ad = 5;
    } else {
        ad = 0;
    }
    let rd = parseInt(rentDay.value);
    let rdSale;
    if (rd >= 8) {
        rdSale = 30;
    } else if (rd >= 5 && rd <= 7) {
        rdSale = 20;
    } else if (rd >= 2 && rd <= 4) {
        rdSale = 10;
    } else {
        rdSale = 0;
    }
    let cu;
    if (customer.value == 'Diamond') {
        cu = 15;
    } else if (customer.value == 'Platinum') {
        cu = 10;
    } else if (customer.value == 'Gold') {
        cu = 5;
    } else if (customer.value == 'Silver') {
        cu = 2;
    } else {
        cu = 0;
    }
    let se;
    if (service.value == 'Villa') {
        se = 500;
    } else if (service.value == 'House') {
        se = 300;
    } else {
        se = 100;
    }
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