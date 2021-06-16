package mypackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven extends BaseClass{
	
	@Test(dataProvider = "MCQ")
	public void dataTest(String username, String password)
	{
		base();
		driver.get("http://muthucsm-001-site5.btempurl.com/");
		driver.findElement(By.id("TxtUserName")).clear();
		driver.findElement(By.id("TxtUserName")).sendKeys(username);
		driver.findElement(By.id("TxtPassword")).clear();
		driver.findElement(By.id("TxtPassword")).sendKeys(password);
		driver.findElement(By.id("BtnLogin")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Index");
	}
	
	@DataProvider(name="MCQ")
	public Object[][] passData()
	{
		ReadExcel r = new ReadExcel("C:\\Karthikraja\\Selenium Automation\\Selenium Practice\\src\\TestDatasheet.xlsx");
		
		int rows = r.getRowCount(0);
		Object[][] data = new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			data[0][0] = r.getData(0, i, 0);
			data[0][1] = r.getData(0, i, 1);
		
		}
		

           return data;		
	}

}
