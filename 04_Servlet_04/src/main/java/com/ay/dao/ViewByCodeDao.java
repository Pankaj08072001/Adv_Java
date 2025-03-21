package com.ay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ay.bean.BookBean;
import com.ay.connection.DBConnection;

public class ViewByCodeDao {
	private static final String Query = "SELECT * FROM bookdetails WHERE BOOKID=? ";

	public BookBean getById(BookBean bb) {
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(Query);

			ps.setInt(1, bb.getId());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				bb.setId(rs.getInt(1));
				bb.setName(rs.getString(2));
				bb.setPrice(rs.getFloat(3));
				bb.setAuthor(rs.getString(4));
			}

			else {
				bb = null;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		return bb;
	}
}
