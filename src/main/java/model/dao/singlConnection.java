package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class singlConnection {

	public singlConnection() {
		// TODO Auto-generated constructor stub
	}
	private static Connection connection ;
	static { 
		try {
			Class.forName("com.mysql.jdbd.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/micro_projet","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		return connection;
	}
	

}
