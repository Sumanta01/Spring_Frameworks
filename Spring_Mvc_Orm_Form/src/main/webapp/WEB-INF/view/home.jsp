<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
		
		<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
</head>
<body>
   <div class="text-center">
   <h1>Home Page</h1>
  <a href="Regist" class="btn btn-primary btn-sm">Register</a>
  <a href="google" class="btn btn-sm btn-danger">Go to Google</a>
  <a href="yahoo" class="btn btn-sm btn-warning">Go to Yahoo</a>
  <a href="file_upload" class="btn btn-sm btn-primary ">Go to file upload</a>
   </div>
</body>
</html>