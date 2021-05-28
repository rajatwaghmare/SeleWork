package SeleniumDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DatabaseConnectionUsingWD {
	
	public static void main(String []args) throws SQLException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String host = "localhost";
		String port = "3306";
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/EmpInfo" ,"root" ,"toor");	
		
		Statement  s = conn.createStatement();
		
	    ResultSet  rs =  s.executeQuery("select * from Login where Username='Sagar'");
	    
	    String email="";
	    while(rs.next())
	    {
	    	String username =rs.getString("Username");
	    	System.out.print(username+ "  ");
	    	
	    	email = rs.getString("Email");
	    	System.out.print(email+ "   ");
	    	
	    	String password = rs.getString("password");
	    	System.out.println(password+ "   ");
		
	 }
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);


   }
}