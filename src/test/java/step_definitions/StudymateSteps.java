package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.helenPage;
import pages.loginPage;
import utilities.Driver;

public class StudymateSteps {
    WebDriver driver = Driver.getDriver();
    loginPage loginPage = new loginPage();
    helenPage helenPage = new helenPage();


    @Given("this url {string}")
    public void this_url(String url) {
       driver.get(url);
    }
    @Then("user enters email {string}")
    public void user_enters_email(String email) {
        loginPage.emailInput.sendKeys(email);
    }
    @Then("user enters password {string}")
    public void user_enters_password(String password) {
      loginPage.passwordInput.sendKeys(password);
    }
    @Then("user clicks on sign in")
    public void user_clicks_on_sign_in() {
       loginPage.loginButton.click();
    }
    @Then("user clicks on teachers")
    public void user_clicks_on_teachers() {
        helenPage.teachers.click();

    }

}
