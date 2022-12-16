package sunny.bd.automationexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectNorway extends BaseDriver{

	@Test(priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void Norway() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='custom-select']"));
				
				//Using Seclect method
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Norway");
		Thread.sleep(3000);
		
	}
}
