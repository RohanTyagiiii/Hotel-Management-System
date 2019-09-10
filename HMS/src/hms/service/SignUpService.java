package hms.service;

import hms.bean.SignUp;
import hms.dao.CustomerDetails;

public class SignUpService {
	
	public boolean hmsInesertCustomerDetails(SignUp su) {
		CustomerDetails cd=new CustomerDetails();
		return cd.insertCustomerDetails(su);
	}

}
