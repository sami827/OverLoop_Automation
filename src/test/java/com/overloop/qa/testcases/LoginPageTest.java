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

public class LoginPageTest extends BaseClass {

    private String USER_NAME = prop.getProperty("email");
    private String USER_PASSWORD = prop.getProperty("password");

    LoginPage loginPage;
    HomePage homePage;
    LandingPage landingPage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        landingPage = new LandingPage();
        homePage = new HomePage();
        loginPage = landingPage.clickingLogInBtn();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        boolean flag = loginPage.validatingPage();
        Assert.assertTrue(flag);
        homePage = loginPage.loginWith(USER_NAME, USER_PASSWORD);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
