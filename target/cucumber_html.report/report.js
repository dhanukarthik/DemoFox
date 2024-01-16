$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenarios",
  "description": "",
  "id": "registration-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4265876000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 27,
  "name": "Verify whether the user is able to register with out selecting privacy and policy",
  "description": "",
  "id": "registration-functionality-scenarios;verify-whether-the-user-is-able-to-register-with-out-selecting-privacy-and-policy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Register"
    },
    {
      "line": 26,
      "name": "@Three"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Navigate to the account registration",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enter all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Dhanalakshmi"
      ],
      "line": 31
    },
    {
      "cells": [
        "LastName",
        "C N"
      ],
      "line": 32
    },
    {
      "cells": [
        "Email",
        "test8431@gmail.com"
      ],
      "line": 33
    },
    {
      "cells": [
        "Telephone",
        "123456789"
      ],
      "line": 34
    },
    {
      "cells": [
        "Password",
        "test@1234"
      ],
      "line": 35
    },
    {
      "cells": [
        "ConfirmPassword",
        "test@1234"
      ],
      "line": 36
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Select the privacy policy",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Subscribe to the Newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.launch_the_application()"
});
formatter.result({
  "duration": 1819288400,
  "status": "passed"
});
formatter.match({
  "location": "Register.navigate_to_the_account_registration()"
});
formatter.result({
  "duration": 972578800,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_enter_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "duration": 818787800,
  "status": "passed"
});
formatter.match({
  "location": "Register.select_the_privacy_policy()"
});
formatter.result({
  "duration": 158658400,
  "status": "passed"
});
formatter.match({
  "location": "Register.subscribe_to_the_Newsletter()"
});
formatter.result({
  "duration": 145556300,
  "status": "passed"
});
formatter.match({
  "location": "Register.click_on_the_continue_button()"
});
formatter.result({
  "duration": 685622500,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "duration": 72907500,
  "status": "passed"
});
formatter.after({
  "duration": 1032100,
  "status": "passed"
});
});