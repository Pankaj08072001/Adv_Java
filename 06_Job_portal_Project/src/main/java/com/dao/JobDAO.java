package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Jobs;

public class JobDAO {
	private Connection con;

	public JobDAO(Connection con) {
		super();
		this.con = con;
	}

	public boolean addJobs(Jobs j) {
		boolean flag = false;
		String sql = "INSERT INTO jobs (title , description , category, status, location ,) VALES(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, j.getTitle());
			ps.setString(2, j.getDescription());
			ps.setString(3, j.getCategory());
			ps.setString(4, j.getStatus());
			ps.setString(5, j.getLocation());

			int k = ps.executeUpdate();

			if (k == 1) {
				flag = true;
			}else {
				System.out.println("djkeahdg");
			}
		} catch (Exception e) {

		}

		return flag;
	}

}
