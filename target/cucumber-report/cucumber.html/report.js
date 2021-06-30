$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/buildyourownpage.feature");
formatter.feature({
  "line": 1,
  "name": "BuildYourOwn test",
  "description": "As a user user i want to build my own computer",
  "id": "buildyourown-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7684663300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to Build your Own Computer Page successfully",
  "description": "",
  "id": "buildyourown-test;user-should-navigate-to-build-your-own-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I m on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \u0027Computer tab\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on \u0027desktop\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select from sort by \"Name: A to Z\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on \u0027add to cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see \u0027build your own\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"2.2 GHz Intel Pentium Dual-Core E2200\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \"8GB [+$60.00]\" ram from dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select  \u0027400 GB [+$100.00]\u0027 radio button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select \u0027Vista Premium [+$60.00]\u0027 radio button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select two check boxes \u0027 Microsoft Office [+$50.00]\u0027 and  \u0027Total Commander [+$5.00]\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify price \u0027$1,475.00\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click  \u0027Add to cart \u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see message on top green bar like \u0027The product has been added to your shopping cart\u0027 on Top green Bar\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepdefs.iMOnHomepage()"
});
formatter.result({
  "duration": 169844400,
  "status": "passed"
});
formatter.match({
  "location": "BuildStepdefs.iClickOnComputerTab()"
});
formatter.result({
  "duration": 1453837200,
  "status": "passed"
});
formatter.match({
  "location": "BuildStepdefs.iClickOnDesktop()"
});
formatter.result({
  "duration": 3379797100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: A to Z",
      "offset": 23
    }
  ],
  "location": "DeskTopStepdefs.iSelectFromSortBy(String)"
});
formatter.result({
  "duration": 2225873000,
  "status": "passed"
});
formatter.match({
  "location": "BuildStepdefs.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 3139458700,
  "status": "passed"
});
formatter.match({
  "location": "BuildStepdefs.iSeeBuildYourOwnPage()"
});
formatter.result({
  "duration": 2643028000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.2 GHz Intel Pentium Dual-Core E2200",
      "offset": 10
    }
  ],
  "location": "BuildStepdefs.iSelectFromDropdown(String)"
});
formatter.result({
  "duration": 194020700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8GB [+$60.00]",
      "offset": 10
    }
  ],
  "location": "BuildStepdefs.iSelectRamFromDropdownList(String)"
});
formatter.result({
  "duration": 176535600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 11
    },
    {
      "val": "100",
      "offset": 21
    },
    {
      "val": "00",
      "offset": 25
    }
  ],
  "location": "BuildStepdefs.iSelectGB$RadioButton(int,int,int)"
});
formatter.result({
  "duration": 107832500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60",
      "offset": 27
    },
    {
      "val": "00",
      "offset": 30
    }
  ],
  "location": "BuildStepdefs.iSelectVistaPremium$RadioButton(int,int)"
});
formatter.result({
  "duration": 103780000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 47
    },
    {
      "val": "00",
      "offset": 50
    },
    {
      "val": "5",
      "offset": 80
    },
    {
      "val": "00",
      "offset": 82
    }
  ],
  "location": "BuildStepdefs.iSelectTwoCheckBoxesMicrosoftOffice$AndTotalCommander$(int,int,int,int)"
});
formatter.result({
  "duration": 113770400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    },
    {
      "val": "475",
      "offset": 19
    },
    {
      "val": "00",
      "offset": 23
    }
  ],
  "location": "BuildStepdefs.iVerifyPrice$(int,int,int)"
});
formatter.result({
  "duration": 812018400,
  "status": "passed"
});
formatter.match({
  "location": "BuildStepdefs.iClickAddToCart()"
});
formatter.result({
  "duration": 106295300,
  "status": "passed"
});
formatter.match({
  "location": "BuildStepdefs.iShouldSeeMessageOnTopGreenBarLikeTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar()"
});
formatter.result({
  "duration": 337794800,
  "status": "passed"
});
formatter.after({
  "duration": 1243369800,
  "status": "passed"
});
});