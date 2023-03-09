package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {



     public VyTrackLoginPage() {
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id = "prependedInput")
        public WebElement userNameInput;

        @FindBy(id = "prependedInput2")
        public WebElement passwordInput;

        @FindBy(id = "_submit")
        public WebElement submitBtn;

        @FindBy(xpath = "//div[@class=\"alert alert-error\"]/div")
        public WebElement msg;

    public void Login_vYTrack(String username, String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitBtn.click();

    }
}
