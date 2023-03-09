package com.VyTrack.Pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


import java.util.*;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement header;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> options;


}
