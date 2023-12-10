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
<h1>Welcome to Login Page</h1>

<% 
String className=(String) request.getAttribute("Class");
Integer regNo=(Integer) request.getAttribute("RegNo");
List<String>LstName=(List<String>)request.getAttribute("LstName");

%>

<h4>Class:<%=className %></h4>
<h4>Reg.No:<%=regNo %></h4>
<h3>
		Name List:
		<% for (String s:LstName)
		{%>
		<h4><%=s %></h4>
	
		<% }%>  </h3>

</body>
</html>