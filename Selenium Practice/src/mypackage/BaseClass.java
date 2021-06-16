package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	public static void base()
	{
	 driver =  new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "c:\\chromerdriver.exe");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
