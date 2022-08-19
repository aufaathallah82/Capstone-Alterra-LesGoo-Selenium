package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class RegisterPages extends BasePageObject {

    By registerText = By.xpath("/html/body/div/div[2]/h1");
    By usernameField = By.id("inputReg-username");
    By emailField = By.id("inputReg-email");
    By phoneField = By.id("inputReg-email");
    By passwordField = By.id("inputReg-password");
    By btnSignUp = By.id("btn-register");
    By txtLoginNow = By.xpath("//*[@id=\"__next\"]/div[2]/form/div[5]/span[2]");

    public void registerPageIsDisplayed() {
        isPresent(registerText);
        isPresent(usernameField);
        isPresent(emailField);
        isPresent(phoneField);
        isPresent(passwordField);
        isPresent(btnSignUp);
        isPresent(txtLoginNow);
    }

    public void clickTxtLoginNow() {
        clickOn(txtLoginNow);
    }

    public void clickBtnSignUp() {
        clickOn(btnSignUp);
    }

    public void inputUsername(String username) {
        typeOn(usernameField, username);
    }

    public void inputEmail(String email) {
        typeOn(emailField, email);
    }

    public void inputPhone(String phone) {
        typeOn(phoneField, phone);
    }

    public void inputPassword(String password) {
        typeOn(passwordField, password);
    }
}
