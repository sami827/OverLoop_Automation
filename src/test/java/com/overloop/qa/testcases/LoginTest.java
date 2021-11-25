package com.overloop.qa.testcases;

import com.overloop.qa.base.BaseClass;
import com.overloop.qa.pages.LandingPage;
import com.overloop.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    LandingPage landingPage;
    LoginPage loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        landingPage = new LandingPage();
    }

    @Test
    public void TestCase1() {
        landingPage.validateTitle();
        loginPage = landingPage.clickingLogInBtn();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}