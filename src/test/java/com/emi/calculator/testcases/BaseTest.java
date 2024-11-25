package com.emi.calculator.testcases;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    AndroidDriver driver;

    @BeforeClass

    public void launchApp() {
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("udid", "YLD6YXF6MFEIRGTK");
            capabilities.setCapability("platformVersion", "13");
            capabilities.setCapability("deviceName", "narzo 50");
            capabilities.setCapability("appPackage", "com.continuum.emi.calculator");
            capabilities.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("ignoreHiddenApiPolicyError", "true");
            capabilities.setCapability("noReset", "true");


            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            //j method ta handle korbo ota jodi throw lekha thake tobe obbossoi exception handle kora lage
        }
    }

        @AfterClass

        public void tearDown ()
        {
            driver.quit();
        }

    }