package Steps;

import laborator7.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountResults
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Then("Number of displayed results on a single page is counted")
    public void numberOfDisplayedResultsOnASinglePageIsCounted()
    {
        List<WebElement> elements = driver.findElements(By.className("g"));
        System.out.println("Number of results displayed on a single page: " + elements.size());
    }

}
