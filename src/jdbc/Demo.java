package jdbc;
import java.sql.*; // JDBC API
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Register / Load the driver class
		 Class.forName("com.mysql.cj.jdbc.Driver"); // Type 4 driver class name
		
		//2. Establish Connection
		 String url = "jdbc:mysql://localhost:3306/fdpdb"; // student
         String uname = "root";
         String pwd = "root";
		
         Connection con  = DriverManager.getConnection(url,uname, pwd);
         if(con != null)
        	 System.out.println("Connection estalished!");
         else
        	 System.out.println("Connection failed!");
         
         // 3. create statement
         Statement st = con.createStatement();
         
         //4. Execute Query
         
         String uquery = "update student set sid = 104 where sname = 'hardik'";
         int x = st.executeUpdate(uquery);
         if(x>1)
        	 System.out.println("record(s) updated");
         
         String query = "select * from student";
         ResultSet rs = st.executeQuery(query);
         
         // 5. Process results and close the connection
         while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
         }
         
         con.close();
	}

}
