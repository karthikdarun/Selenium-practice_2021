package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void Googlesearch() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriber.chrome.driver","C:\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("hdfc netbanking");
		driver.findElement(By.name("q")).sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		List<WebElement> allelements = driver.findElements(By.xpath("//li[@class='sbct']"));
		Thread.sleep(3000);
		System.out.println(allelements.size());
		Thread.sleep(3000);
		for(int i=0;i<allelements.size();i++)
		{	
			System.out.println(allelements.get(i).getText());
			if(allelements.get(i).getText().equalsIgnoreCase("hdfc netbanking password reset"))
			{
				allelements.get(i).click();
			break;
			}
		}
	}
	
	
	
}
