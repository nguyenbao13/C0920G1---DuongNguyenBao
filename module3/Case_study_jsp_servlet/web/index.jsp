<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/22/2020
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>FURAMA RESORT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
        integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
        crossorigin="anonymous"/>
</head>
<body>
<!-- Header -->
<div style="position: fixed; z-index: 9; margin: 0 ; width: 100%">
  <nav class="navbar navbar-light" style="background-color: white;">
    <a class="navbar-brand" href="#" style="margin-left: 70px">
      <img src="http://www.dongkhoitravel.com.vn/upload/product/furamresort-3272.png" width="190" height="85"
           class="d-inline-block align-top" alt="1">
    </a>
    <p style="font-size: 25px; margin-right: 50px; font-family: 'Comic Sans MS'; color: cadetblue">Duong Nguyen Bao</p>
  </nav>
  <%--Header-link--%>
  <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: cadetblue">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active mr-5" style="margin-left: 100px">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
        <li class="nav-item active mr-5">
          <a class="nav-link" href="/employees">Employee</a>
        </li>
        <li class="nav-item active mr-5">
          <a class="nav-link" href="/customers">Customer</a>
        </li>
        <li class="nav-item active mr-5">
          <a class="nav-link" href="/services">Service</a>
        </li>
        <li class="nav-item active mr-5">
          <a class="nav-link" href="/contracts">Contract</a>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <div class="input-group mb-0">
          <div class="input-group-prepend">
            <button class="btn btn-light" type="submit" style="border-radius: 20px 0px 0px 20px">
              <i class="fas fa-search" style="color: cadetblue;"></i></button>
          </div>
          <input type="text" class="form-control" placeholder="Search" aria-describedby="basic-addon1"
                 style="margin-right: 50px; border-radius: 0px 20px 20px 0px">
        </div>
      </form>
    </div>
  </nav>
</div>
<%--Body--%>
<div style="position: relative; top: 170px">
  <%--Body-left--%>
  <div class="card" style="width: 23%; position: absolute; float: left">
    <div id="myCarousel" class="carousel slide border" data-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img class="d-block w-100"
               src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/08_2019/furama-nha-hang.jpg"
               alt="1">
        </div>
        <div class="carousel-item">
          <img class="d-block w-100"
               src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/07_2019/phong-ngu-o-furama-resort-da-nang.jpg"
               alt="2">
        </div>
        <div class="carousel-item">
          <img class="d-block w-100"
               src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/07_2019/phong-ngu-o-furama-resort-da-nang_1.jpg"
               alt="3">
        </div>
        <div class="carousel-item">
          <img class="d-block w-100"
               src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/08_2019/furama-spa.jpg"
               alt="4">
        </div>
      </div>
    </div>
    <div class="card-body">
      <h5 class="card-title">Furama Da Nang</h5>
      <p class="card-text">THIS WORLD CLASS RESORT, FURAMA DANANG, REPUTABLE AS THE CULINARY BEACH RESORT IN VIETNAM.</p>
    </div>
    <ul class="list-group list-group-flush">
      <li class="list-group-item"><i class="fas fa-map-marker-alt" style="color: cadetblue"></i>
        103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam</li>
      <li class="list-group-item"><i class="fas fa-phone" style="color: cadetblue"></i> 84-236-3847 333/888</li>
      <li class="list-group-item"><i class="fas fa-envelope" style="color: cadetblue"></i> reservation@furamavietnam.com</li>
    </ul>
    <div class="card-body">
      <a href="https://www.facebook.com/furamaresort/" class="card-link" style="margin-left: 30px">
        <i class="fab fa-facebook fa-2x" style="color: cadetblue"></i></a>
      <a href="https://www.instagram.com/furama_resort_danang/?hl=vi" class="card-link" style="margin-left: 40px">
        <i class="fab fa-instagram fa-2x" style="color: cadetblue"></i></a>
      <a href="https://www.tripadvisor.com/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang.html"
         class="card-link" style="margin-left: 40px">
        <i class="fab fa-tripadvisor fa-2x" style="color: cadetblue"></i></a>
    </div>
  </div>
  <%--Body right--%>
  <div style="width: 77%; margin-left: 23%; height: 635px; border: hidden">
    <div style="text-align: center">
      <img src="https://thodiavn24h.com/wp-content/uploads/2020/05/toan-canh-furama-resort-danang-1-1280x720.jpg"
           style="height: 635px; width: 1000px">
    </div>
  </div>
</div>
<%--Footer--%>
<div style="width: 100%; margin-top: 175px; border: hidden; background-color: cadetblue">
  <div class="card-body" style="text-align: center; color: white">
    © 2020 Furama Resort Danang.
  </div>
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
