package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 
{
	@Test
	  public static void Order()throws Exception
	  {
		  WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.cheapmedicineshop.com");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("cenforce 100");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button/span")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"product-addtocart-button-1\"]/div/button/span/b")).click();
	      Thread.sleep(3000);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0, 500);");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li/button")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("customer-email")).sendKeys("sipu.nayak@moretasks.com");
	      Thread.sleep(1000);
	      driver.findElement(By.name("firstname")).sendKeys("Test");
	      Thread.sleep(400);
	      driver.findElement(By.name("lastname")).sendKeys("Test");
	      Thread.sleep(200);
	      driver.findElement(By.name("street[0]")).sendKeys("123 William Street");
	      Thread.sleep(200);
	      driver.findElement(By.name("city")).sendKeys("New York");
	      Thread.sleep(300);
	      driver.findElement(By.name("region_id")).sendKeys("New York");
	      Thread.sleep(300);
	      driver.findElement(By.name("postcode")).sendKeys("10038-3804");
	      Thread.sleep(300);
	      driver.findElement(By.name("telephone")).sendKeys("876543456");
	      Thread.sleep(300);
	      driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0, 500);");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id=\"medical-condition-form\"]/div[4]/div/button")).click();
	      Thread.sleep(200);
	      driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div[1]/div[2]/div[2]/div[4]/div/button")).click();
	      Thread.sleep(3000);
	      Reporter.log("Passed");
	      driver.quit();

	  }
}
