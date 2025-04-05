package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today)? "TGIF": "Nope";
    }
}

public class StepDefinitions {

    private String _today;
    private String actual;

    @Given("today is {string}")
    public void today_is_friday(String today) {
        _today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actual = IsItFriday.isItFriday(_today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expected) {
        assertEquals(expected, actual);
    }

    /// ///////////////////////////////////////////
    private Account account;
    private int withdrawAmount;
    private final BankService bankService = mock(BankService.class);
    private boolean withdrawSuccess;

    @Given("口座残高が{int}円である")
    public void givenInitialBalance(int initialBalance) {
        account = new Account(initialBalance, bankService);
    }

    @Given("引き出し金額が{int}円である")
    public void givenWithdrawAmount(int amount) {
        withdrawAmount = amount;
    }

    @When("お金を引き出す")
    public void when() {
        try {
            account.withdraw(withdrawAmount);
            withdrawSuccess = true;
        } catch (Exception e) {
            withdrawSuccess = false;
        }
    }

    @Then("口座残高は{int}円になる")
    public void thenBalance(int expectedBalance) {
        assertEquals(expectedBalance, account.getBalance());
    }

    @Then("銀行サービスは引き出し処理を{int}回呼び出す")
    public void thenVerifyCall(int times) {
        verify(bankService, times(times)).withdraw(account, withdrawAmount);
    }
}
