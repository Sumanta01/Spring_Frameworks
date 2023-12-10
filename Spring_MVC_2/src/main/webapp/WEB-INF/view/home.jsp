<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Home Page</h1>
	<%--<%  
	String name=(String) request.getAttribute("name");
	Integer roll=(Integer) request.getAttribute("roll");
	List<String>names=(List<String>) request.getAttribute("list");
	<h3>Name:<%=name%></h3>
	<h3>Roll:<%=roll %></h3>
	<h3> Names :
	
	<%  for (String st:names){ %>
		
		<h4><%=st%></h4>
		
		<% }%>
	
	</h3> --%>

	<h4>Name: ${name}</h4>
	<h4>Roll: ${roll}</h4>
	<h4>Names: </h4>
   <c:forEach items="${list }" var= "n">
   <h4>${n}</h4>
   </c:forEach>


	<a href="LogIn">LogIn</a>

</body>
</html>