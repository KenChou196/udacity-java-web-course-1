package com.udacity.jwdnd.course1.cloudstorage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    private WebDriverWait WebDriverWait;

    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        WebDriverWait = new WebDriverWait(driver, 10);
    }
}
