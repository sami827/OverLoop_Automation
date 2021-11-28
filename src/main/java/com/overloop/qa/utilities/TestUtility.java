package com.overloop.qa.utilities;

import com.overloop.qa.base.BaseClass;

public class TestUtility extends BaseClass {

    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT = 10;

    public void switchToFrameByname(String frameName) {
        driver.switchTo().frame(frameName);
    }

    public void switchToFrameByIndex(int number) {
        driver.switchTo().frame(number);
    }
}
