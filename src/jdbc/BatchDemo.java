package jdbc;

import java.sql.*;
public class BatchDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con !=null)
			System.out.println("Connection success");
		else
			System.out.println("Connection failed");
		
		// batch processing
		Statement st = con.createStatement();
		String iquery = "insert into student values(105,'Bumra',8.3),(106,'Siraj',7.7)";
		st.addBatch(iquery);
		String uquery = "update student set gpa=8.0 where sid = 103";
		st.addBatch(uquery);
		String dquery = "delete from student where gpa <7.9";
		st.addBatch(dquery);
		
		st.executeBatch();
		
		// retrive all the data and display
		ResultSet rs = st.executeQuery("Select * from student");
		
		System.out.println("SID:\t\tSNAME:\t\tGPA:");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
		}
		
		// close
		con.close();
	}
}
