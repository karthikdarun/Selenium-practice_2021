package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends BaseClass {
	@Test
	public void mouse()
	{
		base();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		Actions action = new Actions(driver);
		WebElement mainOption = driver.findElement(By.id("developers-menu-toggle"));
		action.moveToElement(mainOption).perform();
		WebElement selectoption =  driver.findElement(By.xpath("//a[text()='Events']"));
		selectoption.click();
		
		
	}

}
