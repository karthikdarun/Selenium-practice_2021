package mypackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultipleWindow extends BaseClass{
	
	@Test
	public void windowHandle()
	{
		base();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String mainwindow =  driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext())
		{
			String childWindow = i1.next();
			if(!mainwindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				String msg = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(msg);
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
	}

}
