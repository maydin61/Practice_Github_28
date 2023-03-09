package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Driver_Eng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {


    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='pull-left']//h1")
    public WebElement header;


    @FindBy(xpath = "//div[@class='pull-left']//h1")
    public List<WebElement> options;



}
