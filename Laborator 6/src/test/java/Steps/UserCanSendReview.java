package Steps;

import example.ChromeDriverSingleton;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCanSendReview
{
   private final ChromeDriver driver = ChromeDriverSingleton.getDriver();

   @Given("Review page is opened")
   public void reviewPageIsOpened() {
       driver.get("https://loving-hermann-e2094b.netlify.app/single.html");
       JavascriptExecutor js = driver;
       js.executeScript("window.scrollBy(0,950)", "");
   }

    @And("User open review tab")
    public void userOpenReviewTab()
    {
        driver.findElement(By.cssSelector(".resp-tab-item:nth-child(2)")).click();
        System.out.println("Ok");
    }

    @When("User enters {string} in Name")
    public void userEntersName(String name)
    {
        driver.findElement(By.cssSelector(".add-review input:nth-child(1)")).sendKeys(name);
    }

    @And("User enters {string} in Email")
    public void userEntersEmail(String email)
    {
        driver.findElement(By.cssSelector(".add-review input:nth-child(2)")).sendKeys(email);
    }

    @And("User enters {string} in Message")
    public void userEntersMessage(String message)
    {
        driver.findElement(By.name("Message")).sendKeys(message);
    }

    @When("User clicks on Send")
    public void userClicksOnSend()
    {
        driver.findElement(By.cssSelector("form:nth-child(2) > input:nth-child(4)")).click();
    }

}
