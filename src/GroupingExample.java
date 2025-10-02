import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("Test 1 is run");
    }
    @Test(groups = {"regression"})
    void test2(){

        System.out.println("Test 2 is run");
    }
    @Test(groups = {"regression"})
    void test3(){

        System.out.println("Test 3 is run");
    }
    @Test(groups = {"sanity","regression"})
    void test4(){

        System.out.println("Test 4 is run");
    }
}
