package com.tryCloud.utilities;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WebDriver {
    public org.openqa.selenium.WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void tearDown(){
        driver.close();
    }
}
