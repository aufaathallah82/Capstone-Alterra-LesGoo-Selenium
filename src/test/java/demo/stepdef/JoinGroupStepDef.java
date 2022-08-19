package demo.stepdef;

import demo.pages.pageobject.HomepagePages;
import demo.pages.pageobject.JoinGroupPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JoinGroupStepDef {

    JoinGroupPages joinGroupPages = new JoinGroupPages();
    HomepagePages homepagePages = new HomepagePages();

    @Given("Join group page field is displayed")
    public void clickButtonAddGroup() {
        joinGroupPages.joinGroupIsDisplayed();
    }

    @When("Click back button on header join group")
    public void clickBackButtonOnHeader() {
        joinGroupPages.clickBackButton();
    }

    @Then("Move to homepage")
    public void moveToHomepage() {
        homepagePages.homepageIsDisplayed();
    }

    @When("Input valid groupId {string}")
    public void inputValidGroupId(String groupId) {
        joinGroupPages.inputGroupId(groupId);
    }
}
