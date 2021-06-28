package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Set;

public class AllPositions {
 //   WebDriver driver = Driver.getDriver();

    public AllPositions(WebDriver driver){

        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy
                (id = "textInputBox")
        WebElement searchBar;
        @FindBy (xpath = "//*[contains(text(), 'Search')]")
        WebElement searchButton;

        public void positionSearch() throws InterruptedException {

        searchBar.sendKeys("QA");
    Thread.sleep(2000);
    searchButton.click();
    Thread.sleep(2000);

    }}

