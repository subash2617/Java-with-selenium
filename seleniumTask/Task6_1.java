package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task6_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//Initialize the driver
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://en-gb.facebook.com/");
		//checking the logo is present or not
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class, fb_logo)]"));
		boolean b = logo.isDisplayed();
		System.out.println(b);
		if (b==true) {
			System.out.println("logo is present");
		}
		else {
			System.out.println("logo is not present");
		}
		
		//checking the Textbox is Enable or not
		WebElement textbox = driver.findElement(By.xpath("//input[@name='email']"));
		boolean txtbox = textbox.isEnabled();
		System.out.println(txtbox);
		if (txtbox==true) {
			System.out.println("Textbox is Enable");
		}
		else {
			System.out.println("Textbox is not Enable");
		}
	}
}