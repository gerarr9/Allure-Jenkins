package org.example;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
   protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        setUp();
    }

    public void setUp(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    public void navigateTo(String url){
        driver.get(url);
    }
}
