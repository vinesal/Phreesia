package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CareersPage {

        public CareersPage(WebDriver driver) {
            PageFactory.initElements(Driver.getDriver(), this);
        }
       @FindBy
            (xpath = "//*[contains( text(), 'VIEW OPEN POSITIONS')]")
    WebElement positions;

public void search () throws InterruptedException {
    positions.click();
    Thread.sleep(2000);}}

