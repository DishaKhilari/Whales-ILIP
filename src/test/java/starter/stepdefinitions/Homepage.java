package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {

    WebDriver driver = new FirefoxDriver();

    public void URL() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","geckodriver");
        driver.manage().window().maximize();
        driver.get("https://apps.usewhale.io/trial");
        driver.getTitle();
        System.out.println(" The Tile Name is " +driver.getTitle());
        Thread.sleep(2000);

    }

    public void email(){
//        WebElement email = (WebElement) driver.findElements(By.name("email"));
//        email.sendKeys("disha.khilari@owitech.com");
        driver.findElement(By.name("email")).sendKeys("disha.khilari@owitechs.com");
    }

    public void firstAndlastname(){
        driver.findElement(By.name("firstName")).sendKeys("Disha");
        driver.findElement(By.name("lastName")).sendKeys("Khilari");
    }

    public void emailwithData(String email){
//        WebElement email = (WebElement) driver.findElements(By.name("email"));
//        email.sendKeys("disha.khilari@owitech.com");
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void firstAndlastnamewithData(String firstname, String lastname){
        driver.findElement(By.name("firstName")).sendKeys(firstname);
        driver.findElement(By.name("lastName")).sendKeys(lastname);
    }
    public void button() throws InterruptedException {
        driver.findElement(By.cssSelector(".PrivateSwitchBase-input")).click();
        driver.findElement(By.id("sign_up_conversion")).isEnabled();
        Thread.sleep(3000);
    }

    public void activationPage(){
        driver.getTitle();
        System.out.println(" The Tile of Activation Code page is " +driver.getTitle());
        System.out.println(" Promotion line " +driver.findElement(By.className("title")).getText());

        driver.quit(); //close the window

    }

    public void aboutUs(String aboutUs){
        driver.findElement(By.name("howHearAboutUs")).sendKeys(aboutUs); //name locator for text box

    }

    public void youSelectMyGoal() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id=':r2:']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".MuiBackdrop-root")).click();
        driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(2)")).click();

    }

    public void clickNext() throws InterruptedException {
        driver.findElement(By.cssSelector(".MuiButtonBase-root")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Next']")).click();



    }
    public void biggestChallenge(String bigChallenge){
        driver.findElement(By.name("biggestChallenge")).sendKeys(bigChallenge); //name locator for text box

    }

    public void quitBrowser(){
        driver.quit(); //Close the driver

    }
}
