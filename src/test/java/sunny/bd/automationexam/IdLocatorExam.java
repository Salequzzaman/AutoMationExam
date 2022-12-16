package sunny.bd.automationexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IdLocatorExam extends BaseDriver{

	@Test(priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void formId() throws InterruptedException {
		//Using ID Locator
		WebElement Name = driver.findElement(By.id("name"));
		WebElement Mobilenumber = driver.findElement(By.id("phone"));
		WebElement Emailaddress = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Address = driver.findElement(By.id("address"));
		
		//Using Name Locator
		WebElement submit = driver.findElement(By.name("submit"));
		
		Name.sendKeys("Salequzzaman");
		Thread.sleep(2000);
		
		Mobilenumber.sendKeys("123456789");
		Thread.sleep(2000);

		Emailaddress.sendKeys("test@mail.com");
		Thread.sleep(2000);
		
		Password.sendKeys("Sunny");
		Thread.sleep(2000);
		
		Address.sendKeys("BD-Dhaka");
		Thread.sleep(2000);
		
		submit.click();
		Thread.sleep(5000);
		
		
	}
}
