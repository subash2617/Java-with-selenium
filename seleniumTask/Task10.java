package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task10 {

	public static void main(String[] args) {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the Webdriver
		WebDriver driver = new EdgeDriver();
		//Initialize the JavaScriptExecutor
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		//URL
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		//maximizing the page
		driver.manage().window().maximize();
		
		//To locate the area by Xpath
		WebElement textslt = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		
		//scroll function
		jk.executeScript("arguments[0].scrollIntoView(true)", textslt);
		
	}
}