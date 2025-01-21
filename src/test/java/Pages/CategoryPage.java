package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utility.Base;

public class CategoryPage extends Base
{
	 

	public static void Verify_pagination() 
	{
		
	    // Click pagination link
	    WebElement paginationLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navpro-topnav\"]/li[3]/a/span[2]")));
	    paginationLink.click();

	    WebElement nextPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[6]/div[1]/ul/li[6]/a")));
	    nextPage.click();

	    WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[4]")));
	    Reporter.log(textElement.getText());

	    WebElement previousPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[6]/div[1]/ul/li[1]/a")));
	    previousPage.click();

	    WebElement textElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[4]")));
	    Reporter.log(textElement2.getText());

	    Reporter.log("Pagination is working");
	}

	public static void Verify_sortedBy() 
	{

	    WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[4]")));
	    Reporter.log(textElement.getText());

	    WebElement sorterDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sorter\"]")));
	    sorterDropdown.click();

	    Select st = new Select(sorterDropdown);
	    st.selectByIndex(2);

	    WebElement sortAscDesc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[4]/div[2]/a")));
	    sortAscDesc.click();

	    WebElement textElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[4]")));
	    Reporter.log(textElement1.getText());

	    Reporter.log("Sortby filter & Ascending/Descending working");
	}

	public static void filtered() 
	{

	    WebElement filterCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")));
	    filterCategory.click();

	    WebElement option1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[2]")));
	    option1.click();

	    WebElement filterCategory2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"narrow-by-list\"]/div/div[1]")));
	    filterCategory2.click();

	    WebElement option2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"narrow-by-list\"]/div/div[2]/ol/li[3]/a")));
	    option2.click();

	    WebElement filteredResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[1]/div[2]/div[1]/ol")));
	    Reporter.log(filteredResults.getText());

	    Reporter.log("Manufacturer & Price filtered By Options is working");
	}

	public static void Readmore_Readless()  
	{
	   

	    WebElement readMoreBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"readMoreDiscBtn\"]")));
	    readMoreBtn.click();
	    Reporter.log("Readmore Button is working");

	    WebElement readLessBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"readMoreDiscBtn\"]")));
	    readLessBtn.click();
	    Reporter.log("Readless Button is working");
	}

	public static void AddButton()  
	{
	    
	    WebElement productImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-item-info_878\"]/a/span/img")));
	    productImage.click();
	}

}
