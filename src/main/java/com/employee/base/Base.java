package com.employee.base;

import org.openqa.selenium.support.PageFactory;

import static com.employee.base.DriverContext.driver;

public class Base {
    public static BasePage currentPage;

    public <TPage extends BasePage> TPage getInstance(Class<TPage> page) {
        Object obj = PageFactory.initElements(driver, page);
        return page.cast(obj);
    }
}
