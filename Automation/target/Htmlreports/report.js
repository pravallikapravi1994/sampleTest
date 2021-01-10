$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Google search testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if valid google search is working",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GoogleTest"
    }
  ]
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "User is in on google search page",
  "keyword": "And "
});
formatter.step({
  "name": "User Enters \u003cSearch\u003e content",
  "keyword": "When "
});
formatter.step({
  "name": "Hits Enter",
  "keyword": "And "
});
formatter.step({
  "name": "User shoud be navigated to  Search results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search"
      ]
    },
    {
      "cells": [
        "Testing Automation"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if valid google search is working",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GoogleTest"
    }
  ]
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in on google search page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_is_in_on_google_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Testing Automation content",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_Enters_Testing_Automation_content()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hits Enter",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.hits_Enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User shoud be navigated to  Search results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_shoud_be_navigated_to_Search_results()"
});
formatter.result({
  "status": "passed"
});
});