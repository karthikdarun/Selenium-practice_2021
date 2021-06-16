package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframes extends BaseClass {
	
	@Test
	public void iframeTest() throws InterruptedException
	{
		base();
		driver.get("https://demoqa.com/frames");
		int frameCount =  driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		driver.switchTo().frame("frame1");
		String frameText = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(frameText);
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		driver.switchTo().frame("frame2");
		String frameText2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Frame 2 is "+frameText2);
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
