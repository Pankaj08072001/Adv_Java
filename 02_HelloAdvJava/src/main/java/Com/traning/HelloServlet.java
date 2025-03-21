package Com.traning;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HelloSevlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter()
				.append("""
					   <html>
						<head>
							<title>Marquee Tag</title>
							<style>
							.main {
								text-align:center;
								font-family:"Times New Roman";
							}
							.marq {
							float : left;
								padding-top:30px;
								padding-bottom:30px;
							}
							.geek1 {
								font-size:36px;
								font-weight:bold;
								color:white;
								text-align:center;
							}
							.geek2 {
								text-align:center;
							}
							</style>
						</head>

						<body>
							<div class = "main">
							<marquee class="marq" bgcolor = "Green" direction = "right" loop="infinite"  behavior="alternate"  scrollamount="30">
								<div class="geek1">Web site Useing java</div>
								<div class="geek2">............................</div>
							</marquee>
							<input type="week">
						    <input type="text">
						    <input type="password">
						    <input type="range">
						    <input type="file">
						    <input type="checkbox">
						    <input type="date">
						    <input type="time">
						    <input type="radio">
						    <input type="color">
							</div>
						</body>
						</html>


						    </center>
						</body>
						</html>""");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
