package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://en-gb.facebook.com/");
		
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//To locate the username by Xpath
		WebElement Username = driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[1]"));
		Username.sendKeys("bob@abc.com");
		
		//To locate the user password by Xpath
		WebElement Password = driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[2]"));
		Password.sendKeys("Pass@321");
		
		//login button click
		WebElement btnLogIn = driver.findElement(By.name("login"));
		btnLogIn.click();
		
		//To Wait for the loading
		Thread.sleep(3000);
		//get CurrentURL
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//check the site navigate to password failure page or not
		if (currenturl.contains("login")) {
			System.out.println("your navigate to password failure page");
		}
		else {
			System.out.println("your not navigate to password failure page");
		}

	}
}