package seleniumTask;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task8_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://www.google.co.in/webhp");
		
		//To locate the username by Xpath
		WebElement Username = driver.findElement(By.name("q"));
		Username.sendKeys("Subash");
		
		//Using Actions class to access the Mouse
		Actions a = new Actions(driver);
		
		//To access the Mouse(double Click) to select the text
		a.doubleClick(Username).perform();
				
		//Using Robot class to access the keyboard
		Robot r = new Robot();
		
		// to access the keyboard to put (Ctrl+X) to cut
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);		
		
		//To access the Mouse(contextClick) means Right Click
		
		a.contextClick(Username).perform();
		
	}	
}