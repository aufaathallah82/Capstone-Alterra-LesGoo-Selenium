package demo.stepdef;

import demo.pages.pageobject.EditProfilePages;
import demo.pages.pageobject.LoginPages;
import demo.pages.pageobject.ProfilePages;
import demo.pages.pageobject.RegisterPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProfilStepDef {
    EditProfilePages editProfilePages = new EditProfilePages();
    ProfilePages profilePages = new ProfilePages();

    @When("click Button Edit Profile")
    public void clickButtonEditProfile() {editProfilePages.clickEditBtn();
    }
    @And("move to Edit Profil Page")
    public void moveToEditProfilPage() { editProfilePages.EditProfilisDisplayed();
    }
    @And("input username {string}, email {string}, phone {string}")
    public void inputUsernameEmailPhone(String username, String email, String phonenumber) {
    editProfilePages.inputUsernameField(username);
    editProfilePages.inputEmailField(email);
    editProfilePages.inputPhoneField(phonenumber);}

    @And("click button save")
    public void clickButtonSave() { editProfilePages.SaveChangesBtn();
    }


    @When("Clik Delete Button")
    public void clikDeleteButton() { editProfilePages.DeleteBtn();
    }
}
