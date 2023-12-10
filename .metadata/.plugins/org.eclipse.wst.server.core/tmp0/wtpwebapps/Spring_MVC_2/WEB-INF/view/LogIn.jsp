<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Log In</h1>
	<%-- <%
	String clasName = (String) request.getAttribute("Class");
	Integer regno = (Integer) request.getAttribute("Reg.No");
	--%>

	<%-- <h4>
		Class:<%=clasName%>
	</h4>
	<h4>
		Reg.No:
		<%=regno%></h4> --%>

	<h4>Class:${Class }</h4>
	<h4>Reg.No:${RegNo}</h4>

</body>
</html>