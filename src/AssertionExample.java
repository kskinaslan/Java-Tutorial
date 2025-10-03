import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class AssertionExample {

//    1. driver.close()
//
//            ✅ Closes only the current browser tab (or window)


//    2. driver.quit()
//
//            ✅ Closes all browser windows and ends the WebDriver session completely.

    WebDriver driver;
    @BeforeClass
    void setup (){
        System.setProperty("webdriver.chrome.driver","/Users/aslankeskin/Downloads/chrome_driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demoblaze.com/");
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



