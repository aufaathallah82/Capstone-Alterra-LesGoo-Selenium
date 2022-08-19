package demo.pages.pageobject;
import demo.pages.BasePageObject;
import org.openqa.selenium.By;
public class EditProfilePages extends BasePageObject {
    By EditButton = By.xpath("//*[@id=\"btn-editprofile\"]");
    By EditPofileTxt = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]");
    By EditPic = By.xpath("//*[@id=\"edit-image\"]/path[1]");
    By UsernameField = By.id("edit-username");
    By EmailField = By.id("edit-email");
    By PhoneField = By.id("edit-phone");
    By BtnSave = By.id("btn-savehanges");
    By BtnDelete = By.id("btn-delacc");

    public void EditProfilisDisplayed(){
        isPresent(EditPofileTxt);
        isPresent(EditPic);
        isPresent(UsernameField);
        isPresent(EmailField);
        isPresent(PhoneField);
        isPresent(BtnDelete);
        isPresent(BtnSave);
    }
    public void clickEditBtn() { clickOn(EditButton);}
    public void inputUsernameField(String username){ typeOn(UsernameField,username);}
    public void inputEmailField(String Email){ typeOn(EmailField,Email);}
    public void inputPhoneField(String Phone){ typeOn(PhoneField,Phone);}
    public void SaveChangesBtn(){clickOn(BtnSave);}
    public void DeleteBtn(){clickOn(BtnDelete);}

    public void DeleteUsernameField(){ClearField(UsernameField);}
    public void DeleteEmailField(){ClearField(EmailField);}
    public void DeletepHONEfIELD(){ClearField(PhoneField);}

}
