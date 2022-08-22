package demo.stepdef;

import demo.pages.pageobject.GroupChatPages;
import demo.pages.pageobject.HomepagePages;
import demo.pages.pageobject.LoginPages;
import demo.pages.pageobject.RegisterPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPages loginPages = new LoginPages();
    RegisterPages registerPages = new RegisterPages();
    HomepagePages homepagePages = new HomepagePages();
    GroupChatPages groupChatPages = new GroupChatPages();

    @Then("Login page field is displayed")
    public void isLoginPageDisplayed() {
        loginPages.isLoginPageDisplayed();
    }

    @When("Click Create an Account")
    public void clickCreateAnAccount() {
        loginPages.clickBtnCreateAnAccount();
    }

    @Then("Move to register page")
    public void moveToRegisterPage() {
        Assert.assertEquals(registerPages.getTitle(), "LesGoo | Register");
    }

    @Given("Input username {string} and password {string}")
    public void inputUsernameAndPassword(String username, String password) {
        loginPages.inputUsername(username);
        loginPages.inputPassword(password);
    }

    @When("Click button sign in")
    public void clickButtonSignIn() {
        loginPages.clickBtnSignIn();
    }

    @Then("Login successfully and direct to homepage")
    public void loginSuccessfullyAndDirectToHomepage() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Make Your Roadtrip Easier");
    }

    @Then("Login successfully and direct to group chat")
    public void loginSuccessfullyAndDirectToGroupChat() {
        Assert.assertEquals(homepagePages.getTitle(), "LesGoo | Group");
//        groupChatPages.groupNameIsDisplayed();
    }
}
