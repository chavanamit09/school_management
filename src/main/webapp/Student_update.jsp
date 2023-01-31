<%@page import="school_management.Student1"%>
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
<body bgcolor="aqualight">
<div style="margin: 120px"></div>
<center>
<h3><b>ENTER STUDENT ID TO UPDATE</b></h3>

<% int id= Integer.parseInt(request.getParameter("id")); 
EntityManagerFactory emf= Persistence .createEntityManagerFactory("desto");
EntityManager em=emf.createEntityManager();

Student1 s =(Student1)em.find(Student1.class, id);
%>
<center>
<div style="margin: 120px"></div>
<h3><b>****UPDATE TEACHER DETAILS****</b></h3>

<form action="teach02" method="Post">
ID:
<input type="text" value="<%=s.getId() %>" name="id"><br><br>
Name:
<input type="text" value="<%=s.getName() %>"  name="name"><br><br>
STREAM:
<input type="text" value="<%=s.getStream()%>"  name="sub"><br><br>
FEES:
<input type="text" value="<%=s.getFees() %>" name="sal"><br><br>
<input type="submit">
</form>

</center>
<br><br>
<a href="Student.html"><b><u>Back</u></b></a>

</body>
</html>