package demo.stepdef;

import demo.pages.pageobject.GroupChatPages;
import demo.pages.pageobject.GroupDetailPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GroupDetailStepDef {

    GroupChatPages groupChatPages = new GroupChatPages();
    GroupDetailPages groupDetailPages = new GroupDetailPages();

    @Then("directed to group detail page")
    public void directedToGroupDetailPages(){
        groupDetailPages.groupDetailPageIsDisplayed();
    }

    @When("Click back button")
    public void clickReturnButton(){
        groupDetailPages.clickBtnBackGroupDetail();
    }

    @Then("directed to group chat page")
    public void directedToGroupChatPage(){
        groupChatPages.groupNameIsDisplayed();
    }

    @When("Click humbergur icon")
    public void clickOptionButton(){
        groupDetailPages.clickHumbergerIcon();
    }

    @Then("Show profile, leave group, delete group, and logout button")
    public void showProfileLeaveGroupDeleteGroupAndLogoutBtn(){
        groupDetailPages.dropdownListHumbergurIconIsDisplayed();
    }

    @When("Click profile icon on dropdown list group detail")
    public void clickProfileIconOnDropdownListGroupDetail() {
        groupDetailPages.clickProfileGroupDetail();
    }

    @When("Click leave group icon on dropdown list group detail")
    public void clickLeaveGroupIconOnDropdownListGroupDetail() {
        groupDetailPages.clickLeaveGroupDetail();
    }

    @When("Click delete group on dropdown list group detail")
    public void clickDeleteGroupOnDropdownListGroupDetail() {
        groupDetailPages.clickDeleteGroupDetail();
    }

    @When("Click logout on dropdown list group detail")
    public void clickLogoutOnDropdownListGroupDetail() {
        groupDetailPages.clickLogoutGroupDetail();
    }
}
