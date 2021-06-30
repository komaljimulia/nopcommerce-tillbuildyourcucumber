package com.nopcommerce.Stepdefs;

import com.nopcommerce.pages.BuildYourOwnPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DeskTopPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuildStepdefs {
    @And("^I click on 'Computer tab'$")
    public void iClickOnComputerTab() throws InterruptedException {
        new ComputerPage().clickOnComputersTab();
    }

    @And("^I click on 'desktop'$")
    public void iClickOnDesktop() throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().clickOnDesktopOption();
    }

    @And("^I click on 'add to cart' button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep( 1000 );
        new DeskTopPage().clickOnAddToCart();
    }

    @When("^I see 'build your own' page$")
    public void iSeeBuildYourOwnPage() {
        Assert.assertEquals( "Build your own computer",new BuildYourOwnPage().getBuildYourOwnText() );

    }

    @And("^I select \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String processor)  {
        new BuildYourOwnPage().selectProcessorFromDropDownOne( processor );
    }

    @And("^I select \"([^\"]*)\" ram from dropdown list$")
    public void iSelectRamFromDropdownList(String ram)  {
        new BuildYourOwnPage().selectRamFromDropDownTwo( ram );
    }

    @And("^I select  '(\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\]' radio button$")
    public void iSelectGB$RadioButton(int arg0, int arg1, int arg2) {
        new BuildYourOwnPage().clickOnHDDRadioButton();
    }

    @And("^I select 'Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\]' radio button$")
    public void iSelectVistaPremium$RadioButton(int arg0, int arg1) {
        new BuildYourOwnPage().clickOSOnRadioButton();
    }

    @And("^I select two check boxes ' Microsoft Office \\[\\+\\$(\\d+)\\.(\\d+)\\]' and  'Total Commander \\[\\+\\$(\\d+)\\.(\\d+)\\]'$")
    public void iSelectTwoCheckBoxesMicrosoftOffice$AndTotalCommander$(int arg0, int arg1, int arg2, int arg3) {
        new BuildYourOwnPage().clickOnSoftwareCheckBox();
    }

    @And("^I verify price '\\$(\\d+),(\\d+)\\.(\\d+)'$")
    public void iVerifyPrice$(int arg0, int arg1, int arg2) {
        Assert.assertEquals( "$1,475.00" ,new BuildYourOwnPage().getTotalAmt());
    }

    @And("^I click  'Add to cart '$")
    public void iClickAddToCart() {
        new BuildYourOwnPage().clickOnAddToCart();
    }

    @Then("^I should see message on top green bar like 'The product has been added to your shopping cart' on Top green Bar'$")
    public void iShouldSeeMessageOnTopGreenBarLikeTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar() {
        Assert.assertEquals( "The product has been added to your shopping cart" ,new BuildYourOwnPage().getTopBarMessage());
    }
}
