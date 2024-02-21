package starter.PTGWPrject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.junit.Test;

public class PTGW extends homepage{

    homepage hmpg = new homepage();

    @Before
    @Given("I enter the URL")
    public void i_enter_the_url() throws InterruptedException {
        hmpg.openBrowser();
        hmpg.gettitle();
    }

    @Test
    @When("I click on Home page button and then Contact us button")
    public void i_click_on_home_page_button_and_then_contact_us_button() {

    }

    @Test
    @Then("I enter details {string} {string} and {string}")
    public void i_enter_details_and(String string, String string2, String string3) {

    }
    @Then("I click on submit contact details")
    public void i_click_on_submit_contact_details() {

    }
}
