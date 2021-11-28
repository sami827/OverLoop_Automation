package com.overloop.qa.pages;

import com.overloop.qa.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage extends BaseClass {

    private String ACTUAL_TITLE = "Free CRM Software & Sales Pipeline Management | Overloop CRM";



    @FindBy(xpath = "//a[text()='Log In']")
    WebElement loginBtn;


    //Intializing PAGEOBJECT
    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    //ACTIONS

    //Clicking login button
    public LoginPage clickingLogInBtn() {
        loginBtn.click();
        System.out.println("Login Button Clicked");

        return new LoginPage();
    }

    public String expectedTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void validateTitle() {
        Assert.assertEquals(expectedTitle(), ACTUAL_TITLE);
        System.out.println("Title Matched");
    }











}
