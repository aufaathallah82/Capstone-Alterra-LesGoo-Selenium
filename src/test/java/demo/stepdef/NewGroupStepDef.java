package demo.stepdef;

import demo.pages.pageobject.HomepagePages;
import demo.pages.pageobject.NewGroupPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class NewGroupStepDef {

    HomepagePages homepagePages = new HomepagePages();
    NewGroupPages newGroupPages = new NewGroupPages();

    @Given("click button Add Group")
    public void clickButtonAddGroup() {
        homepagePages.clickBtnNewGroup();
    }

    @And("Move to Add Group Page")
    public void moveToAddGroupPage() {
        newGroupPages.newGroupIsDisplayed();
    }

    @And("input Group Name {string}, Dec {string}, Start Date {string}, end date {string}")
    public void inputGroupNameDecStartDateEndDate(String Name, String Desc, String Star, String End) {
        newGroupPages.inputGroupName(Name);
        newGroupPages.inputGroupDesc(Desc);
        newGroupPages.inputStartDate(Star);
        newGroupPages.inputEndDate(End);
    }

    @And("clik Button Save")
    public void clikButtonSave() {
        newGroupPages.clickSaveBtn();
    }
}
