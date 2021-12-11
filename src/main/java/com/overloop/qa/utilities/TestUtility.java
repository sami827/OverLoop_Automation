package com.overloop.qa.utilities;

import com.overloop.qa.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestUtility extends BaseClass {

    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT = 10;

    public void switchToFrameByName(String frameName) {
        driver.switchTo().frame(frameName);
    }

    public void switchToFrameByIndex(int number) {
        driver.switchTo().frame(number);
    }

    public static void takeScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "//screenshots//" + System.currentTimeMillis() + ".png"));
    }
}
