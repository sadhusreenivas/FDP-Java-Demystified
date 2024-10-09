package jdbc;
import java.sql.*;
public class DBConnection {
	
	public Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
		// 1. Register / Load the driver class
				 Class.forName("com.mysql.cj.jdbc.Driver"); // Type 4 driver class name
				
				//2. Establish Connection
				 String url = "jdbc:mysql://localhost:3306/fdpdb"; // student
		         String uname = "root";
		         String pwd = "root";
		         Connection con  = DriverManager.getConnection(url,uname, pwd);
		       
		         return con;
	}

}
