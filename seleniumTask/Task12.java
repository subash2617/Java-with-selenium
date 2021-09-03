package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Task12 {

	public static void main(String[] args) {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the Webdriver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		//maximizing the page
		driver.manage().window().maximize();
		
		//To find count of frame
		java.util.List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		
		//Find the Xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@src, 'youtube.com')]"));
		
		//Switching to frame
		driver.switchTo().frame(frameElement);
		
		WebElement btn = driver.findElement(By.xpath("//button[@aria-label='Play']"));
		btn.click();
		
		//Switching back to defaultContent
		driver.switchTo().defaultContent();
		
		WebElement font = driver.findElement(By.xpath("//font[text()='THIS IS A DEMO PAGE FOR TESTING']"));
		System.out.println(font.getText());
	}
}