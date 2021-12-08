package com.overloop.qa.testcases;

import com.overloop.qa.base.BaseClass;
import com.overloop.qa.pages.LandingPage;
import com.overloop.qa.pages.PricePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PricePageText extends BaseClass {
    LandingPage landingPage;
    PricePage pricePage;

    public PricePageText() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        landingPage = new LandingPage();
        pricePage = landingPage.clickingPriceBtn();

    }

    @Test
    public void Test1() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        boolean flag = pricePage.verifyPage();
        Assert.assertTrue(flag);
        System.out.println("Page Verified");
        pricePage.clickSignUpBtn();
        System.out.println("Cliking On Sign Up Button");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
