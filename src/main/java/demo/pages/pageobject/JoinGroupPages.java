package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class JoinGroupPages extends BasePageObject {

    By txtJoinGroup = By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]");

    public void joinGroupIsDisplayed() {
        isPresent(txtJoinGroup);
    }
}
