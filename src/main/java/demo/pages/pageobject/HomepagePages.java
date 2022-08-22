package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class HomepagePages extends BasePageObject {

    By logo = By.xpath("/html/body/div/div[2]/div[1]/div/span/img");
    By btnBurger = By.id("btn-burger");
    By btnAddGroup = By.id("btn-addgroup");
    By btnJoinGroup = By.id("btn-addgroup");
    By btnProfile = By.id("btn-profile");
    By btnLogout = By.id("btn-logout");
    By dropdownMenu = By.xpath("//*[@id=\"headlessui-menu-items-:R2r6:\"]");

    public void homepageIsDisplayed() {
        wait(10000);
        isPresent(logo);
        isPresent(btnBurger);
        isPresent(btnAddGroup);
        isPresent(btnJoinGroup);
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
