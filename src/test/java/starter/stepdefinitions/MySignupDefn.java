package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySignupDefn extends Homepage {

    Homepage homepg = new Homepage();

    @Given("I enter URL")
    public void i_enter_url() throws InterruptedException {
        homepg.URL();
    }

    @When("I enter email address")
    public void i_enter_email_address() {
        homepg.email();
    }

    @Then("I enter first name and last name")
    public void i_enter_first_name_and_last_name() {
        homepg.firstAndlastname();
    }

    @Then("I click on signup button")
    public void i_click_on_signup_button() throws InterruptedException {
        homepg.button();
        homepg.activationPage();
    }

    //Methods with arguments which accepts from feature file
    @When("I enter my {string}")
    public void iEnterMy(String emailwithData) {
        homepg.emailwithData(emailwithData);
    }

    //Methods with arguments which accepts from feature file
    @Then("I enter {string} and {string}")
    public void iEnterAnd(String firstname, String lastname) {
        homepg.firstAndlastnamewithData(firstname, lastname);

    }


}
