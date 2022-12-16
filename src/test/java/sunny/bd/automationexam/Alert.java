package sunny.bd.automationexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alert extends BaseDriver{

	@Test(priority = 0)
	public void startWebsite() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void alert() throws InterruptedException {
		WebElement jsAlert= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		SoftAssert softAssert = new SoftAssert();
		jsAlert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		String resultText = result.getText();
		softAssert.assertEquals(resultText, "You successfully clicked an alert");
		
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		jsPrompt.click();
		driver.switchTo().alert().sendKeys("Hi I'm Sunny");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		softAssert.assertAll();
	}
}
