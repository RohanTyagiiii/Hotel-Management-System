package hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hms.util.HmsDbUtil;

public class Login {
	
	public boolean loginCustomer(String user , String psw) {
		
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="select * from customer_details where email=? and pasword=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, psw);
			ResultSet rs=ps.executeQuery();
			return rs.next();
			
		}catch(Exception e) {
			return false;
		}
	}

public boolean loginAdmin(String user , String psw) {
		
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="select * from admin_details where email=? and pasword=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, psw);
			ResultSet rs=ps.executeQuery();
			return rs.next();
			
		}catch(Exception e) {
			return false;
		}
	}
}
