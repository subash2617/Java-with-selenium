package seleniumTask;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task9 {

	public static void main(String[] args) throws InterruptedException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//To Locate Java Script Normal Alert Box
		WebElement btn1 = driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']"));
		btn1.click();
		
		//Accepting the Alert
		Alert normalAlert = driver.switchTo().alert();
		normalAlert.accept();
		System.out.println("Alert Accepted");
		
		//To Locate Java Script Confirm Alert Box
		WebElement btn2 = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
		btn2.click();
				
		// Canceling the Alert
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		System.out.println("Alert Canceled");
		
		//To Locate Java Script Prompt Alert Box
		WebElement btn3 = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));
		btn3.click();
						
		// Enter the Name & Accepting the Alert
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Subash");
		promptAlert.accept();
		System.out.println("Name Entered & Alert Accepted");
				
	}	
}