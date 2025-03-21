package Test;

import java.io.IOException;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/main")
public class MainServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// res.setContentType("text/html");

		String opt = req.getParameter("s");
		if (opt.equals("Add")) {
			RequestDispatcher rd = req.getRequestDispatcher("add");
			rd.forward(req, res);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
	}

}
