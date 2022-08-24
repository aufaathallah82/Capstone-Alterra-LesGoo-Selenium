package demo.webdriver;

import java.util.HashMap;
import java.util.Map;
//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverInstance {

    public static WebDriver webdriver;


    public static void initialize()  {
        System.setProperty("webdriver.chrome.driver", "/Users/auv/Capstone-Alterra-LesGoo-Selenium/chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=selenium");
        options.setExperimentalOption("prefs", prefs);
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        webdriver = new ChromeDriver(options);
        webdriver.manage().window().maximize();
        webdriver.get("https://les-goo.vercel.app/login");
        webdriver.manage().deleteAllCookies();
    }

    public static void quit() {
        webdriver.quit();
    }
}
