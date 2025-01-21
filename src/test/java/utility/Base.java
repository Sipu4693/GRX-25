package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        
        driver.get("https://goodrxmedicine.com");
    }
 
    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Common utility methods

    public static void waitForElementToBeVisible(WebElement element) 
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickElement(WebElement element) 
    {
        waitForElementToBeVisible(element);
        element.click();
    }

    public static void enterText(WebElement element, String text) 
    {
        waitForElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public static String getElementText(WebElement element) 
    {
        waitForElementToBeVisible(element);
        return element.getText();
    }

    public static boolean isElementDisplayed(WebElement element) 
    {
        try {
            waitForElementToBeVisible(element);
            return element.isDisplayed();
            } 
        catch (Exception e) 
        {
            return false;
        }
    }
}
