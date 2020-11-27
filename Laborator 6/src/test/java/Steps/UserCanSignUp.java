package Steps;

import example.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UserCanSignUp
{
    private final ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @When("User enters {string} in Name field")
    public void userEntersNameInNameField(String name)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(1) > input")).click();
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(1) > input")).sendKeys(name);
    }

    @When("User enters {string} in Email field")
    public void userEntersEmailInEmailField(String email)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#myModal2 .modal-body")).click();
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(2) > input")).click();
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(2) > input")).sendKeys(email);
    }

    @When("User clicks on SignUp")
    public void userClicksOnSignUp()
    {
        driver.findElement(By.cssSelector("form:nth-child(2) > input:nth-child(5)")).click();
    }

    @Then("User is registered successfully")
    public void user_is_registered_successfully()
    {
        driver.findElement(By.id("home")).isDisplayed();
    }
}