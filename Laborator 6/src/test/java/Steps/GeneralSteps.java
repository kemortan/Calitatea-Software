package Steps;

import example.ChromeDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GeneralSteps
{
    public WebDriver driver = ChromeDriverSingleton.getDriver();

    @Given("User is on main page")
    public void user_is_on_page()
    {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");
        driver.manage().window().maximize();
    }

    @When("User enters {string} in {string} field")
    public void user_enters_in_field(String string, String field)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name(field)).sendKeys(string);
    }

    @Given("User clicks on {string} link")
    public void userClicksOnContactTab(String link)
    {
        driver.findElement(By.linkText(link)).click();
    }

    @After
    public void closeDriver(){
        driver.close();
    }
}