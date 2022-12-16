package sunny.bd.automationexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckBox extends BaseDriver{

	
	@Test(priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void checkbox() throws InterruptedException {
		//Gender
		WebElement genderFemale = driver.findElement(By.id("female"));
		WebElement genderMale = driver.findElement(By.id("male"));
		
		//Select Days
		WebElement Tuesday = driver.findElement(By.id("tuesday"));
		WebElement friday = driver.findElement(By.id("friday"));
		
		genderFemale.click();
		Thread.sleep(3000);
		genderMale.click();
		Thread.sleep(3000);
		
		Tuesday.click();
		friday.click();
		Thread.sleep(5000);
		
	}
}
