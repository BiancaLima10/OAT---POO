package br.unincor.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	
	private String SERVER;
	private String PORT;
	private String DB_NAME;
	private String USER;
	private String PASSWORD;
	
	public Connection CON;
	
	public DBConnection() {
		super();
		SERVER = "sql10.freemysqlhosting.net";
		PORT = "3306";
		DB_NAME = "sql10209198";
		USER = "sql10209198";
		PASSWORD = "fU7I9RJWFEE";
		CON = null;
	}
	
	public void openDBConnection() {
		try {
			CON = DriverManager.getConnection(getURL(), USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDBConnection() {
		try {
			if (CON != null) {
				CON.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String getURL() {
		return "jdbc:mysql://"+SERVER+":"+PORT+"/"
				+DB_NAME+"?useSSL=false";
	}	

}
