package com.tryCloud.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public  LoginPage(){
        //create constructor
        // initialize the driver instance and this class' instance using PageFactory.initElements


        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//input[@id='user']")
    public WebElement userNameOreMailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "(//img)[3]")
    public WebElement eyeIcon;

    @FindBy(xpath = "//a[@id]")
    public WebElement forgotPassword;

    @FindBy(xpath = "(//a)[3]")
    public WebElement forgotPassWord;

    @FindBy(xpath = "(//a)[4]")
    public WebElement A_entity_Name;

    @FindBy(xpath = "//p[@class='info']/a")
    public WebElement P_Info;

    @FindBy(xpath = "//div[@class='logo']")
    public WebElement page_Logo;

    @FindBy(css = "input[id='password']")
    public WebElement passwordHolder;

    @FindBy(xpath = "//span[@title='Employee75']")
    public WebElement userNameOnMainBoard;

    @FindBy (xpath = "(//p)[3]")
    public WebElement wrongUsernameOrPasswordMassage;

    @FindBy(xpath = "(//a[@href])[29]")
    public WebElement logOutButton2;

    @FindBy(xpath = "(//img)[2]")
    public WebElement logOutButton1;

    @FindBy(xpath = "(//input[@type])[12]")
    public WebElement togglePasswordLength;

    @FindBy(xpath = "(//*[@placeholder])[1]")
    public WebElement placeHolder_UsernameEmail;

    @FindBy(xpath = "(//*[@placeholder])[2]")
    public WebElement placeHolder_Password;

}
