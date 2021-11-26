package com.overloop.qa.testcases;

import com.overloop.qa.base.BaseClass;
import com.overloop.qa.pages.LandingPage;
import com.overloop.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    private String USER_NAME = prop.getProperty("email");
    private String USER_PASSWORD = prop.getProperty("password");

    LoginPage loginPage;
    LandingPage landingPage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        landingPage = new LandingPage();
        loginPage = landingPage.clickingLogInBtn();
        loginPage = new LoginPage();

    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(4000);
        boolean flag = loginPage.validatingPage();
        Assert.assertTrue(flag);
        loginPage.loginWith(USER_NAME, USER_PASSWORD);
        loginPage.clickingLoginBtn();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
