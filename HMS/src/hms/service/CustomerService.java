package hms.service;

import java.util.ArrayList;

import hms.bean.AddHotelDetails;
import hms.bean.BookHotelCustomer;
import hms.bean.SignUp;
import hms.dao.CustomerDao;

public class CustomerService {
	
	public ArrayList<AddHotelDetails> sShowHotel(){
		CustomerDao ad=new CustomerDao();
		return ad.showHotel();
	}
	
	public SignUp sCustomerProfile(String uname) {
		CustomerDao ad=new CustomerDao();
		return ad.customerProfile(uname);
	}
	
	public boolean sChangePassword(String uname, String newPassword) {
		CustomerDao cd=new CustomerDao();
		return cd.changePassword(uname, newPassword);
		
	}
	
	public boolean hotelBookDetails(BookHotelCustomer b) {
		CustomerDao cd = new CustomerDao();
		return cd.hotelBookDetails(b);
	}

}
