import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

    @Test(dataProvider = "LoginDataProvider")
    public void login(String email,String pwd){

        System.out.println(email + " " + pwd);
    }

    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataproviderClass.class)
    public void loginWithClass(String email,String pwd){

        System.out.println(email + " " + pwd);
    }

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData (){

        Object[][] data = { {"abc@gmai.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }
}
