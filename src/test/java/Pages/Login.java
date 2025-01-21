package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Base;

public class Login extends Base
{

	
	public static void signIn(String email , String password)
	{
		   wait = new WebDriverWait(driver, 10);

	 
		    WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/header/div[2]/div[2]/div/div/ul/li[1]/a")));
		    signInLink.click();
		    WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login[username]")));
		    emailField.sendKeys(email);
		    WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login[password]")));
		    passwordField.sendKeys(password);
		    WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("send")));
		    loginButton.click();
		    Reporter.log("Sign-in successfully completed");
		} 
	   public static void signout()
        {
		   wait = new WebDriverWait(driver, 10);
		   WebElement signOut = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign Out")));
		   signOut.click();
           Reporter.log("Logout Successfully completed");
        }
	
}