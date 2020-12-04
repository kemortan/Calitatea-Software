package Steps;

import laborator7.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageIsOpening
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @When("User enter {string} in the URL box")
    public void userPutsInTheURLInURLBox(String url)
    {
        driver.get(url);
    }

    @Then("Google page is open")
    public void googlePageIsOpen()
    {
        driver.findElement(By.cssSelector("#hplogo")).isDisplayed();
    }

}
