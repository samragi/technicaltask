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

		action.updateTextBox(LoginConstants.USERNAME, username);
		action.updateTextBox(LoginConstants.PASSWORD, password);
		action.clickOnElement(LoginConstants.LOGINBUTTON);
	}

    //Login with invalid data
	public void verifyLoginWithInvalidDetails(DataTable invalidloginTable) throws InterruptedException {

		Map<String, String> invalidloginDetails = invalidloginTable.asMap(String.class, String.class);
		String username = invalidloginDetails.get("email");
		String password = invalidloginDetails.get("Password");

		action.updateTextBox(LoginConstants.USERNAME, username);
		action.updateTextBox(LoginConstants.PASSWORD, password);
		action.clickOnElement(LoginConstants.LOGINBUTTON);

	}

}
