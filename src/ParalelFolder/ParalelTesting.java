package ParalelFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParalelTesting {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/aslankeskin/Downloads/chrome_driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");


        WebElement logo = driver.findElement(By.cssSelector("a[id=\"nava\"] img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);

    }

    @Test
    void titleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/aslankeskin/Downloads/chrome_driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");

        Assert.assertEquals(driver.getTitle(),"STORE");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
