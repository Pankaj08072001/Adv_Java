package com.servlet;

import java.io.IOException;

import com.DB.ConnectionFactory;
import com.dao.JobDAO;
import com.entity.Jobs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add_job")
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			String title = req.getParameter("Title");
			String location = req.getParameter("Location");
			String category = req.getParameter("Category");
			String status = req.getParameter("Status");
			String des = req.getParameter("desc");

			Jobs j = new Jobs();
			j.setTitle(title);
			j.setDescription(des);
			j.setLocation(location);
			j.setStatus(status);
			j.setCategory(category);

			HttpSession hs = req.getSession();

			JobDAO jd = new JobDAO(ConnectionFactory.getConnected());
			boolean f = jd.addJobs(j);
			if (f) {
				hs.setAttribute("succMsg", "Job Post Succesfully !");
				res.sendRedirect("add_job.jsp");

			} else {
				hs.setAttribute("succMsg", "Something else");
				res.sendRedirect("");
			}

		} catch (Exception e) {

		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
