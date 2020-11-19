package Steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ReviewSteps {

    ChromeDriver driver = new ChromeDriver();

    @Given("Page with reviews is opened")
    public void pageWithReviewsIsOpened() {
        driver.get("https://loving-hermann-e2094b.netlify.app");
        driver.findElement(By.cssSelector("#myCarousel>div>div.item.active>div>div>a")).click();
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,1300)", "");

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div"));
        WebElement quick = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div>a")); // Quick View
        // hover on element
        action.moveToElement(we).moveToElement(quick).click().build().perform();
        quick.click();

        js.executeScript("window.scrollBy(0,950)", "");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[text()='Reviews']")).click();

    }

    @When("User enter valid name email and message")
    public void userEnterValidNameEmailAndMessage() {

    }

    @And("Click on Send Review button")
    public void clickOnSendButton() {

    }

    @Then("User is redirected to page with reviews")
    public void userIsRedirectedToPageWithReviews() {
        driver.findElement(By.id("home")).isDisplayed();
    }
}
