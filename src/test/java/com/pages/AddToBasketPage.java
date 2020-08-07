package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

import Constants.AddToBasketConstants;
import Constants.SearchConstants;

public class AddToBasketPage extends BaseClass{
	
	public void addProductsToTheBasket(){

		// Add first product to the basket 
		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
		/* driver.findElement(SEARCHTEXTBOX2).clear();
		 * driver.findElement(SEARCHTEXTBOX2).sendKeys("jeans");*/
		action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, "jeans");
		
        action.clickOnElement(SearchConstants.SEARCHBUTTON);
		Assert.assertEquals("Superdry jeans", driver.getTitle());
		

		// Sort By Drop Down
		explicitWait.visibilityOfElementClick(AddToBasketConstants.FILTERDROPDOWN, 3);
		driver.findElements(By.cssSelector("li[data-original-index='2']")).get(1).click();

		explicitWait.visibilityOfElementClick(By.cssSelector("#product153543"),5);
		Assert.assertEquals("Mens - Conor Taper Jeans in Byrom Dark Blue | Superdry", driver.getTitle());

		// select Size from Drop Down
		Select sizeDropDown = new Select(driver.findElement(AddToBasketConstants.SIZEDROPDOWN));
		sizeDropDown.selectByIndex(5);
		action.clickOnElement(AddToBasketConstants.ADDTOBASKETBUTTON);
		
		

		// Add second product to the basket
		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
		action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, "bags");
		action.clickOnElement(SearchConstants.SEARCHBUTTON);
		Assert.assertEquals("Superdry bags", driver.getTitle());
		
		explicitWait.visibilityOfElementClick(By.cssSelector("#product154691"),5);
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
