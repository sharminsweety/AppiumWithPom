package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends  BaseScreen{
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getAppname()
    {
        return getWebElement(By.id("appName")).getText().trim();
    }

    public void tapStartButton()
    {
         getWebElement(By.id("btnStart")).click();
    }

    public void tapCompareButton()
    {
        getWebElement(By.id("btnCompare")).click();
    }
    public boolean hasStartButton()
    {
        return getWebElements(By.id("btnStart")).size()>0;
    }
}
