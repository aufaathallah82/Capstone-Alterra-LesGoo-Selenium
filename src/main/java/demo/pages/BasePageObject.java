package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.*;

import static java.lang.Thread.sleep;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebDriverInstance.webdriver;
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

    public String getText(By element) {
        return getDriver().findElement(element).getText();
    }

    public void clearField(By element) {
        getDriver().findElement(element).clear();
    }

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public void alertLogin() {
        getDriver().switchTo().alert().accept();
    }

    public String getTitle() {
        wait(1000);
        return getDriver().getTitle();
    }
}
