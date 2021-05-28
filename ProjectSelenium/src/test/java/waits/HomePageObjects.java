package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	
	WebDriver driver;
	By closePopFormButton=By.xpath("//button[@class='_2KpZ6l _2doB4z']");	
	
	void closePopFormButton()
	{
		driver.findElement(closePopFormButton);
	}

}
