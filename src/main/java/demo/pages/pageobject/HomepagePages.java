package demo.pages.pageobject;

import org.openqa.selenium.By;

public class HomepagePages {

    public void isMyGroupIsDisplayed() {
        By element = By.xpath("//*[@id=\"__next\"]/div/h1");
    }

}
