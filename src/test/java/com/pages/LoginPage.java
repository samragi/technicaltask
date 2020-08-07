package com.pages;

import java.util.Map;

import org.junit.Assert;
import com.runner.BaseClass;

import Constants.LoginConstants;
import cucumber.api.DataTable;

public class LoginPage extends BaseClass {

	// Login
	public void verifyLoginPage() {

		action.clickOnElement(LoginConstants.LOGINICON);
		Assert.assertEquals("https://www.superdry.com/my-account", driver.getCurrentUrl());

	}

	// Login with valid data
	public void verifyLoginWithValidDetails(DataTable validloginTable) {

		Map<String, String> validloginDetails = validloginTable.asMap(String.class, String.class);
		String username = validloginDetails.get("email");
		String password = validloginDetails.get("Password");

		/*
		 * driver.findElement(USERNAME).clear();
		 * driver.findElement(USERNAME).sendKeys(username);
		 * driver.findElement(PASSWORD).clear();
		 * driver.findElement(PASSWORD).sendKeys(password);
		 */
		

		action.updateTextBox(LoginConstants.USERNAME, username);
		action.updateTextBox(LoginConstants.PASSWORD, password);
		action.clickOnElement(LoginConstants.LOGINBUTTON);
	}

    //Login with invalid data
	public void verifyLoginWithInvalidDetails(DataTable invalidloginTable) throws InterruptedException {

		Map<String, String> invalidloginDetails = invalidloginTable.asMap(String.class, String.class);
		String username = invalidloginDetails.get("email");
		String password = invalidloginDetails.get("Password");

		Thread.sleep(3000);
		/*
		 * driver.findElement(USERNAME).clear();
		 * driver.findElement(USERNAME).sendKeys(loginDetails.get("email"));
		 * driver.findElement(PASSWORD).clear();
		 * driver.findElement(PASSWORD).sendKeys(loginDetails.get("password"));
		 */
	

		action.updateTextBox(LoginConstants.USERNAME, username);
		action.updateTextBox(LoginConstants.PASSWORD, password);
		action.clickOnElement(LoginConstants.LOGINBUTTON);

	}

}
