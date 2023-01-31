!
<%@page import="school_management.Student1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view students</title>
</head>
<body bgcolor="gray">
<% Student1 s=(Student1)session.getAttribute("happy1");%>
<table cellpadding ="20px" border="1" bgcolor="orange">
<th>ID</th>
<th>NAME</th>
<th>STREAM</th>
<th>FEES</th>
<tr align="center">
<td><%=s.getId()  %></td>
<td><%=s.getName() %></td>
<td><%=s.getStream() %></td>
<td><%=s.getFees() %></td>
</tr>

</table>
			<a href =" Teacher.html "> <u> Back </u> </a> <br>
</body>
</html>
	
