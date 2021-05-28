package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.HomePageObjects;

public class TestCaseEx {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://automationpractice.com/");
		 
		 //driver.findElement(By.xpath("//a[text()[normalize-space()='Sign in']]")).click(); 
		 
		 HomePageObjects hpo = new HomePageObjects(driver);
		// hpo.signIn().click();
		 hpo.contactUs().click();
	}	 
	
}
