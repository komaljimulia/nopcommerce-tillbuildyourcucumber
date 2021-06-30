package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());

    HomePage homepage = new HomePage();


    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]" )
    WebElement clickOnDesktop;


    public void clickOnComputersTab() throws InterruptedException {
         homepage.selectMenu( "Computers" );
    }


    public void clickOnDesktopOption() {

        clickOnElement( clickOnDesktop );
        log.info("Clicking on Desktop options:" + clickOnDesktop.toString());
    }
    public void verifyproductsSortByGivenOrder() {
        List<WebElement> deskTopList = driver.findElements( By.xpath( "//div[@class='item-grid']/div/div/div[2]/child::h2" ) );  //verifying sort by products are in 'z to a'
        List<String> productName = new ArrayList<>();
        for (WebElement deskTop : deskTopList) {
            productName.add( deskTop.getText() );
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll( productName );

        Collections.sort( tempList, Collections.reverseOrder() );//reverseOrder()
        Collections.sort( productName, Collections.reverseOrder() );
        System.out.println( productName );
        System.out.println( tempList );
        Assert.assertEquals( productName, tempList );

    }


}
