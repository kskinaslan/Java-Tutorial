package ListenerTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    public void onStart(ITestContext arg){
        System.out.println("Starts test execution....." + arg.getName() );
    }

    public void onFinish(ITestContext arg){
        System.out.println("Finish test execution....." + arg.getName() );
    }

    public void onTestStart(ITestResult arg){
        System.out.println("Starts on test ....." + arg.getName() );
    }

    public void onTestSkipped(ITestResult arg){
        System.out.println("Skipped test execution....." + arg.getName() );
    }

    public void onTestFailure(ITestResult arg){

    }
}
