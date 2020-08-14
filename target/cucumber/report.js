$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality Validation",
  "description": "",
  "id": "search-functionality-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search and Validate",
  "description": "",
  "id": "search-functionality-validation;search-and-validate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Green Cart Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User searched for Cucumber vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_green_cart_landing_page()"
});
formatter.result({
  "duration": 11889831000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 18
    }
  ],
  "location": "MyStepDefinitions.user_searched_for_vegetable(String)"
});
formatter.result({
  "duration": 2365806000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "MyStepDefinitions.something_results_are_displayed(String)"
});
formatter.result({
  "duration": 38775000,
  "status": "passed"
});
formatter.after({
  "duration": 109646700,
  "status": "passed"
});
});