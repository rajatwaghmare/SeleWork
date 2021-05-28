package ScreenShots;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class ParticularElement {

	public static void main(String[] args) throws IOException {

		 WebDriverManager.chromedriver().setup();
	 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.cricbuzz.com/"); 	
		 
		 WebElement img = driver.findElement(By.xpath("(//img[@id='cb-logo-main-menu']"));
		 
		 Screenshot logoImageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,img);
		 	   
		 ImageIO.write(logoImageScreenshot.getImage(), "PNG", new File("C:\\Users\\hp\\Downloads\\TakeScreenshot\\cricbuzz.png")); 


	}
}