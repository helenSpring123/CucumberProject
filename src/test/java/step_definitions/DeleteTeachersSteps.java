package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeleteTeachersPage;

public class DeleteTeachersSteps {


    @Then("user click on {int} dot")
    public void user_click_on_dot(Integer int1) {
        DeleteTeachersPage deleteTeachersPage = new DeleteTeachersPage();
        deleteTeachersPage.toremoveIndex1.click();
    }
    @Then("user click on delete button")
    public void user_click_on_delete_button() {
        DeleteTeachersPage deleteTeachersPage = new DeleteTeachersPage();
        deleteTeachersPage.removeIndex1.click();

    }
    @Then("user confirm delete on pop up")
    public void user_confirm_delete_on_pop_up() {
        DeleteTeachersPage deleteTeachersPage = new DeleteTeachersPage();
        deleteTeachersPage.confirmRemove.click();
    }
    @Then("user verify success deleting")
    public void user_verify_success_deleting() {
        DeleteTeachersPage deleteTeachersPage = new DeleteTeachersPage();
        Assert.assertEquals(deleteTeachersPage.confirmSuccessfullyDeleted.getText(), "Instructor successfully deleted");
    }
}
