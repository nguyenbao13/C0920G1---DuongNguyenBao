<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/21/2020
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product information</title>
</head>
<body>
    <h1>Product view</h1>
    <a href="/products">Back to product list</a>
    <fieldset>
        <legend>${product.getName()} information</legend>
        <table>
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
