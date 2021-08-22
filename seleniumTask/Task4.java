package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task4 {

	public static void main(String[] args) {
		
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
		
		//Print the text in the website
		WebElement txt = driver.findElement(By.xpath("//h2[contains(text(), 'people')]"));
		//String text = txt.getText();
		System.out.println(txt.getText());
		
		//login button click
		WebElement btnLogIn = driver.findElement(By.name("login"));
		btnLogIn.click();

	}
}