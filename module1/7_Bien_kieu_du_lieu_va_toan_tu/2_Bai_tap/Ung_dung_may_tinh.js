function calculate(o) {
let num1 = document.getElementById('1');
let num2 = document.getElementById('2');
let result;
if (o==='+') {
    result = parseInt(num1.value) + parseInt(num2.value);
} else if (o==='-') {
    result = (num1.value) - (num2.value);
} else if (o==='x') {
    result = (num1.value) * (num2.value);
} else if (o==='/') {
    if (num2.value == 0) {
        result = "Mẫu không được bằng 0"
    } else  result = (num1.value) / (num2.value);
}
    alert(result);
}