package com.overloop.qa.pages;

import com.overloop.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LandingPage extends BaseClass {

    private String ACTUAL_TITLE = "Free CRM Software & Sales Pipeline Management | Overloop CRM";
    private String Drop_Down_Elemnts =  "//ul[contains(@class, 'pr-c-mega-menu__list')]//li";



    @FindBy(xpath = "//a[text()='Log In']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[contains(@class, 'pr-c-navbar__link js-dropdown-trigger')]")
    WebElement drpDownBtn;

    @FindBy(xpath = "//span[contains(text(),'Conversation')]")
    WebElement drpDownConverstion;

    @FindBy(xpath = "//a[contains(text(),'Pricing')]")
    WebElement priceBtn;




    //Intializing PAGEOBJECT
    public LandingPage() {

        PageFactory.initElements(driver, this);
    }

    //ACTIONS
    public String expectedTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void validateTitle() {
        Assert.assertEquals(expectedTitle(), ACTUAL_TITLE);
        System.out.println("Title Matched");
    }

    //Clicking login button
    public LoginPage clickingLogInBtn() {
        loginBtn.click();
        System.out.println("Login Button Clicked");

        return new LoginPage();
    }

    //Clicking Price Button
    public PricePage clickingPriceBtn() {
        priceBtn.click();
        System.out.println("Clicked Price Button");

        return new PricePage();
    }


    //Product Dropdown Section

    public void clickingDrpDown() {
        drpDownBtn.click();
    }

    public void clickingConversation() {
        drpDownConverstion.click();
        System.out.println("Clicking Conversation Button");
    }

    public void hoveringOverLements() {
        System.out.println("Entering Drop Down Loop");
        List<WebElement> allMenus = driver.findElements(By.xpath(Drop_Down_Elemnts));

        for (WebElement menu : allMenus) {
            System.out.println(menu.getText());
        }
    }











}
