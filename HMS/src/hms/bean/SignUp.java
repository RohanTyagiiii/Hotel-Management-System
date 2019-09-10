package hms.bean;

public class SignUp {
	String name, gender,email,mobile,address,country,typeOfId,idNo,pasword;

	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignUp(String name, String gender, String email, String mobile, String address, String country,
			String typeOfId, String idNo, String pasword) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.country = country;
		this.typeOfId = typeOfId;
		this.idNo = idNo;
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTypeOfId() {
		return typeOfId;
	}

	public void setTypeOfId(String typeOfId) {
		this.typeOfId = typeOfId;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	@Override
	public String toString() {
		return "SignUp [name=" + name + ", gender=" + gender + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", country=" + country + ", typeOfId=" + typeOfId + ", idNo=" + idNo + ", pasword="
				+ pasword + "]";
	}
	
	

}
