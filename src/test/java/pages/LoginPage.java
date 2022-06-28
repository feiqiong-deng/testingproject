package pages;

import com.employee.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {

    }

    @FindBy(how = How.NAME, using = "uid")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "btnLogin")
    public WebElement btnLogin;

    @FindBy(how = How.LINK_TEXT, using = "Mini Statement")
    public WebElement linkStatement;

    public StatementPage login(String username, String password) {
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.submit();
        return getInstance(StatementPage.class);
    }

}
