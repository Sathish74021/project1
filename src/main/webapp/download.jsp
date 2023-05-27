<%@page import="servletDto.servletDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sathish</title>
</head>
<body>
	<%
	List<servletDto> l1 = (List<servletDto>) request.getAttribute("studentlist");
	%>
	<table border="">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>gender</th>
			<th>Phone no</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%for (servletDto d : l1) {%>
		<tr>
			<td><%=d.getStd_id()%></td>
			<td><%=d.getStd_name()%></td>
			<td><%=d.getGender()%></td>
			<td><%=d.getStd_phno()%></td>
			<td><a href="remove?id=<%=d.getStd_id()%>">Delete</a></td>
			<td><a href="update.jsp?sid=<%=d.getStd_id()%>
			&sname=<%=d.getStd_name()%>
			&phno=<%=d.getStd_phno()%>
			&gender=<%=d.getGender()%>">Update</a></td>
		</tr>
		<%}%>

	</table>
</body>
</html>