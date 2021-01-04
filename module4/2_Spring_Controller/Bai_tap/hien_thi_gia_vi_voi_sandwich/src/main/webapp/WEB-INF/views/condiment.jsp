<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 1/4/2021
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sanwich Condiments</title>
</head>
<body>
<c:forEach items="${condiment}" var="condiment">
    <h3>${condiment}</h3>
</c:forEach>
</body>
</html>
