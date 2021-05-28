package SeleniumDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	public static void main(String []args) throws SQLException {
		
		String host = "localhost";
		String port = "3306";
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/EmpInfo" ,"root" ,"toor");	
		
		Statement  s = conn.createStatement();
		
	    ResultSet  rs =  s.executeQuery("select * from Login where Username='Sagar'");
	    
	    while(rs.next())
	    {
	    	String username =rs.getString("Username");
	    	System.out.print(username+ "  ");
	    	
	    	String email = rs.getString("Email");
	    	System.out.print(email+ "   ");
	    	
	    	String password = rs.getString("password");
	    	System.out.println(password+ "   ");
		
	 }

   }
}