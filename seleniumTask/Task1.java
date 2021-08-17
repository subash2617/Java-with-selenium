package seleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://www.amazon.in/");
		
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//get CurrentURL
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//close the site
		driver.close();
	}
}