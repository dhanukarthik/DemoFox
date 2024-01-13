package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {

    @Given("^Launch the application$")
    public void launch_the_application()  {
        Base.driver.get(Base.reader.getUrl());
    }

    @Given("^Navigate to the account registration$")
    public void navigate_to_the_account_registration()  {

    }

    @When("^User enter all the below valid details$")
    public void user_enter_all_the_below_valid_details(DataTable datatable)  {

    }

    @When("^Select the privacy policy$")
    public void select_the_privacy_policy()  {

    }

    @When("^Click on the continue button$")
    public void click_on_the_continue_button()  {

    }

    @Then("^User should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()  {

    }

}
