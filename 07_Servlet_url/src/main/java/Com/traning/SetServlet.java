package Com.traning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String book1 = req.getParameter("book1");
		String book2 = req.getParameter("book2");
		String book3 = req.getParameter("book3");
		
		pw.print("<h1>Your books are Added to cart</h1>");
		
		pw.print("<from action=get method=post >"
				+"<input type=hidden name=book1 value=" +book1+">"
				+"<input type=hidden name=book2 value=" +book2+">"
				+"<input type=hidden name=book3 value=" +book3+">"
				+"<input type=submit value=Next >"
				+"</from>");
		
//		RequestDispatcher rd =req.getRequestDispatcher("/get");
//		rd.forward(req, res);
	}

	

}
