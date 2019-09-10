<%@page import="hms.bean.SignUp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 80%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

</head>
<body>
<%SignUp s=(SignUp)request.getAttribute("Profile"); %>
<table>
<tr><th colspan="2" > My Profile</th></tr>
  <tr>

  <tr>
    <td>Name</td>
    <td><%=s.getName()%></td>
   
  </tr>
  <tr>
    <td>Gender</td>
    <td><%=s.getGender() %></td>
  
  </tr>
  <tr>
    <td>Email</td>
    <td><%=s.getEmail() %></td>
    
  </tr>
  <tr>
    <td>Phone No.</td>
    <td><%=s.getMobile() %></td>
   
  </tr>
  <tr>
    <td>Address</td>
    <td><%=s.getAddress() %></td>
 
  </tr>
  <tr>
    <td>Country</td>
    <td><%=s.getCountry() %></td>
    
  </tr>
</table>

</body>
</html>