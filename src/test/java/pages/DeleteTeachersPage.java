package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteTeachersPage {

    WebDriver driver;
    public DeleteTeachersPage(){
        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }




    @FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"])[1]")
    public WebElement toremoveIndex1;

    @FindBy(xpath = "(//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-l5jx0u\" and @tabindex=\"-1\"])[1]")
    public WebElement removeIndex1;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium sc-eKJbhj iZsItr css-fab8xs\"]")
    public WebElement confirmRemove;

    @FindBy(xpath = "//p[text()='Instructor successfully deleted']")
    public WebElement confirmSuccessfullyDeleted;





}