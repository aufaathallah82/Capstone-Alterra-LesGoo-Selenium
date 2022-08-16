package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class GroupChatPages extends BasePageObject {

    By groupName = By.id("group-name");

    public void groupNameIsDisplayed() {
        isPresent(groupName);
    }

}
