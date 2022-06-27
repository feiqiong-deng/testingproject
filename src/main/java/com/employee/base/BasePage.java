package com.employee.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.employee.base.DriverContext.driver;

public class BasePage extends Base{
//    public BasePage() {
//        PageFactory.initElements(driver, this);
//    }
    public <TPage extends BasePage> TPage as(Class<TPage> pageInstance) {
        try {
            return (TPage)this;
        } catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }
}
