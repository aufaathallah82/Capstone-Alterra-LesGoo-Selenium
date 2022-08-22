package demo.stepdef;

import demo.pages.pageobject.HomepagePages;
import demo.pages.pageobject.JoinGroupPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class JoinGroupStepDef {

    JoinGroupPages joinGroupPages = new JoinGroupPages();
    HomepagePages homepagePages = new HomepagePages();

    @Given("Join group page field is displayed")
    public void clickButtonAddGroup() {
        Assert.assertEquals(joinGroupPages.getTitle(), "LesGoo | Join Group");
    }

    @When("Click back button on header join group")
    public void clickBackButtonOnHeader() {
        joinGroupPages.clickBackButton();
    }

    @Then("Move to homepage")
    public void moveToHomepage() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Make Your Roadtrip Easier");
//        homepagePages.homepageIsDisplayed();
    }

    @When("Input valid groupId {string}")
    public void inputValidGroupId(String groupId) {
        joinGroupPages.inputGroupId(groupId);
    }

    @Then("Click ok alert message")
    public void clickOkAlertMessage() {
        joinGroupPages.wait(3000);
        joinGroupPages.clickOkAlertMessage();
    }

    @And("Click button join")
    public void clickButtonJoin() {
        joinGroupPages.btnOkJoinGroup();
    }
}
