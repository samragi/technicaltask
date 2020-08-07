package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

public class ExplicitWait extends BaseClass {

	public void visibilityOfElementClick(By element,int Time) {
		
		WebDriverWait wait=new WebDriverWait(driver, Time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
	}
	
    public void visibilityOfElement(By element) {
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public void visibilityOfElementClick(WebElement webElement, int time) {
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
	}


	
	
}
