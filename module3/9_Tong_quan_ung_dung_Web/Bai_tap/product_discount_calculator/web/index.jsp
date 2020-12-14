<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/14/2020
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <div>
<%--      Product Description: Mô tả của sản phẩm--%>
<%--      List Price: Giá niêm yết của sản phẩm--%>
<%--      Discount Percent: Tỷ lệ chiết khấu (phần trăm)--%>
      <h2>Product Description</h2>
      <input type="text" name="description" size="30" placeholder="Product description">
      <h2>List Price</h2>
      <input type="number" name="price" size="30" placeholder="List price">
      <h2>Discount Percent</h2>
      <input type="number" name="discount" size="30" placeholder="Discount percent">
      <br><br>
      <input type="submit" value="Calculate Discount">
    </div>
  </form>
  </body>
</html>
