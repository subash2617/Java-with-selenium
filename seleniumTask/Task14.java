package seleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task14 {

	public static void main(String[] args) {

		// Property
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");

		// Initialize the driver
		WebDriver driver = new EdgeDriver();

		// URL
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//maximizing the page
		driver.manage().window().maximize();
		
		// To select the single dropdown
		WebElement singledropdown = driver.findElement(By.id("select-demo"));

		Select s = new Select(singledropdown);

		// Select by Using Value
		s.selectByValue("Monday");

		// getOptions
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}
}
