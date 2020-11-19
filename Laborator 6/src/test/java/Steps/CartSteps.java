package Steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartSteps {

    ChromeDriver driver = new ChromeDriver();

    @Given("Page with products is opened")
    public void pageWithProductsIsOpened() {
        driver.get("https://loving-hermann-e2094b.netlify.app");
        driver.findElement(By.cssSelector("#myCarousel>div>div.item.active>div>div>a")).click();
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,1300)", "");
    }

    @When("User click on add to cart button")
    public void userClickOnAddToCartButton() {
        driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.item-info-product>" +
                "div.snipcart-details.top_brand_home_details.item_add.single-item.hvr-outline-out.button2" +
                ">form>fieldset>input.button")).click();

    }

    @Then("Selected item is added to the shopping cart")
    public void selectedItemIsAddedToTheShoppingCart() {
        driver.findElement(By.className("minicart-showing")).isDisplayed();
    }
}

