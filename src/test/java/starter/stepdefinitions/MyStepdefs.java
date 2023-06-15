package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MyStepdefs {
    WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

    @Given("web URL")
    public void web_URL() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "geckodriver"); //Setting system properties of FirefoxDriver
        driver.manage().window().maximize(); //
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofDays(40000));
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(40000));
        driver.get("https://apps.usewhale.io/trial");
        driver.getTitle();
        Thread.sleep(5000);
    }

    @When("enter email address")
    public void enter_email_address() throws Throwable {
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com"); //name locator for text box
    }

    @Then("enter first name")
    public void enter_first_name() throws Throwable {
        driver.findElement(By.name("firstName")).sendKeys("abc"); //name locator for text box

    }

    @Then("enter last name and click on check box")
    public void enter_last_name_and_click_on_check_box() throws Throwable {
        driver.findElement(By.name("lastName")).sendKeys("ajs"); //name locator for text box
        Thread.sleep(4000);

    }

    @Then("click on Signup button")
    public void click_on_Signup_button() throws Throwable {
        driver.findElement(By.id("sign_up_conversion")).click(); //name locator for text box
        Thread.sleep(4000);
        driver.quit(); //Close the driver
    }

    @When("I enter firstname and lastname")
    public void iEnterFirstnameAndLastname() {

    }
}
