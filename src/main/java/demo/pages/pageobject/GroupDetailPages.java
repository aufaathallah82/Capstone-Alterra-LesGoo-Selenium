package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class GroupDetailPages extends BasePageObject {

    By TitleGroup = By.id("group-name");
    By OptionIcon = By.id("des-option");
    By ReturnArrow = By.id("back-to-home");
    By GroupId = By.id("group-id");
    By PaticipantCount = By.id("group-participant");
    By ProfileBtn = By.id("");
    By LeaveGroupBtn = By.id("");
    By DeleteGroupBtn = By.id("");
    By LogoutBtn = By.id("");



    public void groupDetailPageIsDisplayed(){
        isPresent(TitleGroup);
        isPresent(OptionIcon);
        isPresent(ReturnArrow);
        isPresent(GroupId);
        isPresent(PaticipantCount);
    }

    public void groupOptionBtnIsDisplayed(){
        isPresent(ProfileBtn);
        isPresent(LeaveGroupBtn);
        isPresent(DeleteGroupBtn);
        isPresent(LogoutBtn);
    }

    public void clickReturnBtn(){clickOn(ReturnArrow);}
    public void clickOptionBtn(){clickOn(OptionIcon);}

}
