package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like( List<String> fruits) {

        System.out.println(fruits);
                                            // print all the fruits
        System.out.println(fruits.get(1));
                                          // prints the 2 element in the list
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        // This method will return as the List of String of given dropdowns options
        List<String> actualMonths= BrowserUtils.dropDownOptionsAsString(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths,actualMonths);

        // System.out.println("expectedMonths = " + expectedMonths);

//       Select select=new Select(dropdownsPage.monthDropdown);
//
//       //List of all ACTUAL month <option> as a web element
//       List<WebElement> actualOptionalWebElements= select.getOptions();
//
//       // List of All ACTUAL month <option> as a String
//       List<String> actualOptionsAsString =new ArrayList<>();
//
//        for (WebElement each : actualOptionalWebElements) {
//            actualOptionsAsString.add(each.getText());
//
//        }


        //This method will return us the List of String of given dropdowns options
        //    List<String> actualMonths = BrowserUtils.(dropdownsPage.monthDropdown);

       //     Assert.assertEquals(expectedMonths, actualMonths);
        // Assert will check the size of the lists first. If it is matching it will check content 1 by 1.

    }
}
