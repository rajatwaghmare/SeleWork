package CoronaC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CoronaNumbers {             // Program in under construction

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
	 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://edata.ndtv.com/coronavirus/table/india_table.html?shgraph=1&days=7");

		 String text = driver.findElement(By.xpath("(//span[@class='ind-mp_num'])[1]")).getText();
		 
		// int total = text.size();
		
		 int sum=0;
		 String first_number = text.split("\n")[0];
		 
		 String modified_no = first_number.replaceAll(",","");
		
		 int number_of_case = Integer.valueOf(modified_no);
		 
		 sum = sum + number_of_case;
		 
		 if(number_of_case==sum) {
			 System.out.println("Sum of all cases are same as total numbers");
		 }
				 
		
	}
}
