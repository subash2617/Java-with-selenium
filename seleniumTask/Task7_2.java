package seleniumTask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task7_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		//for mouse action
		Actions a = new Actions(driver);
				
		// Drag & Drop
		WebElement from = driver.findElement(By.xpath("//div[contains(text(), 'Scientech Easy')]"));
		WebElement to = driver.findElement(By.xpath("//div[contains(text(), ' Drop here')]"));
		
		//To Perform
		a.dragAndDrop(from, to).perform();
	}	
}