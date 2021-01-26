package com.pages;

import com.utils.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public  abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }



}
