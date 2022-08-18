package demo.stepdef;

import demo.pages.pageobject.GroupChatPages;
import demo.pages.pageobject.GroupDetailPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GroupDetailStepDef {

    GroupChatPages groupChatPages = new GroupChatPages();
    GroupDetailPages groupDetailPages = new GroupDetailPages();

   @When("Click group name")
    public void clickGroupName(){groupChatPages.clickGroupName();}

   @Then("directed to group detail page")
    public void directedToGroupDetailPages(){groupDetailPages.groupDetailPageIsDisplayed();}

    @When("Click return button")
    public void clickReturnButton(){groupDetailPages.clickReturnBtn();}

    @Then("directed to group chat page")
    public void directedToGroupChatPage(){groupChatPages.profileBtnLeaveGroupBtnLogoutBtn();}

    @When("Click option button")
    public void clickOptionButton(){groupDetailPages.clickOptionBtn();}
}
