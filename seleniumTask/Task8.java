package seleniumTask;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://en-gb.facebook.com/");
		
		//To locate the username by Xpath
		WebElement Username = driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[1]"));
		Username.sendKeys("Email");
		
		//Using Robot class to access the keyboard
		Robot r = new Robot();
		
		// to access the keyboard to put (Ctrl+A) to select the text
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);		
		
		// to access the keyboard to put (Ctrl+X) to cut
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);		
		
		// to access the keyboard to put (Tab) to move to passwords textbox
		r.keyPress(KeyEvent.VK_TAB);		
		
		// to access the keyboard to put (Ctrl+V) to paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);		
		
	}	
}