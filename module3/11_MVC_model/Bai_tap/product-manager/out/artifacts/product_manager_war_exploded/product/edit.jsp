<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/20/2020
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>${message}</p>
<a href="/products">Back to product list</a>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" value="${product.getName()}"></td>
            </tr>
            <tr>
                <td>Expiry date: </td>
                <td><input type="text" name="expiryDate" value="${product.getExpiryDate()}"></td>
            </tr>
            <tr>
                <td>Amount: </td>
                <td><input type="text" name="amount" value="${product.getAmount()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
