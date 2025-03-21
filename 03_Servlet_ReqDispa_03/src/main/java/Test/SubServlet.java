package Test;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sub")
public class SubServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		Integer First = Integer.parseInt(req.getParameter("first"));
		Integer Second = Integer.parseInt(req.getParameter("second"));

		if (Second > First) {
			pw.print("Sub : " + (Second - First));
		} else {
			pw.print("Sub : " + (First - Second));
		}
		RequestDispatcher rd = req.getRequestDispatcher("SubP.html");
		rd.include(req, res);
	}

}
