$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenarios",
  "description": "",
  "id": "registration-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4823800700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify whether the user is able to register into application",
  "description": "",
  "id": "registration-functionality-scenarios;verify-whether-the-user-is-able-to-register-into-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    },
    {
      "line": 3,
      "name": "@One"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to the account registration",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Dhanalakshmi"
      ],
      "line": 8
    },
    {
      "cells": [
        "LastName",
        "C N"
      ],
      "line": 9
    },
    {
      "cells": [
        "Email",
        "test123@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Telephone",
        "123456789"
      ],
      "line": 11
    },
    {
      "cells": [
        "Password",
        "test@1234"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select the privacy policy",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.launch_the_application()"
});
formatter.result({
  "duration": 2002898400,
  "status": "passed"
});
formatter.match({
  "location": "Register.navigate_to_the_account_registration()"
});
formatter.result({
  "duration": 46700,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_enter_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "duration": 1723100,
  "status": "passed"
});
formatter.match({
  "location": "Register.select_the_privacy_policy()"
});
formatter.result({
  "duration": 23500,
  "status": "passed"
});
formatter.match({
  "location": "Register.click_on_the_continue_button()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
formatter.after({
  "duration": 747200,
  "status": "passed"
});
});