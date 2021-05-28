package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By signIn = By.xpath("//a[text()[normalize-space()='Sign in']]");
	
	By contactUs = By.xpath("//a[@title='Contact Us']");
	
	public WebElement signIn() 
	{
		return  driver.findElement(signIn);
	}

	public WebElement contactUs() 
	{
		System.out.println(driver);
		return  driver.findElement(contactUs);
	}
		 
}