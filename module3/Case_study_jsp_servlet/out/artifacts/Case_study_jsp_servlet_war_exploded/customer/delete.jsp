<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/24/2020
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete customer</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Customer Management</h1>
    <h2>
        <a href="customers">List All Users</a>
    </h2>
</div>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Delete Customer</h2>
                <p>Are you sure ?</p>
            </caption>
            <c:if test="${customer != null}">
                <input type="hidden" name="id_customer" value="<c:out value='${customer.id}'/>"/>
            </c:if>
            <tr>
                <th>Customer ID:</th>
                <td><c:out value="${customer.id}"/></td>
            </tr>
            <tr>
                <th>Customer type ID:</th>
                <td>${customer.cusType}</td>
            </tr>
            <tr>
                <th>Customer Name:</th>
                <td>${customer.cusName}</td>
            </tr>
            <tr>
                <th>Customer birthday:</th>
                <td>${customer.cusDob}</td>
            </tr>
            <tr>
                <th>Customer gender:</th>
                <td>${customer.cusGender}</td>
            </tr>
            <tr>
                <th>Customer ID card number:</th>
                <td>${customer.cusIdNum}</td>
            </tr>
            <tr>
                <th>Customer phone:</th>
                <td>${customer.cusPhone}</td>
            </tr>
            <tr>
                <th>Customer email:</th>
                <td>${customer.cusEmail}</td>
            </tr>
            <tr>
                <th>Customer address:</th>
                <td>${customer.cusAddress}</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Delete"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
