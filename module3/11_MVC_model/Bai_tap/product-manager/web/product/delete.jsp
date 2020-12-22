<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/21/2020
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product</h1>
<a href="/products">Back to product list</a>
<form method="post">
    <h3>Are you sure ?</h3>
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
            <tr>
                <td></td>
                <td><input type="submit" value="Delete product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
