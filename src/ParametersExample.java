import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersExample {


    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup (String browser,String url){

        if(browser.equalsIgnoreCase("Chrome")){

            System.setProperty("webdriver.chrome.driver","/Users/aslankeskin/Downloads/chrome_driver/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver","/Users/aslankeskin/Downloads/chrome_driver/chromedriver");
            driver = new FirefoxDriver();
        }
        driver.get(url);
    }

    @Test(priority = 1)
    void logoTest(){

        WebElement logo = driver.findElement(By.cssSelector("a[id=\"nava\"] img"));

        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed on the page");

    }
    @Test(priority = 2)
    void homeTitle(){

        String title =  driver.getTitle();
        Assert.assertEquals(title, "Store","title is not same");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}



