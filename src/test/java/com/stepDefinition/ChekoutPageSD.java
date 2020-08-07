package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChekoutPageSD extends BaseClass {

	@When("^I continue as a guest customer$")
	public void i_continue_as_a_guest_customer() throws Throwable {
		checkoutPage.verifyGuestCustomer();
	}

	
	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
	   checkoutPage.verifyCheckoutDetails();
	}

	@When("^I click on Buy now$")
	public void i_click_on_Buy_now() throws Throwable {
		checkoutPage.verifyBuyNowButton();
	    
	}

	@Then("^I will be able to successfully place the order$")
	public void i_will_be_able_to_successfully_place_the_order() throws Throwable {
	    
		
	}

}
