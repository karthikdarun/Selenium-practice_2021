package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable extends BaseClass{
	/*@Test
	public void table()
	{
		base();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> heading = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println(heading.size());
		for(WebElement HeadNames:heading)
		{
			
			System.out.println(HeadNames.getText());
		}
		
		List<WebElement> company= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println(company.size());
		WebElement elementValue = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]"));
		System.out.println(elementValue.getText());
		
		}
	*/
	@Test
	public void table1()
	{
		base();
		driver.get("https://www.redbus.in/");
		/*driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@class= 'current day']")).click();
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
		driver.findElement(By.xpath("//td[text()= '15']")).click();*/
		
//		  driver.findElement(By.xpath("//*[@class= 'current day']")).click();
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
		List<WebElement> date = driver.findElements(By.xpath("//*[@class='rb-monthTable first last'] /tbody/tr/td"));
		System.out.println(date.size());
		for(int i=0;i<date.size();i++)
		{
			if(date.get(i).getText().equalsIgnoreCase("30"))
			{
				date.get(i).click();
				break;
			}
		}
	}
	}

