package automationTest;

import com.employee.base.*;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtil;

import static com.employee.base.DriverContext.browser;

public class LoginTest extends FrameworkInitialize {
//    String projectPath = System.getProperty("user.dir");
//    private WebDriver driver = null;

    @Before
    public void Initialize() {
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/chromedriver");
//        driver = new ChromeDriver();
//        driver.navigate().to("https://demo.guru99.com/");
        initializeBrowser(BrowserType.CHROME);
        browser.goToUrl("https://demo.guru99.com/");
        try {
            ExcelUtil excelUtil = new ExcelUtil(System.getProperty("user.dir")
                    + "/src/main/resources/data.xls");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void login() throws InterruptedException {
//        driver.findElement(By.name("uid")).sendKeys("1303");
//        driver.findElement(By.name("password")).sendKeys("Guru99");
//        driver.findElement(By.name("btnLogin")).click();

//        HomePage homePage = new HomePage();
//        LoginPage loginPage = new LoginPage();

        currentPage = getInstance(HomePage.class);
        currentPage = currentPage.as(HomePage.class).clickLogin();
//        LoginPage loginPage = homePage.clickLogin();

//        Thread.sleep(1000);
//        currentPage.as(LoginPage.class).login("1303", "Guru99");
//        loginPage.login("1303", "Guru99");

        // DDT(Data Driven Test) from Excel
        currentPage.as(LoginPage.class).login(ExcelUtil.ReadCell("UserName",1),
                ExcelUtil.ReadCell("Password",1));

    }

}
