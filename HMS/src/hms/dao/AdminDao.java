package hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import hms.bean.AddHotelDetails;
import hms.util.HmsDbUtil;

public class AdminDao {
	public boolean addHotels(AddHotelDetails ah) {
		try {
			Connection con=HmsDbUtil.getConnection();
			String query="insert into hotel_list values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, ah.getHotelName());
			ps.setString(2,ah.getCity());
			ps.setString(3, ah.getHotelAddress());
			ps.setInt(4, ah.getTotalRoom());
			ps.setInt(5, ah.getContact());
			ps.setInt(6, ah.getRating());
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
	
	

}
