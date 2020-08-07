package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.runner.BaseClass;
import Constants.SearchConstants;

public class HomePage extends BaseClass {

//Home page	
	public void verifyHomePage() {
		Assert.assertEquals("Superdry Summer Sale Now On - Mens & Womens Clothing - Superdry", driver.getTitle());
		action.clickOnElement(By.cssSelector(".cc-btn.cc-allow"));
	}

//Valid product
	public void searchForTheValidProducts(String search) {
		globalSearchWord = search;
		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
		action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, search);
		action.clickOnElement(SearchConstants.SEARCHBUTTON);

	}

//Invalid product
	public void searchForTheInvalidProducts(String search) {

		globalSearchWord = search;
		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
		action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, search);
		action.clickOnElement(SearchConstants.SEARCHBUTTON);
   }

// Auto fill
	public void searchWithAutoFill() {

		action.clickOnElement(SearchConstants.SEARCHTEXTBOX1);
	    action.updateTextBox(SearchConstants.SEARCHTEXTBOX2, "wom");
		for (int i = 0; i <= 3; i++) {

		driver.findElement(SearchConstants.SEARCHTEXTBOX2).sendKeys(Keys.ARROW_DOWN);

		}
		driver.findElement(SearchConstants.SEARCHTEXTBOX2).sendKeys(Keys.ENTER);

	}

}
