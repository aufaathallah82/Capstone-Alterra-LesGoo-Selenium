package demo.stepdef;

import demo.pages.pageobject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilStepDef {
    ProfilePages profilePages = new ProfilePages();
    @When("click Burger Icon")
    public void clickBurgerIcon() { profilePages.clickButtonBurger();
    }

    @And("click Profil Icon")
    public void clickProfilIcon() { profilePages.clickButtonProfil();
    }

    @Then("user direct to Profil page")
    public void userDirectToProfilPage() { profilePages.profileIsDisplayed();
    }
}
