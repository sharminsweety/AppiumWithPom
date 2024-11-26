package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen {


    private By StartBtn = By.id("btnStart");

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getAppName() {

        By name = By.id("appName");
        waitForElement(name);
        return getWebElement(name).getText().trim();
    }

    public EmiCalculatorScreen tapStartButton() {
        getWebElement(StartBtn).click();
        return getInstance(EmiCalculatorScreen.class);
    }

    public void tapCompareButton() {
        getWebElement(By.id("btnCompare")).click();
    }

    public boolean hasStartButton() {
        return getWebElements(StartBtn).size() > 0;
    }

    public String getStartButtonText() {
        return getWebElement(StartBtn).getText().trim();
    }

    public boolean hasCompareButton() {
        return getWebElements(By.id("btnCompare")).size() > 0;
    }

}
