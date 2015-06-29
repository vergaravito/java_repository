package Servlets;

import java.sql.*;

public class Connessione {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbtest?user=root&password=root");
		return conn;
	}
}