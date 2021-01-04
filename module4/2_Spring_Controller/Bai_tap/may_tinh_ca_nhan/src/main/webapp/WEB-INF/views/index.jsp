<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 1/4/2021
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculating">
    <input type="number" name="number1" placeholder="the first number" value="${number1}">
    <input type="number" name="number2" placeholder="the second number" value="${number2}">
    <br><br>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(x)">
    <input type="submit" name="operator" value="Division(/)">
</form>
<c:if test="${result != null}"><h3>Result ${result}</h3></c:if>
</body>
</html>
