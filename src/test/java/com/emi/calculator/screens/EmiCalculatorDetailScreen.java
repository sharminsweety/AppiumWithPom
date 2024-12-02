package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiCalculatorDetailScreen extends BaseScreen{
    public EmiCalculatorDetailScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean hasResultDetail() {
        By containerDtl = By.id("layoutDetailContainer");

        waitForElement(containerDtl);
        return getWebElements(containerDtl).size() > 0;
    }

    public EmiCalculatorScreen tapBackBtn() {

        waitForElement(By.id("actionMenuBack"));
        waitForElement(By.id("btnDetail"));
        return getInstance(EmiCalculatorScreen.class);
    }


}
