package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;

import utility.Base;

public class Payment_Page extends Base
{
	public static void Proceed_To_Pay() throws Exception
	  {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	  	   js.executeScript("window.scrollBy(0,500)", "");
	  	   Thread.sleep(1000);
		  driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[3]/ol/li[3]/div[2]/form/div/div[11]/div/button/span/span")).click();
		  Thread.sleep(2000);
		  Reporter.log("Medical condition page has been filled ");
	  }
}
