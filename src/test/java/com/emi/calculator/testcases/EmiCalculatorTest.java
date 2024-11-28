package com.emi.calculator.testcases;

import com.emi.calculator.screens.EmiCalculatorScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest {

    EmiCalculatorScreen calculatorScreen; //ei var e page last e jei page thke ota thkbe

    @Test
    public void calculateEmiShouldSucceed() {
        // HomeScreen homeScreen= screen.getInstance(HomeScreen.class); //eta diye home screen gesi,screen ei cutsomize mthod use kore amra jekono page e jete parbo
        //  EmiCalculatorScreen calculatorScreen= homeScreen //eta diye homescreen theke emicalscreen gesi.homecrenn thele emi calculator scree  ej abe


        //EmiCalculatorScreen calculatorScreen= screen.getInstance(HomeScreen.class)//shortly direct rakha varable na rekeh
        calculatorScreen = screen.getInstance(HomeScreen.class)//shortly direct rakha varable na rekeh


                .tapStartButton()//homes screen e eta tap kore amra EmiCalculatorScreen e jbo
                .fillAmount(3600)
                .fillInterestRate(9.88)
                .fillYear(2)
                .fillMonth(2)
                .fillProcessingFee(2)
                .tabCalculatorBtn();
        Assert.assertTrue(calculatorScreen.hasResult());
    }

    @Test(priority = 1)
    public void checkDetailButton()// first test execute korar por jei screen thbe skhn ei test hobe which us emi cal screen

    {
        Assert.assertTrue(calculatorScreen.hasDetailBtn());

    }

    @Test(priority = 2)
    public void checkResetButton()// first test execute korar por jei screen thkbe skhn ei test hobe which us emi cal screen

    {
        calculatorScreen.tabResetBtn();
        Assert.assertFalse(calculatorScreen.hasDetailBtn(), "Detail button present,reset button ok!");

    }

}
