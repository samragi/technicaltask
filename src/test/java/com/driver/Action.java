package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

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
	
	public void dropDown(By element, int index) {
	 	Select sizeDropDown =new Select(driver.findElement(element));
	 	sizeDropDown.selectByIndex(index); 
	    }

}
