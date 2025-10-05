import org.testng.annotations.DataProvider;

public class DataproviderClass {


    @DataProvider(name="LoginDataProvider")
    public Object[][] getData (){

        Object[][] data = { {"abc@gmai.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }
}
