package pages;

import com.employee.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage() {
    }

    @FindBy(how = How.LINK_TEXT, using = "Agile Project")
    public WebElement login;

    public LoginPage clickLogin() {
        login.click();
//        return new LoginPage();
        return getInstance(LoginPage.class);
    }
}
