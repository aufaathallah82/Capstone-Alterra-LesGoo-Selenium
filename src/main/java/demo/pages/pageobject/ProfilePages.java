package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class ProfilePages extends BasePageObject {

    // Profile page
    By txtProfile = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");
    By btnBackProfile = By.id("back-to-home");
    By imgIcon = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/svg");
    By txtUsername = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/h1");
    By txtEmail = By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[1]/p");
    By txtPhone = By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[2]/p");;
    By btnEditProfile = By.id("btn-editprofile");

    // Edit Profile page
    By txtEditProfile = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");
    By btnBackEditProfile = By.id("back-to-home");
    By imgIconEdit = By.id("edit-image");
    By usernameField = By.id("edit-username");
    By emailField = By.id("edit-email");
    By phoneField = By.id("edit-phone");

    public void profileIsDisplayed() {
        isPresent(txtProfile);
        isPresent(btnBackProfile);
        isPresent(imgIcon);
        isPresent(txtUsername);
        isPresent(txtEmail);
        isPresent(txtPhone);
        isPresent(btnEditProfile);
    }

    public void editProfileIsDisplayed() {
        isPresent(txtEditProfile);
        isPresent(btnBackEditProfile);
        isPresent(imgIconEdit);
        isPresent(usernameField);
        isPresent(emailField);
        isPresent(phoneField);
    }

    public void clickBtnBackProfile() {
        clickOn(btnBackProfile);
    }

    public void clickBtnEditProfile() {
        clickOn(btnEditProfile);
    }

    public String getTextUsername() {
        return getText(txtUsername);
    }

    public String getTextEmail() {
        return getText(txtEmail);
    }

    public String getTextPhone() {
        return getText(txtPhone);
    }
}
