package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class HomepagePages extends BasePageObject {

    By logo = By.xpath("/html/body/div/div[2]/div[1]/div/span/img");
    By btnBurger = By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/button");
    By btnAddGroup = By.xpath("/html/body/div/div[2]/div[2]/div");
    By btnJoinGroup = By.xpath("/html/body/div/div[2]/div[3]/div");
    By btnProfile = By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[1]");
    By btnLogout = By.id("btn-logout");
    By dropdownMenu = By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div");

    public void homepageIsDisplayed() {
//        isPresent(logo);
//        isPresent(btnBurger);
//        isPresent(btnAddGroup);
//        isPresent(btnJoinGroup);
    }

    public Boolean dropdownMenuDisplayed() {
        return isPresent(dropdownMenu);
    }

    public void clickBtnBurgerIcon() {
        clickOn(btnBurger);
    }

    public void clickProfile() {
        clickOn(btnProfile);
    }

    public void clickLogout() {
        clickOn(btnLogout);
    }

    public void clickBtnNewGroup() {
        clickOn(btnAddGroup);
    }

    public void clickBtnJoinGroup() {
        clickOn(btnJoinGroup);
    }
}
