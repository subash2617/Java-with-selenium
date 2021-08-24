package seleniumTask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task7_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//for mouse action
		Actions a = new Actions(driver);
		
		//xpath to hover
		WebElement btntutorial = driver.findElement(By.xpath("//div[@title='Courses']"));
		WebElement btnreferences = driver.findElement(By.xpath("//div[@title='Oracle']"));
		
		//mouse to perform
		a.moveToElement(btntutorial);
		System.out.println("Courses is hover now");
		a.moveToElement(btnreferences);
		System.out.println("Oracle is hover now");
	}
}