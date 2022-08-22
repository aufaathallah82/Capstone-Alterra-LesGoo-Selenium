package demo.hooks;

import demo.webdriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class WebDriverHooks {
  @Before(value = "@web")
  public void initializeWebdriver() {
    WebDriverInstance.initialize();
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

    WebDriverInstance.quit();
  }
}
