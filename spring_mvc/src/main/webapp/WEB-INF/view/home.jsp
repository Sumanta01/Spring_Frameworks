<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer roll = (Integer) request.getAttribute("roll");
	List<String>ListName=(List<String>)request.getAttribute("ListName");
	%>
	<h3>
		Name :<%=name%></h3>

	<h3>
		Roll:
		<%=roll%></h3>
	<h3>
		Name List:
		<% for (String s:ListName)
		{%>
		<h4><%=s %></h4>
	
		<% }%>  </h3>
	<a href="login">login</a>

</body>
</html>