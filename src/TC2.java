import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class is printed");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class is printed");
    }

    @BeforeMethod
    void beforeTest(){
        System.out.println("Before Method is printed");

    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method is printed.");

    }

    @Test(priority=2)
    void test3(){
        System.out.println("Test 3 is run");
    }

    @Test(priority=1)
    void test4(){
        System.out.println("Test 4 is run");
    }

    @BeforeSuite
    void beforeSuit(){
        System.out.println("before suit is printed");
    }
    @AfterSuite
    void afterSuit(){
        System.out.println("after suit is printed");
    }
}
