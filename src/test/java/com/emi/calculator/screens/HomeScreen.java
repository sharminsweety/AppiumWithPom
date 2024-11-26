package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends  BaseScreen{




    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getAppName()
    {
        return getWebElement(By.id("appName")).getText().trim();
    }

    public EmiCalculatorScreen tapStartButton()
    {
         getWebElement(By.id("btnStart")).click();
         return getInstance(EmiCalculatorScreen.class);
    }

    public void tapCompareButton()
    {
        getWebElement(By.id("btnCompare")).click();
    }

    public String getStartButtonText()
    {
        return getWebElement(By.id(""))
    }


    public boolean hasStartButton()
    {
        return getWebElements(By.id("btnStart")).size()>0;
    }
}
