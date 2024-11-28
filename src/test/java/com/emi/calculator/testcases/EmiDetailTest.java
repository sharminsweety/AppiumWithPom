package com.emi.calculator.testcases;

import com.emi.calculator.screens.EmiCalculatorDetailScreen;
import com.emi.calculator.screens.EmiCalculatorScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiDetailTest extends BaseTest {
    EmiCalculatorDetailScreen emiDetailScreen; //ei var e page last e jei page thke ota thkbe

    @Test(priority = 0)
    public void calculateEmiShouldSucceed() {
        emiDetailScreen = screen.getInstance(HomeScreen.class)//shortly direct rakha varable na rekeh

                .tapStartButton()//home screen e eta tap kore amra EmiCalculatorScreen e jbo
                .fillAmount(3500)
                .fillInterestRate(9.88)
                .fillYear(2)
                .fillMonth(2)
                .fillProcessingFee(2)
                .tabCalculatorBtn()
                .tapDetailBtn();
        Assert.assertTrue(emiDetailScreen.hasResultDetail(),"Got EMI result Detail");
    }

    @Test(priority = 1)
    public void backToEmiCalculatorScreen() {
        EmiCalculatorScreen emiCalculatorScreen = emiDetailScreen    // here we come back from detail screen to EMI screen


                .tapBackBtn();
        Assert.assertTrue(emiCalculatorScreen.hasResult(),"Back to EMI calculator screen");

    }
}
