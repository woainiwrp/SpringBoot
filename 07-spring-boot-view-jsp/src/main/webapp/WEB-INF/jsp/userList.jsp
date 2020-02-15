<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="50%">
		<tr>
		   <th>ID</th>
		   <th>Name</th>
		   <th>Age</th>
		</tr>
		
		<c:forEach items="${list}" var="user">
		    <tr>
		       <td>${user.userId}</td>
		       <td>${user.username}</td>
		       <td>${user.userage}</td>
		    </tr>
		</c:forEach>
	</table>
</body>
</html>