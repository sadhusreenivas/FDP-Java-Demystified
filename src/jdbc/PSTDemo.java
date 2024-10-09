package jdbc;
import java.sql.*;

public class PSTDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con !=null)
			System.out.println("Connection success");
		else
			System.out.println("Connection failed");
		
	   String iq = "insert into student values(?,?,?)" ;
       PreparedStatement pst = con.prepareStatement(iq);
       
       pst.setInt(1, 111);
       pst.setString(2,"Rahul");
       pst.setDouble(3, 8.1);
       
	   int x = pst.executeUpdate();
	   if(x>=1)
		   System.out.println(x+" record(s) updated");
	   
	     // retrive all the data and display
		   ResultSet rs = pst.executeQuery("Select * from student");
			
			System.out.println("SID:\t\tSNAME:\t\tGPA:");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
			}
			
			// close
			con.close();
		
	}

}
