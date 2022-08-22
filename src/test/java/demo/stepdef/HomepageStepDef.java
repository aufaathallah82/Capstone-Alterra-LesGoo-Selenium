package demo.stepdef;

import demo.pages.pageobject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomepageStepDef {

    HomepagePages homepagePages = new HomepagePages();
    ProfilePages profilePages = new ProfilePages();
    LoginPages loginPages = new LoginPages();
    JoinGroupPages joinGroupPages = new JoinGroupPages();
    NewGroupPages newGroupPages = new NewGroupPages();

    @When("Homepage is displayed")
    public void isMyGroupsIsDisplayed() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Make Your Roadtrip Easier");
//        homepagePages.homepageIsDisplayed();
    }

    @When("Click burger icon")
    public void clickBurgerIcon() {
        homepagePages.clickBtnBurgerIcon();
    }

    @Then("Show dropdown menu")
    public void showDropdownMenu() {
        homepagePages.dropdownMenuDisplayed();
    }

    @Then("Click profile")
    public void clickProfile() {
        homepagePages.clickProfile();
    }

    @And("Success direct to Profile page")
    public void successDirectToProfilePage() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Profile");
//        profilePages.profileIsDisplayed();
    }

    @Then("Click logout")
    public void clickLogout() {
        homepagePages.clickLogout();
    }

    @And("Success direct to Sign in page")
    public void successDirectToSignInPage() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Login");
//        loginPages.isLoginPageDisplayed();
    }

    @Then("Make sure dropdown menu is minimize")
    public void makeSureDropdownMenuIsMinimize() {
        Assert.assertFalse(homepagePages.dropdownMenuDisplayed());
    }

    @Given("Click button new group")
    public void clickButtonNewGroup() {
        homepagePages.clickBtnNewGroup();
    }

    @Then("Success direct to New Group page")
    public void successDirectToNewGroupPage() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | New Group");
//        newGroupPages.newGroupIsDisplayed();
    }

    @Given("Click button join group")
    public void clickButtonJoinGroup() {
        homepagePages.clickBtnJoinGroup();
    }

    @Then("Success direct to Join Group page")
    public void successDirectToJoinGroupPage() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Join Group");
//        joinGroupPages.joinGroupIsDisplayed();
    }
}
