<!DOCTYPE html>
<%@page import="com.training.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.training.dao.impl.StudentDaoImpl"%>
<%@page import="com.training.dao.StudentDao"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    	// this is scriplet (a way to use java code in html like file(jsp))
		StudentDao dao= new StudentDaoImpl();
    	List<Student> students=dao.getAllStudents();
    	for(Student stu:students)
    	{
    %>
    <h1>Name:<%=stu.getName()%></h1>
    <%	} %>
    
    
</body>
</html>