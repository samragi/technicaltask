package com.pages;

import java.util.Map;

import org.junit.Assert;
import com.runner.BaseClass;
import Constants.CheckoutPageConstants;
import cucumber.api.DataTable;

public class CheckoutPage extends BaseClass {
	
	 // Click on Guest Customer
	   public void verifyGuestCustomer(){
		action.clickOnElement(CheckoutPageConstants.GUESTCUSTOMERBUTTON);
		Assert.assertEquals("https://www.superdry.com/checkout", driver.getCurrentUrl());
	}
	   
		 
          public void verifyCheckoutDetails(DataTable checkoutDetails) throws InterruptedException {

				Map<String, String> userCheckoutDetails = checkoutDetails.asMap(String.class, String.class);
				
				String userfirstname =userCheckoutDetails.get("firstname");
				String userlastname =userCheckoutDetails.get("lastname");
				String userphonemunber =userCheckoutDetails.get("phonemunber");
                String useremail =userCheckoutDetails.get("email");
                String userconfirmemail =userCheckoutDetails.get("confirmemail");
                String userpostcode =userCheckoutDetails.get("postcode");

                action.updateTextBox(CheckoutPageConstants.FIRSTNAME,userfirstname);
                action.updateTextBox(CheckoutPageConstants.LASTNAME, userlastname);
                action.updateTextBox(CheckoutPageConstants.PHONENUMBER,userphonemunber);
       		    action.updateTextBox(CheckoutPageConstants.EMAILID,useremail);
       		    action.updateTextBox(CheckoutPageConstants.COMFIRMEMAIL,userconfirmemail);
       		    action.updateTextBox(CheckoutPageConstants.POSTCODE,userpostcode);
       		    
       		    action.clickOnElement(CheckoutPageConstants.AUTOADDRESS);
       		    action.clickOnElement(CheckoutPageConstants.ADDRESSSELECTED);
       		    
    
		 
		 //Payment details (dummy details)
		  action.updateTextBox(CheckoutPageConstants.NAMEONCARD, "Sam");
		  action.updateTextBox(CheckoutPageConstants.CARDNUMBER, "3456276512348765");
		 
		  action.dropDown((CheckoutPageConstants.MONTHDROPDOWN), 5);
		  action.dropDown((CheckoutPageConstants.YEARDROPDOWN),4);
		  action.updateTextBox(CheckoutPageConstants.CVV, "376");
	   }
	  
	 // Click on buy now
	   public void verifyBuyNowButton() {
		   
		   action.clickOnElement(CheckoutPageConstants.BUYNOWBUTTON);
	   }
	   
	   
}
