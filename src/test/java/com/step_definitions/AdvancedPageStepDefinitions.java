package com.step_definitions;

import com.pages.AdvancedSearchPage;
import com.utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AdvancedPageStepDefinitions {



    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);


    @When("User enters {string} in zipcode text box")
    public void userEntersInZipcodeTextBox(String arg0) {
        advancedSearchPage.enterValueInZipCode(arg0);
    }


    @When("User selects Certified Check box under Condition")
    public void user_selects_certified_check_box_under_condition() {
       advancedSearchPage.clickOnCertifiedCheckBox();
    }
    @When("User selects convertible check box under style")
    public void user_selects_convertible_check_box_under_style() {
     advancedSearchPage.clickOnConvertCheckBox();

    }
    @And("User selects from Year from dropdown menu From {string}")
    public void userSelectsFromYearFromDropdownMenuFrom(String value) {
        advancedSearchPage.selectYearFromDropdown(value);

    }
    @And("User selects from Year to dropdown menu To {string}")
    public void userSelectsFromYearToDropdownMenuTo(String value) {
    advancedSearchPage.selectYearToDropdown(value);
    }

    @When("User selects make as BMW from Make,Model and Trim section")
    public void user_selects_make_as_bmw_from_make_model_and_trim_section() {
    advancedSearchPage.selectFromMakeDropdown("BMW");
    }
    @When("User click on the search button")
    public void user_click_on_the_search_button() {
        advancedSearchPage.clickOnSearchButton();
    }
    @Then("User should be able to see only BMW cars on the page")
    public void user_should_be_able_to_see_only_bmw_cars_on_the_page() {
        List<String> allLinksText = advancedSearchPage.getAllLinksText();

        for(String each : allLinksText){
            Assert.assertTrue(each.contains("BMW"));
            System.out.println(each);
        }
    }



}
