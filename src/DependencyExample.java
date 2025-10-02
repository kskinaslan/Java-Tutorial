import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependencyExample {

    @BeforeClass
    void beforeMethod(){
        System.out.println(" The person got into a car");
    }

    @Test()
    void carStarted(){
        System.out.println(" the car is started.");
    }

    @Test(dependsOnMethods = "carStarted")
    void drivingCar(){
        System.out.println("The person is driving the car");
        Assert.fail("The collider is happened");
    }

    @Test(dependsOnMethods = "drivingCar" , alwaysRun = true)
    void parkcara(){
        System.out.println("the car is parked");

    }
}
