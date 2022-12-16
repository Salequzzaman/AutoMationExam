package sunny.bd.automationexam;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseDriver{

	@Test(priority = 0)
	public void startWebsite() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void hover() throws InterruptedException {
		
		Actions action = new Actions(driver);
		

		WebElement automative = driver.findElement(By.xpath("//span[normalize-space()='Automotive & Motorbike']"));
		WebElement Riding = driver.findElement(By.xpath("//span[normalize-space()='Motorcycle Riding Gear']"));
		WebElement helmet = driver.findElement(By.xpath("//span[normalize-space()='Helmet']"));
		
		action.moveToElement(automative).perform();
		Thread.sleep(5000);
		
		action.moveToElement(Riding).perform();
		Thread.sleep(5000);
		
		action.moveToElement(helmet).perform();
		Thread.sleep(5000);
		
	}
}
