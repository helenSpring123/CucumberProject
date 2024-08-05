package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.StudentsPage;
import utilities.Driver;

public class AddStudentSteps {
    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage();
    StudentsPage studentsPage = new StudentsPage();




    @When("the user clicks to the Students page")
    public void the_user_clicks_to_the_students_page() {
        commonPage.studentsPage.click();
    }
    @Then("the user clicks on the Add Student button")
    public void the_user_clicks_on_the_add_student_button() {
        studentsPage.addStudent.click();
    }
    @Then("the user enters {string} as the first name")
    public void the_user_enters_as_the_first_name(String string) {
        studentsPage.firstNameInput.sendKeys(string);
    }
    @Then("the user enters {string} as the last name")
    public void the_user_enters_as_the_last_name(String string) {
        studentsPage.lastNameInput.sendKeys(string);
    }
    @Then("the user enters {string} as the phone number")
    public void the_user_enters_as_the_phone_number(String string) {
        studentsPage.phoneNumInput.click();
        studentsPage.phoneNumInput.sendKeys(string);
    }
    @Then("the user enters {string} as the email")
    public void the_user_enters_as_the_email(String string) {
        studentsPage.emailInput.sendKeys(string);
    }
    @Then("the user selects the Test Group from the group options")
    public void the_user_selects_the_test_group_from_the_group_options() {
        studentsPage.groupSelect.click();
        studentsPage.testGroup.click();
    }
    @Then("the user selects Offline as the study format")
    public void the_user_selects_offline_as_the_study_format() {
        studentsPage.studyFormat.click();
        studentsPage.offlineFormat.click();
    }
    @Then("the user clicks on the Add button")
    public void the_user_clicks_on_the_add_button() {
        studentsPage.addB8t.click();
    }
    @Then("the user should see the student {string} in the list of students")
    public void the_user_should_see_the_student_in_the_list_of_students(String string) {
        driver.navigate().refresh();

        Assert.assertEquals("Azizbek Usman", studentsPage.nameOfAddedStud.getText());
    }
    @Then("the user clicks on the Cancel button")
    public void the_user_clicks_on_the_cancel_button() {
        studentsPage.cancelB8t.click();
    }



}
