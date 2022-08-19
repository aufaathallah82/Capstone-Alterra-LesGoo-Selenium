package demo.stepdef;

import demo.pages.pageobject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfilStepDef {

    ProfilePages profilePages = new ProfilePages();
    EditProfilePages editProfilePages = new EditProfilePages();

    @Then("Profile page field is displayed")
    public void profilePageFieldIsDisplayed() {
        profilePages.profileIsDisplayed();
    }

    @When("Click back button on header profile")
    public void clickBackButtonOnHeaderProfile() {
        profilePages.clickBtnBackProfile();
    }

    @Then("Text username should be {string}")
    public void textUsernameShouldBe(String username) {
        Assert.assertEquals(profilePages.getTextUsername(), username);
    }

    @And("Text email should be {string}")
    public void textEmailShouldBe(String email) {
        Assert.assertEquals(profilePages.getTextEmail(), email);
    }

    @And("Text phone should be {string}")
    public void textPhoneShouldBe(String phone) {
        Assert.assertEquals(profilePages.getTextPhone(), phone);
    }

    @When("Click button Edit Profile")
    public void clickButtonEditProfile() {
        profilePages.clickBtnEditProfile();
    }

    @Then("Move to edit profile page")
    public void moveToEditProfilePage() {
        editProfilePages.editProfileIsDisplayed();
    }

    @When("Click delete account button")
    public void clickDeleteAccountButton() {
        editProfilePages.DeleteBtn();
    }
}
