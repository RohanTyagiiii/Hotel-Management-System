package hms.service;

import java.util.ArrayList;

import hms.bean.AddHotelDetails;
import hms.dao.AdminDao;

public class AdminService {
	public boolean sAddHotels(AddHotelDetails ah) {
		AdminDao ad=new AdminDao();
		return ad.addHotels(ah);
		
	}
	
	public ArrayList<AddHotelDetails> sShowHotel(){
		AdminDao ad=new AdminDao();
		return ad.showHotel();
	}

}
