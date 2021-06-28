package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QAPositions {
    public QAPositions(WebDriver driver){
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy (id = "promptOption-gwt-uid-3")
    WebElement QAposition;

    public void QAclick(){
        QAposition.click();
    }
}
