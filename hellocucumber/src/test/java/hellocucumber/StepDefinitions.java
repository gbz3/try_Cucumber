package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

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
    
}
