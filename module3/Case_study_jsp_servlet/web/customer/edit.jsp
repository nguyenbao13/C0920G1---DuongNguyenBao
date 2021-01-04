<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/24/2020
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
          integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
          crossorigin="anonymous"/>
</head>
<body>
<div><h3 style="margin-left: 25%; margin-top: 10px">Edit Customer</h3></div>
<div align="center">
    <form method="post">
        <table class="table table-hover" style="width: 50%">
            <tr>
                <th>ID</th>
                <td>
                    <input type="text" name="id" value="${customer.id}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Type</th>
                <td>
                    <select name="type" id="type">
                        <c:choose>
                            <c:when test="${customer.cusType == 1}">
                                <option value=1>Diamond</option>
                                <option value=2>Platinum</option>
                                <option value=3>Gold</option>
                                <option value=4>Silver</option>
                                <option value=5>Member</option>
                            </c:when>
                            <c:when test="${customer.cusType == 2}">
                                <option value=2>Platinum</option>
                                <option value=1>Diamond</option>
                                <option value=3>Gold</option>
                                <option value=4>Silver</option>
                                <option value=5>Member</option>
                            </c:when>
                            <c:when test="${customer.cusType == 3}">
                                <option value=3>Gold</option>
                                <option value=1>Diamond</option>
                                <option value=2>Platinum</option>
                                <option value=4>Silver</option>
                                <option value=5>Member</option>
                            </c:when>
                            <c:when test="${customer.cusType == 4}">
                                <option value=4>Silver</option>
                                <option value=1>Diamond</option>
                                <option value=2>Platinum</option>
                                <option value=3>Gold</option>
                                <option value=5>Member</option>
                            </c:when>
                            <c:otherwise>
                                <option value=5>Member</option>
                                <option value=1>Diamond</option>
                                <option value=2>Platinum</option>
                                <option value=3>Gold</option>
                                <option value=4>Silver</option>
                            </c:otherwise>
                        </c:choose>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Name</th>
                <td>
                    <input type="text" name="name" value="${customer.cusName}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Birthday</th>
                <td>
                    <input type="text" name="birthday" value="${customer.cusDob}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Gender</th>
                <td>
                    <select name="gender" id="gender">
                        <c:choose>
                            <c:when test="${customer.cusGender == 0}">
                                <option value=0>Female</option>
                                <option value=1>Male</option>
                                <option value=2>Other</option>
                            </c:when>
                            <c:when test="${customer.cusGender == 1}">
                                <option value=1>Male</option>
                                <option value=0>Female</option>
                                <option value=2>Other</option>
                            </c:when>
                            <c:otherwise>
                                <option value=2>Other</option>
                                <option value=0>Female</option>
                                <option value=1>Male</option>
                            </c:otherwise>
                        </c:choose>
                    </select>
                </td>
            </tr>
            <tr>
                <th>ID card number</th>
                <td>
                    <input type="text" name="idCard" value="${customer.cusIdNum}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="phone" value="${customer.cusPhone}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" value="${customer.cusEmail}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" value="${customer.cusAddress}" size="45"/>
                </td>
            </tr>
        </table>
        <div style="margin-left: 30%">
            <button type="submit" class="btn btn-primary">Save Changes</button>
            <button type="button" class="btn btn-secondary">
                <a href="customers" style="text-decoration: none; color: white">List All Customers</a></button>
        </div>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
