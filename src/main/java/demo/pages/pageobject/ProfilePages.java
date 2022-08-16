package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class ProfilePages extends BasePageObject {

    By txtProfile = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");

    public void profileIsDisplayed() {
        isPresent(txtProfile);
    }
}
