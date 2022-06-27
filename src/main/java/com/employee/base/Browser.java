package com.employee.base;

import org.openqa.selenium.WebDriver;

public class Browser {
    private WebDriver driver;
    public BrowserType type;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void maximize() {
        driver.manage().window().maximize();
    }
}

