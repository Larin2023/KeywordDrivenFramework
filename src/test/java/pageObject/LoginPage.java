package pageObject;

import Constants.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public static WebDriver driver;
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/oleksii_kolesnik/IdeaProjects/KeywordDrivenFramework/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateToURL() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(FrameworkConstants.BASE_URL);
    }

    public void enterEmail() {
        driver.findElement(By.id("email")).sendKeys(FrameworkConstants.USERNAME);
    }

    public void enterPassword() {
        driver.findElement(By.id("pass")).sendKeys(FrameworkConstants.PASSWORD);
    }

    public void clickForgottenPassword() {
        driver.findElement(By.linkText("Forgotten password?")).click();
    }

    public void closeBrowser() {
        driver.quit();
    }



}
