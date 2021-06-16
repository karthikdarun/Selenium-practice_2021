package mypackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MCQ extends BaseClass{
	@Test
	public void customerMaster() throws InterruptedException, IOException
	
	{
	base();
	Properties p =  new Properties();
	FileInputStream file = new FileInputStream("C:\\Karthikraja\\Selenium Automation\\Selenium Practice\\src\\mypackage\\OR.properties");
	p.load(file);
	driver.get("http://muthucsm-001-site5.btempurl.com/");
	driver.findElement(By.id(p.getProperty("username"))).clear();
	driver.findElement(By.id(p.getProperty("username"))).sendKeys("karthiksales2");
	driver.findElement(By.id(p.getProperty("Password"))).clear();
	driver.findElement(By.id(p.getProperty("Password"))).sendKeys("Testing@123");
	driver.findElement(By.id(p.getProperty("Loginbutton"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@onclick='BackDashboard()']")).click();
	driver.findElement(By.xpath(p.getProperty("ProjectMaster"))).click();
	driver.findElement(By.xpath(p.getProperty("CustomerMaster"))).click();
	driver.findElement(By.xpath(p.getProperty("Addbn"))).click();
	driver.findElement(By.xpath(p.getProperty("CustName"))).sendKeys("Dinesh");
	driver.findElement(By.xpath(p.getProperty("MobNo"))).sendKeys("9874563214");
	driver.findElement(By.xpath(p.getProperty("PhNo"))).sendKeys("7896541234");
	driver.findElement(By.xpath(p.getProperty("EmailID"))).sendKeys("kaarthikraajaa@indexinfo.com");
	driver.findElement(By.xpath(p.getProperty("CustomerPoints"))).sendKeys(Keys.SPACE);	
	driver.findElement(By.xpath(p.getProperty("Contact"))).sendKeys("Dinesh");
	driver.findElement(By.xpath(p.getProperty("Addr1"))).sendKeys("111");
	driver.findElement(By.xpath(p.getProperty("Addr2"))).sendKeys("Nehru nagar");
	driver.findElement(By.xpath(p.getProperty("Addr3"))).sendKeys("Chennai");
	driver.findElement(By.xpath(p.getProperty("Save"))).click();
	driver.findElement(By.xpath(p.getProperty("Yes"))).click();
	driver.findElement(By.xpath(p.getProperty("ShowForm"))).click();
	driver.findElement(By.xpath(p.getProperty("SearchCustomer"))).sendKeys("Dinesh");
	driver.findElement(By.xpath(p.getProperty("StatusDropdown"))).click();
	driver.findElement(By.xpath(p.getProperty("Searchbutton"))).click();
	driver.findElement(By.xpath(p.getProperty("StatusText"))).click();
	Assert.assertEquals(driver.findElement(By.xpath(p.getProperty("NameInGrid"))).getText(), "Dinesh");
	driver.close();
	}
	
}
