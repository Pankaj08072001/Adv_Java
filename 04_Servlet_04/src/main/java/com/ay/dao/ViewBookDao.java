package com.ay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.ay.bean.BookBean;
import com.ay.connection.DBConnection;

public class ViewBookDao {
	private static final String Query = "SELECT * FROM bookdetails";

	public ArrayList<BookBean> getAllBook() {
		ArrayList<BookBean> al = new ArrayList<BookBean>();
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(Query);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BookBean bb = new BookBean();
				bb.setId(rs.getInt(1));
				bb.setName(rs.getString(2));
				bb.setPrice(rs.getFloat(3));
				bb.setAuthor(rs.getString(4));

				al.add(bb);
			}

		} catch (Exception e) {
			System.out.println("Error");

		}
		return al;
	}
}
