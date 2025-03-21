package com.ay.servlet;

import java.io.IOException;
import com.ay.bean.BookBean;
import com.ay.dao.ViewByCodeDao;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/viewBy")
public class ViewByServlet extends GenericServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
				
		BookBean bb = new BookBean();
		bb.setId(Integer.parseInt(req.getParameter("id")));
		
		bb = new ViewByCodeDao().getById(bb);
		
		req.setAttribute("Bean", bb);
		
		RequestDispatcher rd = req.getRequestDispatcher("ViewByIdOutput.jsp");
		rd.include(req, res);
	}
    	
}
