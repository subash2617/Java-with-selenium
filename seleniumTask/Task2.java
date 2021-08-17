package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://www.udemy.com/join/login-popup/?skip_suggest=1&locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2Flogout%2F&response_type=html");
		
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//To locate the username textbox
		WebElement textboxUsername = driver.findElement(By.name("email"));
		textboxUsername.sendKeys("bob@abc.com");
		
		//To locate the user password textbox
		WebElement textboxpassword = driver.findElement(By.name("password"));
		textboxpassword.sendKeys("Pass@321");
		
		//close the site
		driver.close();
	}
}