package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/")
public class Test extends GenericServlet {
	private static final long serialVersionUID = 1L;
 
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter ps = res.getWriter();
		ps.println("Hello PankaJ Chaudhary !! <br>");
		
		for(int i = 0; i <10; i++ ) {
		ps.println("Hello World");
		}
	}

}
