package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class GroupChatPages extends BasePageObject {

    By groupName = By.id("group-name");
    By btnHamburger = By.xpath("/html/body/div/div[2]/div[1]/div/div/button");
    By profileBtn = By.id("btn-profile");
    By groupDetailBtn = By.id("btn-groupdetail");
    By leaveGroupBtn = By.id("btn-leavegroup");
    By logOutBtn = By.id("btn-logout");
    By sOSBtn = By.id("btn-SOS");
    By sOSPage = By.id("");
    By chatField = By.id("input-chat");
    By btnSend = By.id("btn-send");

    public void groupNameIsDisplayed() {
        isPresent(groupName);
    }

    public void profileBtnLeaveGroupBtnLogoutBtn(){
        isPresent(profileBtn);
        isPresent(leaveGroupBtn);
        isPresent(logOutBtn);
    }

    public void sOSPageIsDisplayed() {
        isPresent(sOSPage);
    }

    public void clickBtnHamburger() {
        clickOn(btnHamburger);
    }

    public void clickBtnProfile() {
        clickOn(profileBtn);
    }

    public void clickBtnGroupDetail() {
        clickOn(groupDetailBtn);
    }

    public void clickBtnLeave() {
        clickOn(leaveGroupBtn);
    }

    public void clickBtnLogout() {
        clickOn(logOutBtn);
    }

    public void clickBtnSOS() {
        clickOn(sOSBtn);
    }

    public void clickFieldChat() {
        clickOn(chatField);
    }

    public void inputString(String chat) {
        By element = By.id("input-chat");
        typeOn(element, chat);
    }

    public void clickBtnSend() {
        clickOn(btnSend);
    }

    public void clickGroupName() {
        clickOn(groupName);
    }
}
