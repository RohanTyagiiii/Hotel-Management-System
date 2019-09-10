package hms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class HmsDbUtil {
	
	public static Connection  getConnection() {
		Connection con=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rohan","rohan1589");
		return con;
		}catch(Exception e) {
			e.printStackTrace();
			return con;
		}
	}

}
