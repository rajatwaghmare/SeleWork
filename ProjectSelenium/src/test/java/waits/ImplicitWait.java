package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ImplicitWait{
		
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
		 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("laptops");
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 
		 
		 
	
	
	}
	
}