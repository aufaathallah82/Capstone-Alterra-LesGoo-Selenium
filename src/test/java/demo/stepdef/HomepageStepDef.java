package demo.stepdef;

import demo.pages.pageobject.HomepagePages;
import io.cucumber.java.en.When;

public class HomepageStepDef {

    HomepagePages homepagePages = new HomepagePages();

    @When("My Groups is displayed")
    public void isMyGroupsIsDisplayed() {
        homepagePages.isMyGroupIsDisplayed();
    }

}
