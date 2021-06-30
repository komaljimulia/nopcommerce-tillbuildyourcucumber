package com.nopcommerce.Stepdefs;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DeskTopPage;
import com.nopcommerce.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeskTopStepdefs {
    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() throws InterruptedException {
       new ComputerPage().clickOnComputersTab();
    }

    @And("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktopOption();
    }

    @And("^I select from sort by \"([^\"]*)\"$")
    public void iSelectFromSortBy(String dropdown) throws InterruptedException {
        Thread.sleep(2000);
        new DeskTopPage().selectFromDropdown(dropdown);
    }
    @Then("^I should see products arranged in reverse alphabetical order$")
    public void iShouldSeeProductsArrangedInReverseAlphabeticalOrder() {
        new ComputerPage().verifyproductsSortByGivenOrder();

    }
}
