package demo.pages.pageobject;

import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class ProfilePages extends BasePageObject {

    By txtProfile = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");
    By BurgerIcon = By.xpath("//*[@id=\"btn-burger\"]/path");
    By ProfilIcon = By.xpath("//*[@id=\"headlessui-menu-item-:r5:\"]/div[1]");
    By ProfilTittle = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");
    By ProfilPic = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/svg/path[2]");
    By ProfilUsername = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/h1");
    By ProfilEmail = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[1]/h2");
    By ProfilEmailUser = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[1]/p");
    By ProfilPhone = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/h2");
    By ProfilPhoneUser = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/p");
    By EditProfilButton = By.xpath("//*[@id=\"btn-editprofile\"]");


    public void profileIsDisplayed() {

        isPresent(txtProfile);
        isPresent(ProfilTittle);
        isPresent(ProfilPic);
        isPresent(ProfilUsername);
        isPresent(ProfilEmail);
        isPresent(ProfilEmailUser);
        isPresent(ProfilPhone);
        isPresent(ProfilPhoneUser);
        isPresent(EditProfilButton);
    }
    public void clickButtonBurger(){ clickOn(BurgerIcon);}
    public void clickButtonProfil(){ clickOn(ProfilIcon);}

}
