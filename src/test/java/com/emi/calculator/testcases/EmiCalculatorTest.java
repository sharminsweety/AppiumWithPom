package com.emi.calculator.testcases;

import com.emi.calculator.screens.EmiCalculatorScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest{


    @Test
    public void calculateEmiShouldSucceed()
    {
        HomeScreen homeScreen= screen.getInstance(HomeScreen.class); //eta diye home screen gesi,screen ei cutsomize mthod use kore amra jekono page e jete parbo
        EmiCalculatorScreen calculatorScreen= homeScreen //eta diye homescreen theke emicalscreen gesi.homecrenn thele emi calculator scree  ej abe
                .tapStartButton()//homescrren e eta tap kore amra EmiCalculatorScreen e jbo
                .fillAmount(3600)
                .fillInterestRate(9.88)
                .fillYear(2)
                .fillMonth(2)
                .fillProcessingFee(2)
                .tabCalculatorBtn();
        Assert.assertTrue(calculatorScreen.hasResult());







    }
}
