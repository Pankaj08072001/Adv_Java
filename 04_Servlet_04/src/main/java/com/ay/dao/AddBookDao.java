package com.ay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.ay.bean.BookBean;
import com.ay.connection.DBConnection;

public class AddBookDao {
	private static final String query = "INSERT INTO bookdetails VALUES (?,?,?,?)"; 
	
	public int saveBook(BookBean bb) {
		int k =0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps= con.prepareStatement(query);

			ps.setInt(1, bb.getId());
			ps.setString(2, bb.getName());
			ps.setFloat(3, bb.getPrice());
			ps.setString(4, bb.getAuthor());
			
			 k = ps.executeUpdate();
			 
		}catch(Exception e) {
			System.out.println(k); 

		}
		return k;
	}
}
