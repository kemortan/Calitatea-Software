package Steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    ChromeDriver driver = new ChromeDriver();

    @Given("Login page of the shop is opened")
    public void loginPageOfTheShopIsOpened() {
        driver.get("https://loving-hermann-e2094b.netlify.app");
        driver.findElement(By.cssSelector("#home>div>ul>li:nth-child(1)>a")).click();
    }

    @When("User enter name and email")
    public void userEnterNameAndEmail(String username, String email) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#myModal>div>div>div.modal-body.modal-body-sub_agile>div.col-md-8.modal_body_left.modal_body_left1>form>div.styled-input.agile-styled-input-top>input[type=text]")).sendKeys(username);
        driver.findElement(By.cssSelector("#myModal>div>div>div.modal-body.modal-body-sub_agile>div.col-md-8.modal_body_left.modal_body_left1>form>div:nth-child(2)>input[type=email]")).sendKeys(email);
    }

    @And("Click on sign in button")
    public void clickOnSignInButton() {
        driver.findElement(By.cssSelector("#myModal>div>div>div.modal-body.modal-body-sub_agile>div.col-md-8.modal_body_left.modal_body_left1>form>input[type=submit]")).click();
    }

    @Then("User is redirected to home page")
    public void userIsRedirectedToHomePage() {

        driver.findElement(By.id("home")).isDisplayed();
        driver.close();
    }
}
