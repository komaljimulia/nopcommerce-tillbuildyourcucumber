package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DeskTopPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDesktop;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectAToZ;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addTocart;


    public void clickOnDesktopOption() throws InterruptedException {
        Thread.sleep( 3000 );
        clickOnElement(clickOnDesktop);
        log.info("Clicking on Desktop:" + clickOnDesktop.toString());
    }
    public void selectFromDropdown(String sortBy) {
        selectByVisibleTextFromDropDown( selectAToZ, sortBy );
        log.info("Clicking on Products from dropdown:" + selectAToZ.toString());
    }
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep( 2000 );
        clickOnElement( addTocart );
        log.info("Clicking on Add to cart:" + addTocart.toString());
    }
}
