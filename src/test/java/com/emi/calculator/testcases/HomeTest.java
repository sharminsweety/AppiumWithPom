package com.emi.calculator.testcases;

import com.emi.calculator.common.General;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    HomeScreen homeScreen;

    @Test(priority = 0)
    public void checkAppName() {
        homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertEquals(General.App_NAME, homeScreen.getAppName());
    }

    @Test(priority = 1)
    public void checkStatButton() {
        homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasStartButton());
    }

    @Test(priority = 2)
    public void checkCompareButton() {
        homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasCompareButton());
    }


    @Test(priority = 3)
    public void checkCompareButtonText() {
        homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasCompareButton());
    }


}
