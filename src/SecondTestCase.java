import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("1-Setup is created");
    }

    @Test(priority=2)
    void searchCustomer(){
        System.out.println("2-This is search customer test");
    }
    @Test(priority=3)
    void addCustomer(){
        System.out.println("3-This is add customer");
        Assert.assertEquals(3,3);
    }


    @Test(priority=4)
    void tearDown(){
        System.out.println("4 - Closing driver");
    }

}
