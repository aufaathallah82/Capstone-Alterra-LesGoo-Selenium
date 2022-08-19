package demo.stepdef;

import demo.pages.pageobject.EditProfilePages;
import demo.pages.pageobject.LoginPages;
import demo.pages.pageobject.ProfilePages;
import demo.pages.pageobject.RegisterPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditProfilStepDef {

    EditProfilePages editProfilePages = new EditProfilePages();
    ProfilePages profilePages = new ProfilePages();

    @And("move to Edit Profil Page")
    public void moveToEditProfilPage() {
        editProfilePages.editProfileIsDisplayed();
    }

    @And("input username {string}, email {string}, phone {string}")
    public void inputUsernameEmailPhone(String username, String email, String phoneNumber) {
        editProfilePages.inputUsernameField(username);
        editProfilePages.inputEmailField(email);
        editProfilePages.inputPhoneField(phoneNumber);
    }

    @And("click button save")
    public void clickButtonSave() {
        editProfilePages.SaveChangesBtn();
    }

    @When("Clik Delete Button")
    public void clikDeleteButton() {
        editProfilePages.DeleteBtn();
    }

    @And("clear username field")
    public void deleteUsernameField() {
        editProfilePages.clearUsernameField();
    }

    @And("clear email field")
    public void deleteEmailField() {
        editProfilePages.clearEmailField();
    }

    @And("clear phone field")
    public void deletePhoneField() {
        editProfilePages.clearPhoneField();
    }

    @And("clear username, email and phone field")
    public void deleteUsernameEmailAndPhoneField() {
        editProfilePages.clearUsernameField();
        editProfilePages.clearEmailField();
        editProfilePages.clearPhoneField();
    }
}
