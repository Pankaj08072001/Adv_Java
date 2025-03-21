package com.ay.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.ay.bean.BookBean;
import com.ay.dao.AddBookDao;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddBookServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		BookBean bb = new BookBean();
		bb.setId(Integer.parseInt(req.getParameter("id")));
		bb.setName(req.getParameter("name"));
		bb.setPrice(Float.parseFloat(req.getParameter("price")));
		bb.setAuthor(req.getParameter("author"));

		int k = new AddBookDao().saveBook(bb);

		if (k > 0) {
			pw.print("<font color = red> Book Added Successfully <br>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		} else {
			pw.print("<font color = red> Faild To added ");
			RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
			rd.include(req, res);
		}

	}
}
