package seleniumTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task13 {

	public static void main(String[] args) throws IOException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://en-gb.facebook.com/");
		//maximizing the page
		driver.manage().window().maximize();
		
		//Facebook Userid & password
		driver.findElement(By.id("email")).sendKeys("hellobob");
		driver.findElement(By.id("pass")).sendKeys("234567");
		
		//Typecasting
		TakesScreenshot tk = (TakesScreenshot) driver;
		
		// getScreenshot
		File s = tk.getScreenshotAs(OutputType.FILE);
		
		//To provide the destination path
		File d = new File("C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\output\\img.png");
		
		//Copy the Screenshot to the destination path
		FileUtils.copyFile(s, d);
	}
}