package hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hms.bean.SignUp;
import hms.util.HmsDbUtil;

public class CustomerDetails {
	public boolean insertCustomerDetails(SignUp su) {
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="insert into customer_details values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, su.getName());
			ps.setString(2, su.getGender());
			ps.setString(3, su.getEmail());
			ps.setString(4, su.getMobile());
			ps.setString(5, su.getAddress());
			ps.setString(6, su.getCountry());
			ps.setString(7, su.getTypeOfId());
			ps.setString(8, su.getIdNo());
			ps.setString(9, su.getPasword());
			int n =ps.executeUpdate();
			if(n>0)
				return true;
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	

}
