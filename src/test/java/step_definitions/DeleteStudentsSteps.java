package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeleteStudensPage;

public class DeleteStudentsSteps {

    @Then("user clicks on Studens")
    public void user_clicks_on_studens() {
        DeleteStudensPage deleteStudensPage = new DeleteStudensPage();
        deleteStudensPage.ChooseStudents.click();
    }
    @Then("user click on {int} dot for Students")
    public void user_click_on_dot_for_students(Integer int1) {
        DeleteStudensPage deleteStudensPage = new DeleteStudensPage();
        deleteStudensPage.ToremoveIndex1Students.click();
    }
    @Then("user click on delete button for Students")
    public void user_click_on_delete_button_for_students() {
        DeleteStudensPage deleteStudensPage = new DeleteStudensPage();
        deleteStudensPage.removeIndex1.click();

    }
    @Then("user confirm delete on pop up for Studets")
    public void user_confirm_delete_on_pop_up_for_studets() {
        DeleteStudensPage deleteStudensPage = new DeleteStudensPage();
        deleteStudensPage.confirmRemove.click();
    }
    @Then("user verify success deleting Students {string}")
    public void user_verify_success_deleting_students(String verifyTextStudents) {
        DeleteStudensPage deleteStudensPage = new DeleteStudensPage();
        Assert.assertEquals(deleteStudensPage.confirmSuccessfullyDeleted.getText(), verifyTextStudents);
    }
}
