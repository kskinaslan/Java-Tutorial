/*
@Test annotation for running test
Test order is alphabetic so it will run 2-1-3
if you use (priority=1), u can specify running order


 */


import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("1-Setup is created");
    }

    @Test(priority=2)
    void login(){
        System.out.println("2-This is login test");
    }
    @Test(priority=3)
    void tearDown(){
        System.out.println("3-Closing browser");
    }

}
