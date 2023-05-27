<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sathish</title>
</head>
<body>
	<form action="update">
		Sid: <input type="number" name="sid" value=<%=request.getParameter("sid")%> readonly="readonly"><br>
		Sname: <input type="text" name="sname" value=<%=request.getParameter("sname")%>><br> 
		Phone no:<input type="number" name="number" value=<%=request.getParameter("phno")%>><br>
		<% if(request.getParameter("gender").equals("Male")){ %>
		Male: <input type="radio" name="gender" value="male" checked="checked"><br>
		Female: <input type="radio" name="gender" value="female">
		<%} else { %>
		Male: <input type="radio" name="gender" value="male" ><br>
		Female: <input type="radio" name="gender" value="female" checked="checked">
		<% } %>
		<button type="submit" >submit</button>
		<button type="reset">cancel</button>
	</form>
</body>
</html>