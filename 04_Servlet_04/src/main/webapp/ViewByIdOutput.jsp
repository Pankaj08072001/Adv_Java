<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.ay.bean.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	BookBean bb = (BookBean) request.getAttribute("Bean");
	if (bb == null) {
		out.print("Invalid Book Id ");
		RequestDispatcher rd = request.getRequestDispatcher("ViewById.jsp");
		rd.include(request, response);
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
			<tr>
				<td><%=bb.getId()%></td>
				<td><%=bb.getName()%></td>
				<td><%=bb.getPrice()%></td>
				<td><%=bb.getAuthor()%></td>
			</tr>


		</tbody>
	</table>
	<%
	}
	%>
</body>
</html>