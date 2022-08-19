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

    @And("Delete username field")
    public void deleteUsernameField() { editProfilePages.DeleteUsernameField();
    }

    @And("Delete email field")
    public void deleteEmailField() { editProfilePages.DeleteEmailField();
    }

    @And("Delete phone field")
    public void deletePhoneField() { editProfilePages.DeletepHONEfIELD();
    }

    @And("Delete username, email and phone field")
    public void deleteUsernameEmailAndPhoneField() {
        editProfilePages.DeleteUsernameField();
        editProfilePages.DeleteEmailField();
        editProfilePages.DeletepHONEfIELD();
    }
}
