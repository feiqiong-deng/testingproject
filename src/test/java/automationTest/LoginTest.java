package automationTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    String projectPath = System.getProperty("user.dir");
    private WebDriver driver = null;

    @Before
    public void Initialize() {
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/Agile_Project/Agi_V1/");
    }

    @Test
    public void login() {
        driver.findElement(By.name("uid")).sendKeys("1303");
        driver.findElement(By.name("password")).sendKeys("Guru99");
        driver.findElement(By.name("btnLogin")).click();
    }


}
