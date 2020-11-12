package Steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class RegisterSteps {

    ChromeDriver driver = new ChromeDriver();

    @Given("Sign Up page of the shop is opened")
    public void signUpPageOfTheShopIsOpened() {
        driver.get("https://loving-hermann-e2094b.netlify.app");
        driver.findElement(By.cssSelector("#home>div>ul>li:nth-child(2)>a")).click();

    }

    @When("User enter valid email and password")
    public void userEnterValidEmailAndPassword() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#myModal2>div>div>div.modal-body.modal-body-sub_agile>div.col-md-8.modal_body_left.modal_body_left1>form>div.styled-input.agile-styled-input-top>input[type=text]")).sendKeys("Vladislav");
        driver.findElement(By.cssSelector("#myModal2>div>div>div.modal-body.modal-body-sub_agile>div.col-md-8.modal_body_left.modal_body_left1>form>div:nth-child(2)>input[type=email]")).sendKeys("kemortan@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("Confirm Password")).sendKeys("123456");
    }

    @And("Click on Sign Up button")
    public void clickOnSignUpButton() {
        driver.findElement(By.cssSelector("#myModal2>div>div>div.modal-body.modal-body-sub_agile>div.col-md-8.modal_body_left.modal_body_left1>form>input[type=submit]")).click();
    }

    @Then("New user is created")
    public void newUserIsCreated() {
        driver.findElement(By.id("home")).isDisplayed();
    }
}
