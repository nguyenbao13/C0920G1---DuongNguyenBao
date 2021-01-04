<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/30/2020
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Service</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
          integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
          crossorigin="anonymous"/>
</head>
<body>
<div><h3 style="margin-left: 25%; margin-top: 10px">Create Service</h3></div>
<h5 align="center">${message}</h5>
<div align="center">
    <form method="post">
        <table class="table table-hover" style="width: 50%">
            <tr>
                <th>ID</th>
                <td>
                    <input type="number" name="id" id="id" size="45"/>
<%--                    <p style="color: red">${messageId} </p>--%>
                </td>
            </tr>
            <tr>
                <th>Name</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Area</th>
                <td>
                    <input type="number" name="area" id="area" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Cost</th>
                <td>
                    <input type="text" name="cost" id="cost" size="45"/>
                    <%--                    <p style="color: red">${messageBirthday}</p>--%>
                </td>
            </tr>
            <tr>
                <th>Max of People</th>
                <td>
                    <input type="number" name="maxPeople" id="maxPeople" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Rent Type Id</th>
                <td>
                    <input type="number" name="rentTypeId" id="rentTypeId" size="45"/>
<%--                    <p style="color: red">${messageIdCard}</p>--%>
                </td>
            </tr>
            <tr>
                <th>Service Type Id</th>
                <td>
                    <input type="number" name="serviceTypeId" id="serviceTypeId" size="45"/>
<%--                    <p style="color: red">${messagePhone}</p>--%>
                </td>
            </tr>
            <tr>
                <th>Standard of Room</th>
                <td>
                    <input type="text" name="roomStandard" id="roomStandard" size="45"/>
<%--                    <p style="color: red">${messageEmail}</p>--%>
                </td>
            </tr>
            <tr>
                <th>Description of Other Convenience</th>
                <td>
                    <input type="text" name="otherConvenience" id="otherConvenience" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Area of Pool</th>
                <td>
                    <input type="text" name="poolArea" id="poolArea" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Number of Floor</th>
                <td>
                    <input type="number" name="floors" id="floors" size="45"/>
                </td>
            </tr>
        </table>
        <div style="margin-left: 30%">
            <button type="submit" class="btn btn-primary">Save Service</button>
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
