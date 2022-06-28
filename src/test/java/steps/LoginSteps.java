package steps;

import com.employee.base.Base;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;

import java.util.List;

public class LoginSteps extends Base {
    @Given("I have navigated to the website")
    public void i_have_navigated_to_the_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is in the step definition file.");
    }
    @Given("I open the home page of the website")
    public void i_open_the_home_page_of_the_website() {
        currentPage = getInstance(HomePage.class);
        Assert.assertTrue("The home page is not loaded",
                currentPage.as(HomePage.class).isHomePage());
    }
    @Then("I click the login link")
    public void i_click_the_login_link() {
        currentPage = currentPage.as(HomePage.class).clickLogin();
    }
    @When("I enter username and password")
    public void i_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("I click login button")
    public void i_click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the customer's page")
    public void i_should_see_the_customer_s_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
