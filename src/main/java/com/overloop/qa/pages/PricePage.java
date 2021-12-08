package com.overloop.qa.pages;

import com.overloop.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PricePage extends BaseClass {

    private String PLANS_PRICING_TEXT = "//h1[contains(text(),'Plans & Pricing')]";
    private String FREE_SIGNUP_BTN = "" +
            "//a[contains(text(),'Free sign up') " +
            "and contains(@class,'pr-c-button pr-c-button--brand pr-u-margin-bottom-4')]";



    public boolean verifyPage() {
        WebElement textDisplay = driver.findElement(By.xpath(PLANS_PRICING_TEXT));
        return textDisplay.isDisplayed();

    }

    public void clickSignUpBtn() {
        WebElement signUpbtn = driver.findElement(By.xpath(FREE_SIGNUP_BTN));
        signUpbtn.click();
    }


}
