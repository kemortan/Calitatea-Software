package Steps;

import example.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserCanSignIn
{
    private final WebDriver driver = ChromeDriverSingleton.getDriver();

    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully()
    {
        driver.findElement(By.id("home")).isDisplayed();
    }

    @And("User clicks on SignIn")
    public void userClicksOnSignIn()
    {
        driver.findElement(By.cssSelector("form > input:nth-child(3)")).click();
    }

}