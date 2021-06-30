package com.nopcommerce.Stepdefs;

import com.nopcommerce.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuStepdefs {
    @Given("^I m on Homepage$")
    public void iMOnHomepage() {
    }

    @When("^I click on any tabs \"([^\"]*)\" from all tabs$")
    public void iClickOnAnyTabsFromAllTabs(String menu) {
        new HomePage().selectMenu(menu);

    }

    @Then("^I should navigate to selected tabs$")
    public void iShouldNavigateToSelectedTabs() {
        Assert.assertEquals( "Computers",new HomePage().verifyTopMenuTabText() );
    }
}
