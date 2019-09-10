package hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import hms.bean.AddHotelDetails;
import hms.bean.BookHotelCustomer;
import hms.bean.SignUp;
import hms.util.HmsDbUtil;

public class CustomerDao {
	
	public ArrayList<AddHotelDetails> showHotel(){
		try {
			ArrayList<AddHotelDetails> al= new ArrayList<AddHotelDetails>();
			Connection con=HmsDbUtil.getConnection();
			String query="select * from hotel_list";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String hotelName=rs.getString(1);
				String city=rs.getString(2);
				String hotelAddress=rs.getString(3);
				int totalRoom=rs.getInt(4);
				int contact=rs.getInt(5);
				int rating=rs.getInt(6);
				AddHotelDetails ad=new AddHotelDetails(hotelName, city, hotelAddress, contact, totalRoom, rating);
				al.add(ad);	
			}
			return al;
		}catch(Exception e) {
			return null;
		}	
	}
	
	public SignUp customerProfile(String uname){
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="select * from customer_details where email=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			SignUp s=null;
			while(rs.next()) {
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String email=rs.getString(4);
				String mobile=rs.getString(5);
				String address=rs.getString(6);
				String country=rs.getString(7);
				String typeOfId=rs.getString(8);
				String idNo=rs.getString(9);
				String pasword=rs.getString(10);
			    s= new SignUp(name, gender, email, mobile, address, country, typeOfId, idNo, pasword);	
			}
			return s;
		}catch(Exception e) {
			return null;
		}	
	}
	
	public boolean changePassword(String uname, String newPassword) {
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="update customer_details set pasword=? where email=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, newPassword);
			ps.setString(2, uname);
			int n=ps.executeUpdate();
			if(n>0)
				return true;
			else
				return false;
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean hotelBookDetails(BookHotelCustomer b) {
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="insert into hotel_name values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, b.getCustomerName());
			ps.setString(2, b.getHotelName());
			ps.setString(3, b.getFromDate());
			ps.setString(4, b.getToDate());
			ps.setInt(5, b.getTotalRoom());
			int n=ps.executeUpdate();
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
