package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.*;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }

    public void clickOn(By element) {
        getDriver().findElement(element).click();
    }

    public void typeOn(By element, String text) {
        getDriver().findElement(element).sendKeys(text);
    }

    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public boolean isNotPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public String getText(By element) {
        return getDriver().findElement(element).getText();
    }

    public void clearField(By element) {
        getDriver().findElement(element).clear();
    }
}
