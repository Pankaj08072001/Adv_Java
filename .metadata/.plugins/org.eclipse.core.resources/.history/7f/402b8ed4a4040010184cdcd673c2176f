<%@page import="java.util.ArrayList"%>
<%@page import="com.ay.bean.BookBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList <BookBean> al = (ArrayList) request.getAttribute("list");
		if (al.size() == 0) {
		out.print("No Record Found !");
	%>
	<a href="index.html">Home </a>

	<%
	} else {
	%>
	<table border="3px">
		<thead>
			<tr>
				<th>Book ID</th>
				<th>Book Name</th>
				<th>Book Price</th>
				<th>Author</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (BookBean bb : al) {
			%>
			<tr>
				<td><%=bb.getId() %></td>
				<td><%=bb.getName() %></td>
				<td><%=bb.getPrice() %></td>
				<td><%=bb.getAuthor()%></td>
			</tr>
			<%
			}
			%>

		</tbody>
	</table>
	<%
	}
	%>

</body>
</html>