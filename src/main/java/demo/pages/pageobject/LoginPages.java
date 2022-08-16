package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class LoginPages extends BasePageObject {

    By logo = By.xpath("//*[@id=\"__next\"]/div/span/img");
    By signIn = By.xpath("//*[@id=\"__next\"]/h3");
    By usernameField = By.id("input-username");
    By passwordField = By.id("input-password");
    By createAccount = By.xpath("//*[@id=\"__next\"]/form/div[3]/span[2]");
    By btnSignIn = By.id("btn-signin");

    public void isLoginPageDisplayed() {
        isPresent(logo);
        isPresent(signIn);
        isPresent(usernameField);
        isPresent(passwordField);
        isPresent(createAccount);
        isPresent(btnSignIn);
    }

    public void clickBtnCreateAnAccount() {
        clickOn(createAccount);
    }

    public void clickBtnSignIn() {
        clickOn(btnSignIn);
    }

    public void inputUsername(String value) {
        typeOn(usernameField, value);
    }

    public void inputPassword(String value) {
        typeOn(passwordField, value);
    }
}
