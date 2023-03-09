package com.tryCloud.step_definitions;

import com.cydeo.utilities.Driver;
import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_Step_Definition {

    LoginPage loginPage=new LoginPage();


    @When("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("https://qa.trycloud.net/index.php/login");

    }
    @When("user enters the valid credentials {string} and {string}")
    public void user_enters_the_valid_credentials_and(String string, String string2) throws InterruptedException {

        loginPage.userNameOreMailBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {

        loginPage.loginButton.click();
        //System.out.println("you are on dashboard");

    }
    @Then("user should see on the dashboard")
    public void user_should_see_on_the_dashboard() throws InterruptedException {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
        Thread.sleep(5000);
        Driver.closeDriver();
    }

    @Then("User can log out and ends up in login page")
    public void userCanLogOutAndEndsUpInLoginPage() throws InterruptedException {

        loginPage.userNameOreMailBox.sendKeys("");
        loginPage.passwordBox.sendKeys("");
        loginPage.loginButton.click();
        Thread.sleep(2000);
            loginPage.logOutButton1.click();
            loginPage.logOutButton2.click();


    }

    @And("User can not go to home page again by clicking step back button after successfully logged out")
    public void user_Can_NotGo_To_Home_Page_Again_By_Clicking_StepBackButton_AfterSuccessfully_LoggedOut() throws InterruptedException {
        Driver.getDriver().navigate().back();
        // clean step can be added to for remove the user and password
        Thread.sleep(3000);
        Driver.getDriver().navigate().forward();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));


    }
}
