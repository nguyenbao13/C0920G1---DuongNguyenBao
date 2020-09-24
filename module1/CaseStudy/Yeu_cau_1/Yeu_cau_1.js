function hienThi() {
    let name = document.getElementById('name');
    document.getElementById('1').innerHTML=name.value;
    let idNum = document.getElementById('idNum');
    document.getElementById('2').innerHTML=idNum.value;
    let birthday = document.getElementById('birthday');
    document.getElementById('3').innerHTML=birthday.value;
    let email = document.getElementById('email');
    document.getElementById('4').innerHTML=email.value;
    let address = document.getElementById('address');
    document.getElementById('5').innerHTML=address.value;
    let customer = document.getElementById('customer');
    document.getElementById('6').innerHTML=customer.value;
    let discount = document.getElementById('discount');
    document.getElementById('7').innerHTML=discount.value;
    let amount = document.getElementById('amount');
    document.getElementById('8').innerHTML=amount.value;
    let rentDay = document.getElementById('rentDay');
    document.getElementById('9').innerHTML=rentDay.value;
    let service = document.getElementById('service');
    document.getElementById('10').innerHTML=service.value;
    let room = document.getElementById('room');
    document.getElementById('11').innerHTML=room.value;
    let rd = parseInt(rentDay.value);
    let dc = parseInt(discount.value);
    let fee;
    switch(service.value) {
        case 'Villa':
            fee = 500 * rd * (1 - dc/100);
            break;
        case 'House':
            fee = 300 * rd * (1 - dc/100);
            break;
        case 'Room':
            fee = 100 * rd * (1 - dc/100);
            break;
    }
    document.getElementById('12').innerHTML=fee;
}
//Số tiền phải trả  = giá loại dịch vụ X số ngày X ( 1 – giảm giá/100 )
/*    • Villa 500$/ 1 ngày
    • House 300$/1 ngày
    • Room: 100$/1 ngày*/

