package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Base.driver,this);
    }
    @FindBy(id="input-firstname")
    public static WebElement firstName;

    @FindBy(id="input-lastname")
    public static WebElement lastName;

    @FindBy(id="input-email")
    public static WebElement email;

    @FindBy(id="input-telephone")
    public static WebElement telephone;

    @FindBy(id="input-password")
    public static WebElement password;

    @FindBy(id="input-confirm")
    public static WebElement confirmPassword;

    @FindBy(name="newsletter")
    public static WebElement radioButton;

    @FindBy(name = "agree")
    public static WebElement checkBox;

    @FindBy(xpath="//input[@type='submit']")
    public static WebElement submit;

    @FindBy(linkText = "Register")
    public static WebElement registerBreadcrumb;

    @FindBy(css= "input[id=input-firstname]+div")
    public static WebElement firstNameWarning;

    @FindBy(css= "input[id=input-lastname]+div")
    public static WebElement lastNameWarning;

    @FindBy(css= "input[id=input-email]+div")
    public static WebElement emailWarning;

    @FindBy(css= "input[id=input-telephone]+div")
    public static WebElement telephoneWarning;

    @FindBy(css="input[id=input-password]+div")
    public static WebElement passwordWarning;

    @FindBy(css="input[id=input-telephone]+div")
    public static WebElement mainWarning;

    @FindBy(xpath = "//*[@name='newsletter' and @value='1']")
    public static WebElement privacypolicy;
   public static void enterAllDetails(DataTable datatable){
       Map<String,String> map=datatable.asMap(String.class, String.class);
       Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
       Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
       Elements.TypeText(RegisterPage.email, System.currentTimeMillis()+map.get("Email"));
       Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
       Elements.TypeText(RegisterPage.password, map.get("Password"));
       Elements.TypeText(RegisterPage.confirmPassword,map.get("ConfirmPassword"));
   }
}
