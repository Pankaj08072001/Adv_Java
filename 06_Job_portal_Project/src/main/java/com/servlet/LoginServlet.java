package com.servlet;

import java.io.IOException;
import com.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String em = req.getParameter("email");
		String ps = req.getParameter("password");
		User u = new User();
		HttpSession session = req.getSession();
		

		if("pnkj@gmail.com".equals(em) && "12345".equals(ps)) {
			session.setAttribute("UserObj", u);
			u.setRole("admin");
			res.sendRedirect("admin.jsp");
		}else {
			res.sendRedirect("Signup.jsp");
			
		}
	}

}
