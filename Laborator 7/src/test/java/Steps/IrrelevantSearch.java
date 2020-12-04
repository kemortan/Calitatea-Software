package Steps;

import laborator7.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrrelevantSearch
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Then("Did you mean text is displayed")
    public void didYouMeanTextIsDisplayed()
    {
        WebElement didYouMean = driver.findElement(By.cssSelector(".d2IKib"));
        didYouMean.isDisplayed();
    }

}
