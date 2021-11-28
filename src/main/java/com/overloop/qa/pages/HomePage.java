package com.overloop.qa.pages;

import com.overloop.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

    private String ME_TEXT = "//span[contains(@id,'text-truncate')]";

    public boolean verifyPage() {
        WebElement visibleText = driver.findElement(By.xpath(ME_TEXT));
        System.out.println("Home Page is varified");
        return visibleText.isDisplayed();
    }
}
