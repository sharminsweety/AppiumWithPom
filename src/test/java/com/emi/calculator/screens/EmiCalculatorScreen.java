package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiCalculatorScreen extends BaseScreen {
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen fillAmount(int amount) {
        waitForElement(By.id("etLoanAmount"));
        getWebElement(By.id("etLoanAmount")).sendKeys(String.valueOf(amount));
        return this;
    }
    public EmiCalculatorScreen fillInterestRate(double Rate) {
        getWebElement(By.id("etInterest")).sendKeys(String.valueOf(Rate));
        return this;
    }

    public EmiCalculatorScreen fillYear(int year){
        getWebElement(By.id("etYears")).sendKeys(String.valueOf(year));
        return this;
    }

    public EmiCalculatorScreen fillMonth(int month){
        getWebElement(By.id("etMonths")).sendKeys(String.valueOf(month));
        return this;
    }


    public EmiCalculatorScreen fillProcessingFee(int fee){
        getWebElement(By.id("etFee")).sendKeys(String.valueOf(fee));
        return this;
    }


    public EmiCalculatorScreen tabCalculatorBtn(){
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

    public EmiCalculatorScreen tabResetBtn(){
        getWebElement(By.id("btnReset")).click();
        return this;
    }

    public boolean hasResult ()
    {
        return getWebElements(By.id("layoutTable")).size()>0;
    }

    public EmiCalculatorDetailScreen tapDetailBtn(){
        getWebElement(By.id("btnDetail")).click();
        waitForElement(By.id("actionMenuBack"));
        return getInstance(EmiCalculatorDetailScreen.class);
    }

    public boolean hasDetailBtn ()
    {
        return getWebElements(By.id("btnDetail")).size()>0;
    }

}
