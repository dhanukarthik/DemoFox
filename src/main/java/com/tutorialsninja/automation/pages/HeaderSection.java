package com.tutorialsninja.automation.pages;

import com.gargoylesoftware.htmlunit.Page;
import com.tutorialsninja.automation.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {

    public  HeaderSection(){
        PageFactory.initElements(Base.driver, this);
    }
    @FindBy(xpath = "//span[text()='My Account']")
    public static WebElement myAccountLink;

    @FindBy(xpath = "//a[text()='Register']")
    public static WebElement register;


}
