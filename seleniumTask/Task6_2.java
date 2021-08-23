package seleniumTask;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task6_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://www.google.co.in/");
		
		// navigate to youtube
		driver.navigate().to("https://www.youtube.com/");
		System.out.println("Navigated to Youtube");
		
		// navigate back to google
		driver.navigate().back();
		System.out.println("Navigated to google");

		//navigate forward to youtube
		driver.navigate().forward();
		System.out.println("Navigate forward to youtube");
		
		//to refresh the page
		driver.navigate().refresh();
		System.out.println("Website is refreshed");
	}
}