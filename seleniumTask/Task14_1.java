package seleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task14_1 {

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
		WebElement multidropdown = driver.findElement(By.id("multi-select"));

		Select s = new Select(multidropdown);
		
		//To check the Dropdown is Multi-select
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		// Select by Using Index
		s.selectByIndex(1);
		
		// Select by Using Value
		s.selectByValue("Texas");
		
		// Select by Using VisibleText
		s.selectByVisibleText("Pennsylvania");
		
		//TO All Selected Options
		System.out.println("*****ALL SELECTED OPTIONS*****");
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		for (WebElement a : selectedoptions) {
			System.out.println(a.getText());
		}
		
		//To deselect
		s.deselectByIndex(1);
		s.deselectByVisibleText("Texas");
		s.deselectByValue("Pennsylvania");
				
		// Select All options
		System.out.println("*****GETOPTIONS*****");
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
			System.out.println(options.get(i).getText());
		}
		
		// Get First selected option
		System.out.println(s.getFirstSelectedOption().getText());
		
		
	}
}
