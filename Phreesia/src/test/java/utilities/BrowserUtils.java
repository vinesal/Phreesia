package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserUtils {
    WebDriver driver = Driver.getDriver();
    public void scrolling(int i) throws InterruptedException {
        JavascriptExecutor Js1 = (JavascriptExecutor)driver;
        int j = 0;
        while (j<=i)
        { Js1.executeScript("window.scrollBy(0,500)");
            Thread.sleep(1000);
            j++;}}

    public  void windowHandling(){
  String parent=driver.getWindowHandle();
    Set<String> s=driver.getWindowHandles();
        
        for (String child_window : s) {
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
            }
        }
    }}
