package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BaseScreen extends Screen {
    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }


    public WebElement getWebElement(By locator) {

        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() + "Locator not found for element");
        }
        return element;
    }


    @Override
    public List<WebElement> getWebElements(By locator) {

        List<WebElement> elements = null;
        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");

        }
        return elements;

    }
//
//    @Override
//    public void waitForElement(By locator) {
//        try {
//            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//
//        } catch (Exception e) {
//            System.out.println(locator.toString() + "Locator not found for elements");
//
//        }
//    }


    public void waitForElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator)); // Correct use of until
        } catch (Exception e) {
            System.out.println(locator.toString() + " Locator not found for elements");
        }
    }

}
