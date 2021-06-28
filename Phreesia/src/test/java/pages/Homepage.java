package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class Homepage {
    WebDriver driver = Driver.getDriver();

    @FindBy (xpath = "//*[contains(text(), 'Company')]")
    WebElement company;
    @FindBy (xpath = "//*[contains(text(),'Careers')]")
  WebElement careersLink;

public Homepage(WebDriver driver){

  PageFactory.initElements(Driver.getDriver(), this);
}

  public void search () throws InterruptedException {
      String parent=driver.getWindowHandle();
      System.out.println("Parent window handle is: " +parent);

    company.click();
  careersLink.click();
  Thread.sleep(2000);
}

}