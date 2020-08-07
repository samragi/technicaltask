package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

public class MyAccountPage extends BaseClass{
	
	public void verifyAccountPage() throws InterruptedException {
		
		Thread.sleep(5000);
		Assert.assertEquals("https://www.superdry.com/my-account", driver.getCurrentUrl());
		
	}
	
    public void verifyInvalidAccountPage() throws InterruptedException {
		
    	Thread.sleep(5000);
		Assert.assertEquals("Your email address has not been recognised", driver.findElement(By.cssSelector(".error")).getText());
		
	}
	
}
