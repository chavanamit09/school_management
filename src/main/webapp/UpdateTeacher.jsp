<%@page import="school_management.Teacher"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="lightgreen">
<% int id= Integer.parseInt(request.getParameter("id")); 
EntityManagerFactory emf= Persistence.createEntityManagerFactory("desto");
EntityManager em=emf.createEntityManager();

Teacher t=em.find(Teacher.class, id);
%>
<center>
<div style="margin: 120px"></div>
<h3><b>****UPDATE TEACHER DETAILS****</b></h3>

<form action="teach02" method="Post">
ID:
<input type="text" value="<%=t.getId() %>" name="id"><br><br>
Name:
<input type="text" value="<%=t.getName() %>"  name="name"><br><br>
SUBJECT:
<input type="text" value="<%=t.getSubject() %>"  name="sub"><br><br>
SALARY:
<input type="text" value="<%=t.getSalary() %>" name="sal"><br><br>
<input type="submit">
</form>

</center>
<br><br>
<a href ="Teacher.html"><h3><u> Back</u></h3></a> <br>
</body>
</html>