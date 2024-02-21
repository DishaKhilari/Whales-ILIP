package starter.PTGWPrject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class homepage {

        WebDriver driver = new FirefoxDriver();
        public void openBrowser() throws InterruptedException {
            //get driver from folder
            System.setProperty("webdriver.geckodriver.driver",
                    "geckodriver");
            // Set Firefox options to run in headless mode
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless"); // Add headless mode argument
//                options.setHeadless(true); // Run Firefox in headless mode
            driver = new FirefoxDriver(options);
            if (!options.setHeadless(true).is(String.valueOf(true)))
            {
                driver.manage().window().maximize();
            }
            Thread.sleep(2000);
            driver.get("https://propertygateway.au/");
        }

        public void gettitle(){
            driver.manage().timeouts().pageLoadTimeout(Duration.ofDays(30000));
            System.out.print("Title of the page is: " +driver.getTitle());
        }

        public void clickButtons(){
            //find elements for home button and contact us button
            WebDriverWait wait = new WebDriverWait(driver, (Duration.ofDays(20000)));
            WebElement myElement;

            myElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Home')]")));
            driver.findElement(By.xpath("//span[contains(.,'Home')]")).click(); //click home tab
            System.out.print("Title of the home page is: " +driver.getTitle());

            WebElement button = driver.findElement(By.xpath("//span[contains(.,'Contact Us')]")); //click home tab
            if(button.isEnabled()) {
                button.click();
            } else {
                System.out.print(" Element is not enabled. ");
            }

            System.out.print("Title of the Contact page is: " +driver.getTitle());

        }

        public void enterDetails(){
            //enter detail name, email, send message
            driver.findElement(By.name("your-name")).click();                                                   //click textbox
            driver.findElement(By.name("your-name")).sendKeys("disha");                             //send data to textbox

            WebElement email = driver.findElement(By.name("your-email"));
            if(email.isEnabled())
            {
                email.click();
                email.sendKeys("dishali.khilari");
            } else {
                System.out.print(" Element is not enabled. ");
            }

            driver.findElement(By.name("your-message")).click();                                                    //click textbox
            driver.findElement(By.name("your-message")).sendKeys("Sample automation data");             //send data to textbox

        }

        public void verifyMessage(){
            driver.findElement(By.xpath("//span[contains(.,'Send')]")).click();      //click on send button
            WebDriverWait wait = new WebDriverWait(driver, (Duration.ofDays(20000)));
            WebElement myElement;

            //Checking Response from submit form
            myElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".wpcf7-response-output")));
            WebElement sendmessage = driver.findElement(By.cssSelector(".wpcf7-response-output"));
            if(sendmessage.isDisplayed())
            {
                sendmessage.getText();
                assertEquals(sendmessage.getText(), "One or more fields have an error. Please check and try again.");
            } else {
                System.out.print(" Element is not enabled. ");
            }

            driver.close();

        }

        public void enterDetails(String Username, String Email, String Message){
            //enter detail name, email, send message
            driver.findElement(By.name("your-name")).click();                                                   //click textbox
            driver.findElement(By.name("your-name")).sendKeys(Username);                             //send data to textbox

            WebElement email = driver.findElement(By.name("your-email"));
            if(email.isEnabled())
            {
                email.click();
                email.sendKeys(Email);
            } else {
                System.out.print(" Element is not enabled. ");
            }

            driver.findElement(By.name("your-message")).click();                                                    //click textbox
            driver.findElement(By.name("your-message")).sendKeys(Message);             //send data to textbox

        }


}
