package hms.controller;

import hms.bean.SignUp;
import hms.service.SignUpService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignUpService sp=new SignUpService();
		SignUp su=new SignUp("Rohan", "Male", "rohan@gmail.com", "7065953642", "Ghaziabad", "India", "Aadhar", "616946747217", "raka1589");
		boolean flag=sp.hmsInesertCustomerDetails(su);
		if(flag)
			System.out.println("done");
		else
			System.out.println("Not done");

	}

}
