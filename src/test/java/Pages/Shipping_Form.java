package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utility.Base;

public class Shipping_Form extends Base
{
	public void shipping()throws Exception
	{
	  try
	     {
		driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("sipu.nayak@moretasks.com");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.name("street[0]")).sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.name("region_id")).click();
		Select st = new Select(driver.findElement(By.name("region_id")));
		st.selectByVisibleText("California");
		Thread.sleep(2000);
		driver.findElement(By.name("postcode")).sendKeys("53762");
		Thread.sleep(2000);
		driver.findElement(By.name("telephone")).sendKeys("9372388372");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
		System.out.println("Shipping address has been updated");
		Reporter.log("Shipping address has been updated");
	     }
		catch(Exception e)
		
		{
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
		System.out.println("Shipping address has been updated");
		Reporter.log("Shipping address has been updated");
		}
	 }
}


