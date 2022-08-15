package demo.hooks;

import demo.webdriver.WebdriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class WebdriverHooks {
  @Before(value = "@web")
  public void initializeWebdriver() {
    WebdriverInstance.initialize();
  }

  @After(value = "@web")
  public void quitWebdriver(Scenario scenario) {
//    if (scenario.isFailed()) {
//
//      try{
//        final byte[] data = ((TakesScreenshot) WebdriverInstance.webdriver).getScreenshotAs(OutputType.BYTES);
//        scenario.attach(data, "image/png", "Failed Screenshot");
//      } catch (WebDriverException e) {
//        e.printStackTrace();
//      }
//
//    }

    WebdriverInstance.quit();
  }
}
