<%@page import="hms.bean.AddHotelDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hms.service.AdminService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>


<style>
 {box-sizing: border-box;}
body {font-family: Verdana, sans-serif;}
.mySlides {display: none;}
img {vertical-align: middle;
height:500px;
}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;

  
  margin: auto;
}



/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}

.centered {
	font-size:59;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.text-block {
  position: absolute;
  bottom: 20px;
  right: 20px;
  background-color: black;
  color: white;
  padding-left: 20px;
  padding-right: 20px;
}
</style>


</head>

<body>
<div>


<div >
        <div class="navbar">

<a class="active" href="http://localhost:7070/HMS/logoutCustomer.html"><i class="fa fa-fw fa-home"></i> <img class="imgg" src="http://localhost:7070/HMS/icon/user-shape.png" />  Logout</a> 
<a class="active" href="http://localhost:7070/HMS/changePass.html"><i class="fa fa-fw fa-home"></i> <img class="imgg" src="http://localhost:7070/HMS/icon/user-shape.png" /> Change Password</a> 
<a class="active" href="http://localhost:7070/HMS/myProfileCustomer.html"><i class="fa fa-fw fa-home"></i> <img class="imgg" src="http://localhost:7070/HMS/icon/user-shape.png" /> My profile</a> 
<a class="active" href="#"><i class="fa fa-fw fa-home"></i> <img class="imgg" src="http://localhost:7070/HMS/icon/user-shape.png" /> Book Hotel Detail</a> 
<a class="active" href="http://localhost:7070/HMS/showPageForCustomer.html"><i class="fa fa-fw fa-home"></i> <img class="imgg" src="http://localhost:7070/HMS/icon/hotel.png" />  Hotel List</a> 
 

 <a class="active" href="#"><i class="fa fa-fw fa-home"></i> <img class="imgg" src="http://localhost:7070/HMS/icon/home.png" />  Home</a> 

 
</div>
                
                
      

<style>
        
        
        .navbar {
         
          background-color: #333 ;
          position: fixed;
          top: 0;
          width: 100%;
        }
        .imgg{
		height:30px;
		width:30px;
		}
        .navbar a {
          float: right;
          display: block;
          color: #f2f2f2;
          text-align: center;
          padding: 10px 12px;
          text-decoration: none;
          font-size: 17px;
        }
        
        .navbar a:hover {
          background: #ddd;
          color: black;
        }
        
		.active {
  background-color: #4CAF50;
}

        .main {
          padding: 16px;
          margin-top: 30px;
          height: 1500px; /* Used in this example to enable scrolling */
        }
        .dic{
        border:2px solid red;
        }
        </style>
		
</div>
<br><br><br>






<div style=" height:100%;">

<div class="slideshow-container" >

<div class="mySlides fade">
 
  <img src="http://localhost:7070/HMS/proj_photos/gallery00-490x327.jpg" style=" width:100%; ">
 
  <div class="centered"> <div class="text-block">
  
    <h4>Nature</h4>
    <p>What a beautiful sunrise</p>
  </div></div>
</div>

<div class="mySlides fade" >
 
  <img src="http://localhost:7070/HMS/proj_photos/gallery01-490x327.jpg" style="width:100% "> <br>
  <br>
  <div class="centered"> <div class="text-block">
    <h4>Nature</h4>
    <p>What a beautiful sunrise</p>
  </div></div>
</div>

<div class="mySlides fade">
  
  <img src="http://localhost:7070/HMS/proj_photos/gallery02-490x327.jpg" style="width:100% "> <br>
  <br>
  <div class="centered"> <div class="text-block">
    <h4>Nature</h4>
    <p>What a beautiful sunrise</p>
  </div></div>
</div>





<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>
<%
AdminService as=new AdminService();
ArrayList<AddHotelDetails> al=as.sShowHotel();
%>

<%
	for(AddHotelDetails asd:al){
	%>
<div style="width:1200px; height:200px" >

<table style="width:100%">

  <tr>
    
    <th colspan="8"><h1><%= asd.getHotelName() %></h1></th>
  </tr>
  <tr>
    <td>Contact:</td>
    <td><%= asd.getContact() %></td>
    <td>Rating:</td>
	 <td><%= asd.getRating() %></td>
	  <td>Available:</td>
	   <td><%= asd.getTotalRoom() %></td>
	    <td>Address:</td>
		 <td><%= asd.getHotelAddress() %></td>
  </tr>
  
</table><br><br>
<a href="bookingDetailsCustomer.html"><input type="submit" value="Book" style="margin-left:30px; width:80px; height:30px; background-color: #4CAF50;"  ></a>

</div>
<%} %>

<style>
table, th, td {

  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;    
}
</style>


<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 3000); // Change image every 2 seconds
}
</script>

</div>


</body>
</html>