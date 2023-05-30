import org.example.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
   private Account account;
    private String name;
    private boolean expectedResult;



    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"Влад Сентяков", true},
                {" Влад Сентяков", false},
                {"Влад Сентяков ", false},
                {"V S", true},
                {"Vl", false},
                {"vlad Sentyakovrtyklflfl", false},
                {"Vladislav Sentyakov", true},
                {"Vladislav Sentyakovv", false}
        };
    }
    @Test
    public void accountTest(){
        account =new Account(name);
        assertEquals(expectedResult,account.checkNameToEmboss());
    }

}
