import org.testng.annotations.*;

public class TC1 {

    @BeforeTest
    void beforeTest()
    {
        System.out.println("Before Test is printed");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After Test is printed");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class is printed");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class is printed");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method is printed");

    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method is printed.");

    }

    @Test(priority=5, enabled = false)
    void test1(){
        System.out.println("Test 1 is run");
    }

    @Test(priority=4)
    void test2(){
        System.out.println("Test 2 is run");
    }
}
