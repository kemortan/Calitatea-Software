package Steps;

import example.ChromeDriverSingleton;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UserCanAddToCart
{
    private final ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @When("User click on ADD TO CART button on multiple products")
    public void userClickOnADDTOCARTButtonOnMultipleProducts()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".tab1 > .col-md-3:nth-child(1) .button")).click();
        driver.findElement(By.cssSelector(".tab1 > .col-md-3:nth-child(2) .button")).click();
        driver.findElement(By.cssSelector(".tab1 > .col-md-3:nth-child(3) .button")).click();
    }

    @Then("Selected item is added to the shopping cart")
    public void selectedItemIsAddedToTheShoppingCart()
    {
        driver.findElement(By.className("minicart-showing")).isDisplayed();
    }
}