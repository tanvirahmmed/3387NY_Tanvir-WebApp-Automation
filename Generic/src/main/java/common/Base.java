package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by rinko on 8/23/2016.
 */
public class Base {
    public WebDriver driver = null;
@BeforeMethod
@Parameters({"url"})
public void setUp(String url){
    System.setProperty("webdriver.gecko.driver", "C:/Users/rinko/Downloads/geckodriver-v0.10.0-win64/geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.navigate().to(url);
    driver.manage().window().maximize();

}

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    public void clickByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }


    public void sleepFor(int sec)throws InterruptedException {
        Thread.sleep(sec * 1000);
    }


}
