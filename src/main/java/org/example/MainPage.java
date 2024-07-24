package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private By searchBox  = By.name("q");
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage search(String text){
        WebElement googleSearch = driver.findElement(searchBox);
        googleSearch.sendKeys(text);
        googleSearch.sendKeys(Keys.ENTER);
        return this;
    }
}
