package ScreenShots;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullPage {
	
	
	public static void main(String[] args) throws IOException {

		 WebDriverManager.chromedriver().setup();
	 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		Screenshot scr =  new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		 
		ImageIO.write(scr.getImage(), "PNG", new File("C:\\Users\\hp\\Downloads\\TakeScreenshot\\amazonFullPage.png")); 
		 
		 
	}	 

}
