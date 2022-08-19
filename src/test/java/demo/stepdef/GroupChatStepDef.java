package demo.stepdef;

import demo.pages.pageobject.GroupChatPages;
import demo.pages.pageobject.HomepagePages;
import demo.pages.pageobject.LoginPages;
import demo.pages.pageobject.ProfilePages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GroupChatStepDef {

    GroupChatPages groupChatPages = new GroupChatPages();
    ProfilePages profilePages = new ProfilePages();
    HomepagePages homepagePages = new HomepagePages();
    LoginPages loginPages = new LoginPages();

    @When("Click group name")
    public void clickGroupName(){
        groupChatPages.clickGroupName();
    }

    @When("Click group burger icon")
    public void clickBurgerIcon() {
        groupChatPages.clickBtnHamburger();
    }

    @Then("Show profile, leave group, and logout button")
    public void showProfileLeaveGroupAndLogout(){
        groupChatPages.profileBtnLeaveGroupBtnLogoutBtn();
    }

    @When("Click profile icon")
    public void clickProfileIcon(){
        groupChatPages.clickBtnProfile();
    }

    @Then("directed to profile")
    public void directedToProfile(){
        profilePages.profileIsDisplayed();
    }

    @When("Click leave group icon")
    public void clickLeaveGroupIcon(){
        groupChatPages.clickBtnLeave();
    }

    @Then("directed to home page")
    public void directedToHomepage(){
        homepagePages.homepageIsDisplayed();
    }

    @When("Click logout group icon")
    public void clickLogoutIcon(){
        groupChatPages.clickBtnLogout();
    }

    @Then("directed to login page")
    public void directedToLoginpage(){
        loginPages.isLoginPageDisplayed();
    }

    @When("Click SOS icon")
    public void clickSOSIcon(){
        groupChatPages.clickBtnSOS();
    }

    @Then("Show SOS page")
    public void showSOSPage(){
        groupChatPages.sOSPageIsDisplayed();
    }

    @When("Click chat field")
    public void clickChatField(){
        groupChatPages.clickFieldChat();
    }

    @When("input {string}")
    public void inputString(String arg0) {
        groupChatPages.inputString(arg0);
    }

    @Then("Show {string} in chat field")
    public void showInChatField(String arg0) {
        groupChatPages.inputString(arg0);
    }

    @When("Click send button")
    public void clickSendButton(){
        groupChatPages.clickBtnSend();
    }

    @Then("Show {string} in group chat")
    public void showInGroupChat(String arg0) {
        groupChatPages.inputString(arg0);
    }
}
