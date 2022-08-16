package demo.stepdef;

import demo.pages.pageobject.LoginPages;
import demo.pages.pageobject.RegisterPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {

    RegisterPages registerPages = new RegisterPages();
    LoginPages loginPages = new LoginPages();

    @Then("Register page field is displayed")
    public void isLoginPageDisplayed() {
        registerPages.registerPageIsDisplayed();
    }

    @When("Click Login now")
    public void clickLoginNow() {
        registerPages.clickTxtLoginNow();
    }

    @Then("Move to sign in page")
    public void moveToSignInPage() {
        loginPages.isLoginPageDisplayed();
    }

    @Given("Input username {string}, email {string}, phone {string}, password {string}")
    public void inputUsernameEmailPhonePassword(String username, String email, String phone, String password) {
        registerPages.inputUsername(username);
        registerPages.inputEmail(email);
        registerPages.inputPhone(phone);
        registerPages.inputPassword(password);
    }

    @When("Click button sign up")
    public void clickButtonSignUp() {
        registerPages.clickBtnSignUp();
    }
}
