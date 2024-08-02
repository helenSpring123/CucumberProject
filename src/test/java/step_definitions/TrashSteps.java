package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TrashPage;
import pages.loginPage;
import utilities.Driver;

public class TrashSteps {

    WebDriver driver = Driver.getDriver();
    loginPage loginPage = new loginPage();
    TrashPage trashPage = new TrashPage();
    @Given("the user is on {string}")
    public void the_user_is_on(String url){driver.get(url);

    }
    @When("user enter the username {string} and password {string} and language {string}")
    public void user_enter_the_username_and_password_and_language(String email, String password, String language) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
        loginPage.languageInput.sendKeys(language);
        loginPage.loginButton.click();
    }


    @When("user go to trash")
    public void user_go_to_trash() {
        trashPage.trashButton.click();


    }
    @When("user click trashBytton")
    public void user_click_trash_bytton() {
        trashPage.trashDelete.click();
        Assert.assertTrue(trashPage.trashDelete.isDisplayed());

    }
    @Then("user see its delated")
    public void user_see_its_delated() {

        {

        }


    }}