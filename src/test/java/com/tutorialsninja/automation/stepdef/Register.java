package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.Map;

import static com.tutorialsninja.automation.pages.HeaderSection.*;

public class Register {

    HeaderSection headerSection=new HeaderSection();
    RegisterPage registerPage=new RegisterPage();
    AccountSuccessPage accountSuccessPage=new AccountSuccessPage();
    @Given("^Launch the application$")
    public void launch_the_application()  {
        Base.driver.get(Base.reader.getUrl());
    }

    @Given("^Navigate to the account registration$")
    public void navigate_to_the_account_registration()  {
        Elements.click(myAccountLink);
        Elements.click(register);
    }

    @When("^User enter all the below valid details$")
    public void user_enter_all_the_below_valid_details(DataTable datatable)  {

       RegisterPage.enterAllDetails(datatable);


    }

    @When("^Select the privacy policy$")
    public void select_the_privacy_policy()  {

        Elements.click(RegisterPage.checkBox);
    }

    @When("^Click on the continue button$")
    public void click_on_the_continue_button()  {
        Elements.click(RegisterPage.submit);

    }

    @Then("^User should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()  {
     Elements.isDisplayed(AccountSuccessPage.successBreadcrumb);
    }

    @Then("^User account should not be created$")
    public void user_account_should_not_be_created() {

    }

    @Then("^Error message should display to the user to fill mandatory fields$")
    public void error_message_should_display_to_the_user_to_fill_mandatory_fields()  {

        Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarning));
    }

    @When("^Subscribe to the Newsletter$")
    public void subscribe_to_the_Newsletter() {
        Elements.click(RegisterPage.privacypolicy);
    }

}
