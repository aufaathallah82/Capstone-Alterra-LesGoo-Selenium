package demo.pages.pageobject;
import demo.pages.BasePageObject;
import org.openqa.selenium.By;

public class EditProfilePages extends BasePageObject {

    By txtEditProfile = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");
    By btnBackEditProfile = By.id("back-to-home");
    By imgUserEdit = By.id("edit-profileimg");
    By usernameField = By.id("edit-username");
    By emailField = By.id("edit-email");
    By phoneField = By.id("edit-phone");
    By btnSave = By.id("btn-savehanges");
    By btnDelete = By.id("btn-delacc");
    By btnOkPopUp = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    By btnOkDeleteAccount = By.xpath("/html/body/div[2]/div/div[6]/button[1]");

    public void editProfileIsDisplayed() {
        isPresent(txtEditProfile);
        isPresent(btnBackEditProfile);
        isPresent(imgUserEdit);
        isPresent(usernameField);
        isPresent(emailField);
        isPresent(phoneField);
        isPresent(btnSave);
        isPresent(btnDelete);
    }

    public void inputUsernameField(String username) {
        typeOn(usernameField, username);
    }

    public void inputEmailField(String email) {
        typeOn(emailField, email);
    }

    public void inputPhoneField(String phone){
        typeOn(phoneField, phone);
    }

    public void inputProfileImage(){
        typeOn(imgUserEdit,"/home/dhandyjoe/Pictures/background/coding6.png");
    }

    public void SaveChangesBtn(){
        clickOn(btnSave);
    }

    public void DeleteBtn(){
        clickOn(btnDelete);
    }

    public void clearUsernameField(){
        clearField(usernameField);
    }

    public void clearEmailField(){
        clearField(emailField);
    }

    public void clearPhoneField(){
        clearField(phoneField);
    }

    public void clickBtnOkPopUp(){
        clickOn(btnOkPopUp);
    }

    public void btnBtnBackEditProfile() {
        clickOn(btnBackEditProfile);
    }

    public void btnBtnOkDeleteAccount() {
        clickOn(btnOkDeleteAccount);
    }
}
