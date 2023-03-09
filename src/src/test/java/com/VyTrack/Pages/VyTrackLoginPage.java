package com.VyTrack.Pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


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



}

