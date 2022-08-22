package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class JoinGroupPages extends BasePageObject {

    By txtJoinGroup = By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]");
    By btnBackJoinGroup = By.id("back-to-home");
    By groupIdField = By.id("input-groupid");
    By btnJoinGroup = By.id("btn-join");

    public void joinGroupIsDisplayed() {
        isPresent(txtJoinGroup);
    }

    public void clickBackButton() {
        clickOn(btnBackJoinGroup);
    }

    public void inputGroupId(String groupId) {
        typeOn(groupIdField, groupId);
    }

    public void clickOkAlertMessage() {
        alertLogin();
    }

    public void btnOkJoinGroup() {
        clickOn(btnJoinGroup);
    }
}
