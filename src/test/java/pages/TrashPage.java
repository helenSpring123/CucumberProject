package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrashPage {
    WebDriver driver;

    public TrashPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//li[text()='Trash']")
    public WebElement trashButton ;

    @FindBy(xpath = "(//table//td[3]//*[local-name()='svg']//*[local-name()='g'])[1]")
    public WebElement trashDelete;

    @FindBy(xpath = "(//table//td[3]//*[local-name()='svg'])[1]")
    public WebElement buttonRecovered;


    public void clickButtonTrash(){
        trashButton.click();
        trashDelete.click();
        buttonRecovered.click();

    }


}



