package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class NewGroupPages extends BasePageObject {

    By txtNewGroup = By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[2]");

    public void newGroupIsDisplayed() {
        isPresent(txtNewGroup);
    }

}
