package Test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		Integer First = Integer.parseInt(req.getParameter("first"));
		Integer Second = Integer.parseInt(req.getParameter("second"));
		
		pw.print("Addition : " + (Second+First));
		
		RequestDispatcher rd = req.getRequestDispatcher("ADDP.html");
		rd.include(req, res);
	}
}
