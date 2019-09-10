package hms.bean;

public class BookHotelCustomer {
	
	String customerName,hotelName,fromDate,toDate;
	int totalRoom;
	
	public BookHotelCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookHotelCustomer(String customerName, String hotelName, String fromDate, String toDate, int totalRoom) {
		super();
		this.customerName = customerName;
		this.hotelName = hotelName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.totalRoom = totalRoom;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

	@Override
	public String toString() {
		return "BookHotelCustomer [customerName=" + customerName + ", hotelName=" + hotelName + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", totalRoom=" + totalRoom + "]";
	}
	
	

}
