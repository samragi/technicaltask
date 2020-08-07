package com.driver;

import org.openqa.selenium.By;


import com.runner.BaseClass;

public class Action extends BaseClass{
	
	
	public void updateTextBox(By element,String searchTerm) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(searchTerm);  
	}

	public By clickOnElement(By element) {
		driver.findElement(element).click();
		return element;
	}

}
