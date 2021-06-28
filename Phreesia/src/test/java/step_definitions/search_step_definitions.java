package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AllPositions;
import pages.CareersPage;
import pages.Homepage;
import pages.QAPositions;
import utilities.BrowserUtils;
import utilities.Driver;


public class search_step_definitions extends BrowserUtils {

    WebDriver driver = Driver.getDriver();
    Homepage hp = new Homepage(driver);
   CareersPage cp = new CareersPage(driver);
   AllPositions ap = new AllPositions(driver);
   QAPositions qp = new QAPositions(driver);
   BrowserUtils bu = new BrowserUtils();
  //Thread.sleep added to several methods for illustration purposes

  @When("user clicks on Careers link")
  public void user_clicks_on_careers_link() throws InterruptedException {
   //   bu.windowHandling();
   hp.search();
  }

    @When("user clicks on View Open Positions link")
    public void user_clicks_on_view_open_positions_link() throws InterruptedException {
  //bu.windowHandling();
     cp.search();
  bu.windowHandling();}

    @When("user enters QA in the search bar")
    public void user_enters_qa_in_the_search_bar() throws InterruptedException {
       ap.positionSearch();
    }
    @When("user cliks on QA Engineer position")
    public void user_cliks_on_qa_engineer_position() {
        qp.QAclick();
    }

    @Then("user lands on QA Engineer page")
    public void user_lands_on_qa_engineer_page() {
       String title =  driver.getTitle();
        Assert.assertEquals(title, "QA Engineer");
    }




}
