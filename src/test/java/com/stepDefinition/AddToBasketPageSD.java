package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddToBasketPageSD extends BaseClass{
	
	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
	    homePage.verifyHomePage();
	}

	@When("^I add products to the basket$")
	public void i_add_products_to_the_basket() throws Throwable {
	   addToBasketPage.addProductsToTheBasket();
		
	}
	
	@When("^I click on Basket button$")
	public void i_click_on_Basket_button() throws Throwable {
	   addToBasketPage.verfiyBasketButton();
	}


	@When("^I click on checkout button$")
	public void i_click_on_checkout_button() throws Throwable {
	   addToBasketPage.verifyCheckoutButton();
		
	}


}
