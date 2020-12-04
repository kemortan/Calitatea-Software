package Steps;

import laborator7.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterNothing
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Given("User entered nothing in search field")
    public void userEnteredNothingInSearchField()
    {
        driver.findElement(By.name("q")).sendKeys("");
    }

    @Then("Nothing should occur")
    public void nothingShouldOccur()
    {
        driver.findElement(By.cssSelector("center:nth-child(1)>.RNmpXc")).isDisplayed();
    }

}
