package Steps;

import laborator7.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralSteps
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Given("Google Chrome is opened")
    public void googleChromeIsOpened()
    {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @When("User enters {string} in search field")
    public void userEntersTextInSearchField(String text)
    {
        driver.findElement(By.name("q")).sendKeys(text);
    }

    @When("User clicks on search button")
    public void userClicksOnSearchButton()
    {
        driver.findElement(By.cssSelector("center:nth-child(1)>.gNO89b")).click();
    }

//    @After
//    public void closeDriver() {
//        driver.close();
//    }
}
