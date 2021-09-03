package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task11 {

	public static void main(String[] args) {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the Webdriver
		WebDriver driver = new EdgeDriver();
		//Initialize the JavaScriptExecutor
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		//URL
		driver.get("https://en-gb.facebook.com/");
		//maximizing the page
		driver.manage().window().maximize();
		
		//To locate the username by Xpath
		WebElement Usertext = driver.findElement(By.id("email"));
		
		// entering the value by JavaScriptExecutor
		jk.executeScript("arguments[0].setAttribute('value', 'subash')", Usertext);
		
		//printing that username
		Object text = jk.executeScript("return arguments[0].getAttribute('value')", Usertext);
		System.out.println(text);
		
	}
}