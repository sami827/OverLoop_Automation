package com.overloop.qa.pages;

import com.overloop.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    //Defined Locators

    private String USER_NAME_FIELD = "ember4-control"; //id
    private String PASSWORD_FIELD = "ember6-control";// id
    private String LOGIN_BUTTON = "//button[contains(text(),'')]"; //xpath
    private String LOGIN_TEXT = "//h1[contains(text(),'Log in to Overloop')]";



    // Initializing Methods

    public void loginWith(String email, String password) {
        WebElement emailFiled = driver.findElement(By.id(USER_NAME_FIELD));
        emailFiled.clear();
        emailFiled.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id(PASSWORD_FIELD));
        passwordField.clear();
        passwordField.sendKeys(password);

    }

    public void clickingLoginBtn() {
        WebElement loginBtn = driver.findElement(By.xpath(LOGIN_BUTTON));
        loginBtn.click();
    }

    public boolean validatingPage() {
        WebElement textDisplay = driver.findElement(By.xpath(LOGIN_TEXT));
        System.out.println("Text Exists");
        return textDisplay.isDisplayed();

    }


















}
