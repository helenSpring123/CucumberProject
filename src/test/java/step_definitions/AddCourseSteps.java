package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.CoursesPage;
import utilities.Driver;

public class AddCourseSteps {


    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage();
    CoursesPage coursesPage = new CoursesPage();


    @Then("the user clicks to the Courses page")
    public void the_user_clicks_to_the_courses_page() {
        commonPage.coursesPage.click();
    }
    @Then("the user clicks on the Add Course button")
    public void the_user_clicks_on_the_add_course_button() {
        coursesPage.addCourseB8t.click();
    }
    @Then("the user enters {string} as the course name")
    public void the_user_enters_as_the_course_name(String string) {
        coursesPage.courseNameInput.sendKeys(string);
    }
    @Then("the user enters {string} as the date of finish")
    public void the_user_enters_as_the_date_of_finish(String string) {
        coursesPage.dateOfFinishInput.sendKeys(string);
    }
    @Then("the user enters {string} as the description")
    public void the_user_enters_as_the_description(String string) {
        coursesPage.descriptionInput.sendKeys(string);
    }
    @Then("the user clicks on the Create button")
    public void the_user_clicks_on_the_create_button() {
        coursesPage.createB8t.click();
    }
    @Then("the user should see the course {string} in the list of courses")
    public void the_user_should_see_the_course_in_the_list_of_courses(String string) {
        driver.navigate().refresh();

        Assert.assertEquals("CHECK CHECK", coursesPage.newCourseName.getText());
    }






}
