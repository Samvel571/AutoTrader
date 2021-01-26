package com.pages;

import com.utils.Driver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AdvancedSearchPage {

    public AdvancedSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
    Select select;

@FindBy(xpath = "//input[@name='zip']")
    private WebElement zipCodeBox;

public void enterValueInZipCode(String zip) {
    wait.until(ExpectedConditions.visibilityOf(zipCodeBox));
    zipCodeBox.clear();
    zipCodeBox.sendKeys(zip);
}

@FindBy(xpath = "(//div[@class='input-label'])[3]")
private WebElement certifiedCheckbox;

public void clickOnCertifiedCheckBox(){
    certifiedCheckbox.click();
}

@FindBy(xpath = "//div[.='Convertible']")
    private WebElement convertCheckBox;
public void clickOnConvertCheckBox(){
    convertCheckBox.click();
}

@FindBy(id = "4101482096")
    private WebElement fromYearDropdown;
    public void selectYearFromDropdown(String year){
        select = new Select(fromYearDropdown);
        select.selectByVisibleText(year);

    }

@FindBy(id = "258002540")
    private WebElement toYearDropdown;
    public void selectYearToDropdown(String year){
        select = new Select(toYearDropdown);
        select.selectByVisibleText(year);
    }


    @FindBy(id = "1970425032")
    private WebElement makeDropdown;
    public void selectFromMakeDropdown(String make){
        select = new Select(makeDropdown);
        select.selectByVisibleText(make);
    }

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;
    public void clickOnSearchButton(){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",searchButton);
        searchButton.click();

    }

    @FindBy(xpath = "//h2[@data-cmp='subheading']")
    private List<WebElement> allCarLinks;

    public List<String> getAllLinksText(){
      List<String> allLinksTextList = new ArrayList<>();
        for(WebElement each : allCarLinks){
            allLinksTextList.add(each.getText());
        }
        return allLinksTextList;
    }





}
