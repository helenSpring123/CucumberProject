package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.helenPage;
import pages.loginPage;
import utilities.Driver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class StudymateSteps {
    WebDriver driver = Driver.getDriver();
    loginPage loginPage = new loginPage();
    helenPage helenPage = new helenPage();
    Actions actions = new Actions(driver);


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
    @Then("user clicks on add teacher")
    public void user_clicks_on_add_teacher() {
        helenPage.addTeachersButton.click();
    }

    @Then("user enters username {string}")
    public void user_enters_username(String username) {
        helenPage.firstNameInput.sendKeys(username);
    }
    @Then("user enters lastname {string}")
    public void user_enters_lastname(String lastname) {
       helenPage.lastNameInput.sendKeys(lastname);
    }
    @Then("user clicks on phonenumber")
    public void user_clicks_on_phonenumber() {
       helenPage.phoneNumberInput.click();
    }
    @Then("user enters phonenumber {string}")
    public void user_enters_phonenumber(String number)  {

       helenPage.phoneNumberInput.sendKeys(number);
    }
    @Then("user enters specilization {string}")
    public void user_enters_specilization(String specilization) {
        helenPage.specilizationInput.sendKeys(specilization);
    }
    @Then("user clicks on  choose course")
    public void user_clicks_on_choose_course() {
       helenPage.chooseCourseInput.click();
    }
    @Then("user clicks on test")
    public void user_clicks_on_test() {
      helenPage.testCourse.click();
        actions.moveByOffset(0,20).click(helenPage.firstNameInput).build().perform();
    }
    @Then("user clicks on add")
    public void user_clicks_on_add() {
        helenPage.addButton.click();
    }

    @Then("user verifies the teacher info")
    public void user_verifies_the_teacher_info() {
        helenPage.verifyMethod(helenPage.verifytable.getText());
    }


    @Then("user enters incorrect email {string}")
    public void user_enters_incorrect_email(String wrongemail) {
       helenPage.emailInput.sendKeys(wrongemail);
    }

    @Then("user is not able to add info")
    public void user_is_not_able_to_add_info() {
        Assert.assertFalse(helenPage.addButton.isEnabled());
    }

    @Then("user clicks on cancle button")
    public void user_clicks_on_cancle_button() {
      helenPage.cancelButton.click();
    }

    @Then("user clicks on announcements")
    public void user_clicks_on_announcements() {
        helenPage.Announcement.click();
    }

    @Then("user clicks on add an announcement")
    public void user_clicks_on_add_an_announcement() {
        helenPage.addAnnouncement.click();
    }


    @Then("user clicks on text of announcement")
    public void user_clicks_on_text_of_announcement() {
       helenPage.text.click();
    }

    @Then("user enters a text of announcement {string}")
    public void user_enters_a_text_of_announcement(String text) {
      helenPage.text.sendKeys(text);
    }


    @Then("user clicks on groups filed")
    public void user_clicks_on_groups_filed() {
       helenPage.groups.click();
    }
    @Then("user clicks on test option")
    public void user_clicks_on_test_option() {
       helenPage.testOption.click();
    }
    @Then("user clicks on add button")
    public void user_clicks_on_add_button() {
       helenPage.addAnnounceInfoButton.click();
    }
    @Then("user sees the announcemnts displayed")
    public void user_sees_the_announcemnts_displayed() {
       Assert.assertTrue(helenPage.information.isDisplayed());
    }

    @Then("user is not able to click on add")
    public void user_is_not_able_to_click_on_add() {
     Assert.assertFalse(helenPage.addAnnounceInfoButton.isEnabled());
    }
    @Then("user close window")
    public void user_close_window() {
        Driver.quitDriver();
    }














}
