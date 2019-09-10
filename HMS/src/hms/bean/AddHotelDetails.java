package hms.bean;

public class AddHotelDetails {
	String hotelName, city ,hotelAddress;
	int contact,totalRoom , rating;
	public AddHotelDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddHotelDetails(String hotelName, String city, String hotelAddress, int contact, int totalRoom, int rating) {
		
		this.hotelName = hotelName;
		this.city = city;
		this.hotelAddress = hotelAddress;
		this.contact = contact;
		this.totalRoom = totalRoom;
		this.rating = rating;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getTotalRoom() {
		return totalRoom;
	}
	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "addHotel [hotelName=" + hotelName + ", city=" + city + ", hotelAddress=" + hotelAddress + ", contact="
				+ contact + ", totalRoom=" + totalRoom + ", rating=" + rating + "]";
	}
	
	

}
