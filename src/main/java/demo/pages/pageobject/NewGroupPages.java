package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class NewGroupPages extends BasePageObject {

    By txtNewGroup = By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[2]");
    By profilpic = By.xpath("//*[@id=\"input-groupimage\"]");
    By inputGroupName = By.id("input-groupname");
    By InputGroupDesc = By.id("input-groupdes");
    By StarDate = By.id("start-date");
    By EndDate = By.id("end-date");
    By MapStart = By.xpath("//*[@id=\"__next\"]/div[2]/form/div[4]/div");
    By MapEnd = By.xpath("//*[@id=\"__next\"]/div[2]/form/div[5]/div");
    By SaveBtn = By.xpath("//*[@id=\"btn-newgroup\"]/path");
    By btnBackHomepage = By.id("back-to-home");

    public void newGroupIsDisplayed() {
        isPresent(txtNewGroup);
        isPresent(profilpic);
        isPresent(inputGroupName);
        isPresent(InputGroupDesc);
        isPresent(StarDate);
        isPresent(EndDate);
        isPresent(MapStart);
        isPresent(MapEnd);
        isPresent(SaveBtn);
    }

    public void inputGroupName(String Name){
        typeOn(inputGroupName,Name);
    }

    public void inputGroupDesc(String Desc){
        typeOn(InputGroupDesc,Desc);
    }

    public void inputStartDate(String Start){
        typeOn(StarDate,Start);
    }

    public void inputEndDate(String End){
        typeOn(EndDate,End);
    }

    public void clickSaveBtn(){
        clickOn(SaveBtn);
    }

    public void btnBackHomepage() {
        clickOn(btnBackHomepage);
    }
}
