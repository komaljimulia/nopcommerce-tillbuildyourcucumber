package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BuildYourOwnPage extends Utility {

    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath =  "//div[@class='overview']/div/child::h1" )
    WebElement buildYourPage;

   @FindBy(id = "product_attribute_1")
   WebElement dropDown1;

   @FindBy(id = "product_attribute_2")
   WebElement dropDown2;

   @FindBy(id = "product_attribute_3_7")
   WebElement radioButton1;

   @FindBy(id = "product_attribute_4_9")
   WebElement radioButton2;

   @FindBy(id = "product_attribute_5_12")
   WebElement radioButton3;

   @FindBy(xpath="//span[text()='$1,475.00']")
   WebElement totalAmt;

   @FindBy(id = "add-to-cart-button-1")
   WebElement clickAddCart;

   @FindBy(xpath="//p[text()='The product has been added to your ']" )
   WebElement topBarMsg;

    public String getBuildYourOwnText(){
        return getTextFromElement( buildYourPage );
    }
    public  void selectProcessorFromDropDownOne(String procesor){
        selectByVisibleTextFromDropDown( dropDown1,procesor );
        log.info("Clicking products from dropdown:" + dropDown1.toString());
    }
    public  void selectRamFromDropDownTwo(String ram){
        selectByVisibleTextFromDropDown(dropDown2,ram );
        log.info("Clicking products from dropdown2:" + dropDown2.toString());

    }
    public  void clickOnHDDRadioButton(){
        clickOnElement(radioButton1 );
        log.info("Clicking on radio button:" + radioButton1.toString());
    }
    public  void clickOSOnRadioButton(){
        clickOnElement( radioButton2 );
        log.info("Clicking on radio button2:" + radioButton2.toString());
    }
    public void clickOnSoftwareCheckBox(){
        clickOnElement( radioButton3 );
        log.info("Clicking on radio button3:" + radioButton3.toString());
    }
    public String getTotalAmt(){
        log.info("Clicking on total amount:" + totalAmt.toString());
        return getTextFromElement(totalAmt);

    }
    public void clickOnAddToCart(){
        clickOnElement( clickAddCart );
        log.info("Clicking on add to cart:" + clickAddCart.toString());
    }
    public String getTopBarMessage(){
       log.info("Clicking on top bar:" + topBarMsg.toString());
        return getTextFromElement( topBarMsg );
    }


}
