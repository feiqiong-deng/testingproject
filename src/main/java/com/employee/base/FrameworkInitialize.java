package com.employee.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import static com.employee.base.DriverContext.*;

public class FrameworkInitialize extends Base {
    String projectPath = System.getProperty("user.dir");

    public void initializeBrowser(BrowserType type) {
        WebDriver webDriver = null;
        switch (type) {
            case CHROME:
            {
                System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/chromedriver");
                webDriver = new ChromeDriver();
                break;
            }

            case SAFARI:
            {
                webDriver = new SafariDriver();
                break;
            }
        }
        setDriver(webDriver);
        browser = new Browser(webDriver);
    }

}
