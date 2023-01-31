<%@page import="school_management.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="gray" >
<%Teacher t=(Teacher)session.getAttribute("happyt1");%>
<center>
<table cellpading="50px" border="1" bgcolor="lightyellow">
<tr>
<th>ID</th>
<th>NAME</th>
<th>SUBJECT</th>
<th>SALARY</th>
</tr>
<tr>
<td><%=t.getId() %></td>
<td><%=t.getName() %></td>
<td><%=t.getSubject()%></td>
<td><%=t.getSalary() %></td>
</tr>
</table>
<br>
<br>
</center>
<a href ="mainu.html"><h3><u> Mainu </u></h3></a> <br>

</body>
</html>