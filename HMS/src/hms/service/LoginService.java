package hms.service;


import hms.dao.Login;

public class LoginService {
	
	public boolean sLoginCustomer(String user , String psw) {
		Login l=new Login();
		return l.loginCustomer(user, psw);
	}
	
	public boolean sLoginAdmin(String user , String psw) {
		Login l=new Login();
		return l.loginAdmin(user, psw);
	}

}
