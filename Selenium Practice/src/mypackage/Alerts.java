package mypackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alerts extends BaseClass{
	
	/*@Test
	public void confirmbox()
	{
	base();
	
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("confirmButton")).click();
	driver.switchTo().alert().dismiss();
	}*/
	
	
	@Test
	public void promptbox() throws InterruptedException
	{
		base();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("karthik");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Karthikraja");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
