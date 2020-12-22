<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/21/2020
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product information</title>
</head>
<body>
<a href="/products">Back to product list</a>
<fieldset>
    <legend>Product information</legend>
    <table>
        <tr>
            <td>Name: </td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>Expiry date: </td>
            <td>${product.getExpiryDate()}</td>
        </tr>
        <tr>
            <td>Amount: </td>
            <td>${product.getAmount()}</td>
        </tr>
    </table>
</fieldset>
</body>
</html>
