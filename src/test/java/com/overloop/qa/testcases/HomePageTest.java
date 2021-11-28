package com.overloop.qa.testcases;

import com.overloop.qa.base.BaseClass;
import com.overloop.qa.pages.HomePage;
import com.overloop.qa.pages.LandingPage;
import com.overloop.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    LandingPage landingPage;

    private String USER_NAME = prop.getProperty("email");
    private String USER_PASSWORD = prop.getProperty("password");

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp()  {
        initialization();
        landingPage = new LandingPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        loginPage = landingPage.clickingLogInBtn();
        homePage = loginPage.loginWith(USER_NAME, USER_PASSWORD);
    }

    @Test
    public void testCase() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Assert.assertTrue(homePage.verifyPage());
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

}

