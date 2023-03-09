package com.VyTrack.step_definitions;

import com.VyTrack.Pages.DashboardPage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashboardTest {


    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Then("user should see menu options")
    public void user_should_see_menu_options(List<String> expectedOptions) throws InterruptedException {
        Thread.sleep(3000);
        List<String> actualOptions = new ArrayList<>();
        for (WebElement menu : dashboardPage.options) {
            actualOptions.add(menu.getText());
        }
        Assert.assertEquals(expectedOptions, actualOptions);

    }

    @When("user enters as different {string}")
    public void user_enters_as_different(String role) {
        String username = "";
        String password = "";
        switch (role) {
            case "user":
                username = ConfigurationReader.getProperty("driver_username");
                password = ConfigurationReader.getProperty("driver_password");
                break;

            case "sales manager":
                username = ConfigurationReader.getProperty("sales_manager_username");
                password = ConfigurationReader.getProperty("sales_manager_password");
                break;

            case "store manager":
                username = ConfigurationReader.getProperty("store_manager_username");
                password = ConfigurationReader.getProperty("store_manager_password");
                break;
        }

        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.submitBtn.click();
    }

}
