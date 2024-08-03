package hellocucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    private String actual;

    @Given("today is Friday")
    public void today_is_friday() {
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actual = "TGIF";
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expected) {
        assertEquals(expected, actual);
    }
    
}
