package Steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactSteps {

    ChromeDriver driver = new ChromeDriver();

    @Given("Contact page of the shop is opened")
    public void contactPageOfTheShopIsOpened() {
        driver.get("https://loving-hermann-e2094b.netlify.app");
        driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1>ul>li:nth-child(5)")).click();
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,1100)", "");
    }

    @When("User enter valid name and email")
    public void userEnterValidNameAndEmail() {
        driver.findElement(By.cssSelector("div.col-md-6.contact-form>form>div.styled-input.agile-styled-input-top>input[type=text]")).sendKeys("Vladislav");
        driver.findElement(By.cssSelector("div.col-md-6.contact-form>form>div:nth-child(2)>input[type=email]")).sendKeys("kemortan@gmail.com");
        driver.findElement(By.cssSelector("div.col-md-6.contact-form>form>div:nth-child(3)>input[type=text]")).sendKeys("Generic Subject");
        driver.findElement(By.cssSelector("div.col-md-6.contact-form>form>div:nth-child(4)>textarea")).sendKeys("Generic Message");
    }

    @And("Click on Send button")
    public void clickOnSendButton() {
        driver.findElement(By.cssSelector("div.col-md-6.contact-form>form>input[type=submit]")).click();
    }

    @Then("The message should be sent to the shop")
    public void theMessageShouldBeSentToTheShop() {
        driver.findElement(By.id("home")).isDisplayed();
    }
}
