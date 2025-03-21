package com.ay.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.ay.bean.BookBean;
import com.ay.dao.ViewBookDao;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/view")
public class ViewBookServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ArrayList<BookBean> al = new ViewBookDao().getAllBook();
		
		req.setAttribute("list", al);
		RequestDispatcher rd = req.getRequestDispatcher("ViewBook.jsp");
		rd.include(req, res);
	}

}
