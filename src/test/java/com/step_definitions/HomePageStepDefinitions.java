package com.step_definitions;

import com.pages.HomePage;
import com.utils.ConfigurationReader;
import com.utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageStepDefinitions {

    HomePage homePage = new HomePage();
 WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @Given("User is on home page")
    public void user_is_on_home_page() throws InterruptedException {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().deleteAllCookies();
        Driver.getDriver().navigate().refresh();




    }


    @Then("User should be able to click on Browse by make button")
    public void user_should_be_able_to_click_on_browse_by_make_button() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(homePage.browseByMakeLink());
    }

    @Then("User should be able to click on Browse by Style button")
    public void user_should_be_able_to_click_on_browse_by_style_button() {

       Assert.assertTrue("" +
               "Test failed, Browse By Stile link is not displayed", homePage.browseByStyle());
    }

    @Then("User should be able to click on Advance Search  button")
    public void user_should_be_able_to_click_on_advance_search_button() {
        Assert.assertTrue("" +
                "Advanced search is not displayed!!!",homePage.advanceSearchIsDisplayed());

    }

    @Then("User should be able to click on Search  button")
    public void user_should_be_able_to_click_on_search_button() {

        Assert.assertTrue(homePage.searchButton());
    }


    @Then("User should be able to see Any Make dropdown")
    public void user_should_be_able_to_see_any_make_dropdown() {

        Assert.assertTrue(homePage.makeDropdown());
    }

    @Then("User should be able to see Any Model dropdown")
    public void user_should_be_able_to_see_any_model_dropdown() {
        Assert.assertTrue(homePage.modelDropdown());
    }


    @When("User clicks on Advanced Search button")
    public void user_clicks_on_advanced_search_button() {
      homePage.clickOnAdvancedSearchButton();
    }


    @Then("User should be able to see Title contains Search")
    public void user_should_be_able_to_see_title_contains_search() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Search"));
    }




}
