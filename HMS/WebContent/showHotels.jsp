<%@page import="java.util.ArrayList"%>
<%@page import="hms.service.AdminService"%>
<%@page import="hms.bean.AddHotelDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
AdminService as=new AdminService();
ArrayList<AddHotelDetails> al=as.sShowHotel();
%>
<div>
	
	
	<table border="2px">
	<tr>
		<td>Hotel Name </td>
		<td>City </td>
		<td>Address</td>
		<td>Contact </td>
		<td>total Room </td>
		<td>rating </td>
		
	</tr>
	<%
	for(AddHotelDetails asd:al){
	%>
	
	<tr>
		<td><%= asd.getHotelName() %></td>
		<td><%= asd.getCity() %></td>
		<td><%= asd.getHotelAddress() %></td>
		<td><%= asd.getContact() %></td>
		<td><%= asd.getTotalRoom() %></td>
		<td><%= asd.getRating() %></td>
		
	</tr>
	
	
	<%} %>
	</table>
</div>
</body>
</html>