package com.overloop.qa.testcases;

import com.overloop.qa.base.BaseClass;
import com.overloop.qa.pages.LandingPage;
import com.overloop.qa.pages.LoginPage;
import com.overloop.qa.pages.PricePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LandingPageTest extends BaseClass {
    LandingPage landingPage;
    LoginPage loginPage;
    PricePage pricePage;

    public LandingPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        landingPage = new LandingPage();
    }

    @Test(priority = 1)
    public void workingWithDropdown() {
        landingPage.clickingDrpDown();
        landingPage.hoveringOverLements();
        landingPage.clickingConversation();
    }

    @Test(priority = 2)
    public void navigatingPricePage() {
       pricePage = landingPage.clickingPriceBtn();

    }

    @Test(priority = 3)
    public void navigatingLoginPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        landingPage.validateTitle();
        loginPage = landingPage.clickingLogInBtn();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
       Thread.sleep(4000);
       driver.quit();
    }
}
