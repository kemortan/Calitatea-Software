package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args){
        String word = "computer";

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(word);
        search.sendKeys(Keys.ENTER);

        if (driver.findElement(By.cssSelector("#logo")).isDisplayed()) {
            System.out.println("The header is displayed");
        }
        else {
            System.out.println("Something has gone wrong!");
        }
    }
}
