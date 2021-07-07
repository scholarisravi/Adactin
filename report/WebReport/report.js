$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Adactin.feature");
formatter.feature({
  "name": "To validate Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the login using valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Scholarisravi",
        "May2021"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the login using valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.step({
  "name": "user is in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.user_is_in_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid \"Scholarisravi\" and \"May2021\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select hotel details \"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoom Type\u003e\",\"\u003cNumber of Rooms\u003e\",\"\u003cAdults per Room\u003e\" and \"\u003cChildren per Room\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotels",
        "Room Type",
        "Number of Rooms",
        "Adults per Room",
        "Children per Room"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the search hotel page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.step({
  "name": "user select hotel details \"Sydney\",\"Hotel Creek\",\"Standard\",\"2 - Two\",\"2 - Two\" and \"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_select_hotel_details_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "fill the required details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to fill the details \"\u003cFirstname\u003e\",\"\u003cLastname\u003e\",\"\u003cBillingAddress\u003e\",\"\u003cCardno\u003e\",\"\u003cCardtype\u003e\",\"\u003cMonth\u003e\",\"\u003cYear\u003e\" and \"\u003cCvvNumber\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname",
        "BillingAddress",
        "Cardno",
        "Cardtype",
        "Month",
        "Year",
        "CvvNumber"
      ]
    },
    {
      "cells": [
        "Ravishankar",
        "Saravanan",
        "Chennai",
        "2242652566451234",
        "American Express",
        "January",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "fill the required details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.step({
  "name": "user has to fill the details \"Ravishankar\",\"Saravanan\",\"Chennai\",\"2242652566451234\",\"American Express\",\"January\",\"2022\" and \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_has_to_select_the(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});