package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;
import Constants.CheckoutPageConstants;

public class CheckoutPage extends BaseClass {
	
	 // Click on Guest Customer
	   public void verifyGuestCustomer(){
		action.clickOnElement(CheckoutPageConstants.GUESTCUSTOMERBUTTON);
		Assert.assertEquals("https://www.superdry.com/checkout", driver.getCurrentUrl());
	}

	 // Checkout page details
	   public void verifyCheckoutDetails() {
		 
		 //Delivery address
		 action.clickOnElement(CheckoutPageConstants.NEXTDAYDELIVERY);
		 
		/* driver.findElement(By.cssSelector("#shipping_first_name")).clear();
		 driver.findElement(By.cssSelector("#shipping_first_name")).sendKeys("samragi");
		 driver.findElement(By.cssSelector("#shipping_last_name")).clear();
		 driver.findElement(By.cssSelector("#shipping_last_name")).sendKeys("singh");
		 driver.findElement(By.cssSelector("#billing_phone")).clear();
		 driver.findElement(By.cssSelector("#billing_phone")).sendKeys("07365389266");
		 driver.findElement(By.cssSelector("#billing_email")).clear();
		 driver.findElement(By.cssSelector("#billing_email")).sendKeys("samragishaktawat@gmail.com");
		 driver.findElement(By.cssSelector("#billing_confirmemail")).clear();
		 driver.findElement(By.cssSelector("#billing_confirmemail")).sendKeys("samragishaktawat@gmail.com");
		 driver.findElement(By.cssSelector("#shipping-address-search")).clear();
		 driver.findElement(By.cssSelector("#shipping-address-search")).sendKeys("CR26PZ");
		 driver.findElement(By.cssSelector(".pcadescription")).click();
		 Thread.sleep(4000);
		 driver.findElements(By.cssSelector(".pcadescription")).get(3).click();
		 */
		    
		 
		 action.updateTextBox(CheckoutPageConstants.FIRSTNAME,"samragi");
		 action.updateTextBox(CheckoutPageConstants.LASTNAME,"singh");
		 action.updateTextBox(CheckoutPageConstants.PHONENUMBER,"07365389266");
		 action.updateTextBox(CheckoutPageConstants.EMAILID,"samragishaktawat@gmail.com");
		 action.updateTextBox(CheckoutPageConstants.COMFIRMEMAIL,"samragishaktawat@gmail.com");
		 action.updateTextBox(CheckoutPageConstants.POSTCODE,"CR26PZ");
		 action.clickOnElement(CheckoutPageConstants.AUTOADDRESS);
		 driver.findElements(By.cssSelector(".pcadescription")).get(3).click();
		  
		 
		 //Payment details (dummy details)
		 
		  action.updateTextBox(CheckoutPageConstants.NAMEONCARD, "Sam");
		  action.updateTextBox(CheckoutPageConstants.CARDNUMBER, "3456276512348765");
		 
		  Select MonthDropdown=new Select(driver.findElement(CheckoutPageConstants.MONTHDROPDOWN));
		  MonthDropdown.selectByValue("06");
			 
		  Select YearDropdown=new Select(driver.findElement(CheckoutPageConstants.YEARDROPDOWN));
		  YearDropdown.selectByValue("2025" );
		  
		  action.updateTextBox(CheckoutPageConstants.CVV, "376");
	   }
	  
	 // Click on buy now
	   public void verifyBuyNowButton() {
		   
		   action.clickOnElement(CheckoutPageConstants.BUYNOWBUTTON);
	   }
	   
	   
}
