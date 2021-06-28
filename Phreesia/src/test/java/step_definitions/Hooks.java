package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks  {
   WebDriver driver = Driver.getDriver();

@Before
public void start() throws InterruptedException {
   String URL = ConfigurationReader.getProperty("url");
   driver.get(URL);
   System.out.println("current URL: "+ driver.getCurrentUrl());
   Thread.sleep(1000);
}

   @After
   public void quit(Scenario scenario) throws IOException {
      if (scenario.isFailed()) {

            TakesScreenshot scrShot =((TakesScreenshot)driver);

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            File DestFile=new File("C:\\Users\\lyopa\\Downloads\\scrShots.png");

            FileUtils.copyFile(SrcFile, DestFile);


         }
      Driver.quit();
   }

   }


