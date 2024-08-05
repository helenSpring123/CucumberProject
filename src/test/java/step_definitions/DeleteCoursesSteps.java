package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeleteCoursesPage;


public class DeleteCoursesSteps {


    @Then("user clicks on Courses")
    public void user_clicks_on_courses() {
        DeleteCoursesPage deleteCoursesPage = new DeleteCoursesPage();
        deleteCoursesPage.coursesButton.click();
    }
    @Then("user click on {int} dot for Courses")
    public void user_click_on_dot_for_courses(Integer int1) {
        DeleteCoursesPage deleteCoursesPage = new DeleteCoursesPage();
        deleteCoursesPage.dotForDelete.click();
    }
    @Then("user click on delete button for Courses")
    public void user_click_on_delete_button_for_courses() {
        DeleteCoursesPage deleteCoursesPage = new DeleteCoursesPage();
        deleteCoursesPage.removeIndex1ForCourses.click();
    }
    @Then("user confirm delete on pop up for Courses")
    public void user_confirm_delete_on_pop_up_for_courses() {
        DeleteCoursesPage deleteCoursesPage = new DeleteCoursesPage();
        deleteCoursesPage.confirmRemove.click();
    }
    @Then("user verify success deleting {string}")
    public void user_verify_success_deleting(String verifyText) {
        DeleteCoursesPage deleteCoursesPage = new DeleteCoursesPage();
        Assert.assertEquals(deleteCoursesPage.confirmSuccessfullyDeleted.getText(), verifyText);

    }



}
