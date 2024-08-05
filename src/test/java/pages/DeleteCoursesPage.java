package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteCoursesPage {



    WebDriver driver;
    public DeleteCoursesPage(){
        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[text()='Courses']")
    public WebElement coursesButton;

    @FindBy(xpath = "(//div[@class=\"css-yys58j\"])[1]")
    public WebElement dotForDelete;

    @FindBy(xpath = "(//li[text()='Delete'])[1]")
    public WebElement removeIndex1ForCourses;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium sc-eKJbhj iZsItr css-fab8xs\"]")
    public WebElement confirmRemove;

    @FindBy(xpath = "//p[text()='The course successfully deleted']")
    public WebElement confirmSuccessfullyDeleted;

}
