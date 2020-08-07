package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.runner.BaseClass;
import Constants.AddToBasketConstants;
import Constants.SearchConstants;

public class AddToBasketPage extends BaseClass{
	
	public void addProductsToTheBasket(){

		// Add first product to the basket 
		
		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
		action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, "jeans");
	    action.clickOnElement(SearchConstants.SEARCHBUTTON);
		Assert.assertEquals("Superdry jeans", driver.getTitle());
        action.clickOnElement(By.cssSelector("#product153543"));
		Assert.assertEquals("https://www.superdry.com/mens/jeans/details/153543/conor-taper-jeans--dark-blue", driver.getCurrentUrl());

		// select Size from Drop Down
		
		action.dropDown((AddToBasketConstants.SIZEDROPDOWN), 5);
		action.clickOnElement(AddToBasketConstants.ADDTOBASKETBUTTON);
		
		

		// Add second product to the basket
		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
		action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, "bags");
		action.clickOnElement(SearchConstants.SEARCHBUTTON);
		Assert.assertEquals("Superdry bags", driver.getTitle());
		action.clickOnElement(By.cssSelector("#product154691"));
		Assert.assertEquals("Superdry Nostalgia Backpack - Womens Sale - all sites - View all", driver.getTitle());
		action.clickOnElement(AddToBasketConstants.ADDTOBASKETBUTTON);
	    }
	
		// Click on Basket Button
		public void verfiyBasketButton() {
		    action.clickOnElement(AddToBasketConstants.BASKETBUTTON);

		}
		
		// Click on Checkout Button
		public void verifyCheckoutButton() {
			  action.clickOnElement(AddToBasketConstants.CHECKOUTBUTTON);
			  Assert.assertEquals("Log in - Superdry", driver.getTitle());
		}


}
