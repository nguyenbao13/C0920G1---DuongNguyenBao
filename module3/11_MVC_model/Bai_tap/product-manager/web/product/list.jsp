<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/20/2020
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product list</title>
</head>
<body>
<h1>Products</h1>
<a href="/products?action=create">Create new product</a>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Expiry date</th>
        <th>Amount</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getExpiryDate()}</td>
            <td>${product.getAmount()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<h3>Search product by name:</h3>
<form>
    <input type="text" name="name" placeholder="Enter product name">
    <input type="submit" name="action" value="search">
</form>
</body>
</html>
