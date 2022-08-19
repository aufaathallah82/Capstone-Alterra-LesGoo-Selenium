package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class GroupDetailPages extends BasePageObject {

    By btnBackGroupDetail = By.id("back-to-home");
    By humburgerIcon = By.id("des-option");
    By txtGroupName = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/h1");
    By txtGroupId = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/h2");
    By txtDescGroup = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/p");
    By txtParticipants = By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/h2");

    By dropdownListHumberIcon = By.xpath("//*[@id=\"headlessui-menu-items-:Rkl6:\"]");
    By profileGroupDetail = By.xpath("//*[@id=\"headlessui-menu-item-:r0:\"]/div[1]");
    By leaveGroupDetail = By.id("btn-leavegroup");
    By deleteGroupDetail = By.id("btn-deletegroup");
    By logoutGroupDetail = By.id("btn-logout");

    public void groupDetailPageIsDisplayed(){
        isPresent(btnBackGroupDetail);
        isPresent(humburgerIcon);
        isPresent(txtGroupName);
        isPresent(txtGroupId);
        isPresent(txtDescGroup);
        isPresent(txtParticipants);
    }

    public void dropdownListHumbergurIconIsDisplayed() {
        isPresent(dropdownListHumberIcon);
    }

    public void clickBtnBackGroupDetail(){
        clickOn(btnBackGroupDetail);
    }

    public void clickHumbergerIcon(){
        clickOn(humburgerIcon);
    }

    public void clickProfileGroupDetail(){
        clickOn(profileGroupDetail);
    }

    public void clickLeaveGroupDetail(){
        clickOn(leaveGroupDetail);
    }

    public void clickDeleteGroupDetail(){
        clickOn(deleteGroupDetail);
    }

    public void clickLogoutGroupDetail(){
        clickOn(logoutGroupDetail);
    }
}
