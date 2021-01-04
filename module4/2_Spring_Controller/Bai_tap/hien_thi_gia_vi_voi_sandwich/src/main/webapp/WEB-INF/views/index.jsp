<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 1/4/2021
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choosing Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="save">
    <input type="checkbox" value="Lettuce" name="condiment">Lettuce
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <input type="checkbox" value="Mustard" name="condiment">Mustard
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
