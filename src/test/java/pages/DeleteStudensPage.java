package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteStudensPage {







    WebDriver driver;

    public DeleteStudensPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }



    @FindBy(xpath = "//li[text()='Students']")
    public WebElement ChooseStudents;

    @FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"])[3]")
    public WebElement ToremoveIndex1Students;

    @FindBy(xpath = "(//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-l5jx0u\"])[3]")
    public WebElement removeIndex1;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement confirmRemove;

    @FindBy(xpath = "//p[text()='Student successfully deleted']")
    public WebElement confirmSuccessfullyDeleted;

}