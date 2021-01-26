package com.pages;

import com.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {



public HomePage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//button[@title='Browse by Make']")
private WebElement browseByMake;

public boolean browseByMakeLink(){

   return browseByMake.isDisplayed();
}

@FindBy(xpath = "//button[@title='Browse by Style']")
private WebElement browseByStyle;

public boolean browseByStyle(){
    return browseByStyle.isDisplayed();
}

@FindBy(linkText = "Advanced Search")
private WebElement advanceSearchButton;

public boolean advanceSearchIsDisplayed(){
    return advanceSearchButton.isDisplayed();
}

@FindBy(id = "search")
private WebElement searchButton;

public boolean searchButton(){
    return searchButton.isDisplayed();
}

@FindBy(id = "makeCode")
private WebElement anyMakeDropdown;

public boolean makeDropdown(){

    return anyMakeDropdown.isDisplayed();
}

@FindBy(id = "ModelCode")
private WebElement anyModelDropDown;

public boolean modelDropdown(){
    return anyModelDropDown.isDisplayed();
}

public void clickOnAdvancedSearchButton(){
    advanceSearchButton.click();
}
}
