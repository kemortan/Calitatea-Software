package Steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DescriptionSteps {

    ChromeDriver driver = new ChromeDriver();

    @Given("Product page is opened")
    public void productPageIsOpened() {
        driver.get("https://loving-hermann-e2094b.netlify.app");
        driver.findElement(By.cssSelector("#myCarousel>div>div.item.active>div>div>a")).click();
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,1300)", "");
    }

    @When("User hover on a product")
    public void userHoverOnAProduct() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div"));
        WebElement quick = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div>a")); // Quick View
        action.moveToElement(we).moveToElement(quick).click().build().perform(); // hover on element

    }

    @And("Click on Quick View button")
    public void clickOnQuickViewButton() {
        WebElement quick = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div>a")); // Quick View
        quick.click();
    }

    @Then("User is redirected to page with description of a product")
    public void userIsRedirectedToPageWithDescriptionOfAProduct() {
        WebElement big_Wing_Sneakers = driver.findElement(By.cssSelector("div.col-md-8.single-right-left.simpleCart_shelfItem>h3"));

        if (!big_Wing_Sneakers.isDisplayed())
            driver.close();

        // A page with description of [Big Wing Sneakers] is showing instead of a concrete product

    }
}
