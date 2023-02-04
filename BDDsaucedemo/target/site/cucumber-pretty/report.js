$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Checkout.feature");
formatter.feature({
  "line": 2,
  "name": "Checkout",
  "description": "as a user i want to checkout",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout"
    }
  ]
});
formatter.before({
  "duration": 5454934700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal Checkout",
  "description": "",
  "id": "checkout;normal-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on landing Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User choice 2 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click button Chart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User remove 1 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click Button Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User already on Checkout Page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User input \"Muhammad\" as firstName and input \"Bilal\" as lastName and input \"11530\" as zipCode",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click button Continue",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User see total \"Total: $8.63\" on Overview Page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User click button Finish",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.verifyLogin()"
});
formatter.result({
  "duration": 250239300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginStep.inputCredential(String,String)"
});
formatter.result({
  "duration": 366698700,
  "status": "passed"
});
formatter.match({
  "location": "purchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3081880700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "purchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 3149246500,
  "status": "passed"
});
formatter.match({
  "location": "purchaseSteps.choiceProduct()"
});
formatter.result({
  "duration": 3136876300,
  "status": "passed"
});
formatter.match({
  "location": "purchaseSteps.btnChart()"
});
formatter.result({
  "duration": 3093850200,
  "status": "passed"
});
formatter.match({
  "location": "purchaseSteps.removeProduct()"
});
formatter.result({
  "duration": 3079754100,
  "status": "passed"
});
formatter.match({
  "location": "purchaseSteps.btnCheckout()"
});
formatter.result({
  "duration": 3107148500,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCheckoutPage()"
});
formatter.result({
  "duration": 3046929200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Muhammad",
      "offset": 12
    },
    {
      "val": "Bilal",
      "offset": 46
    },
    {
      "val": "11530",
      "offset": 76
    }
  ],
  "location": "CheckoutSteps.inputForm(String,String,String)"
});
formatter.result({
  "duration": 3341865500,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.btnConti()"
});
formatter.result({
  "duration": 3116095200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Total: $8.63",
      "offset": 16
    }
  ],
  "location": "CheckoutSteps.verifyTotal(String)"
});
formatter.result({
  "duration": 56253800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.buttonFinish()"
});
formatter.result({
  "duration": 3083863600,
  "status": "passed"
});
formatter.after({
  "duration": 764825000,
  "status": "passed"
});
});