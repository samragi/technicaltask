package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

public class Waits extends BaseClass{

public void applyImplicitWait(){
		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
}

public void visibilityOfElementClick(By element,int Time) {
	
	WebDriverWait wait=new WebDriverWait(driver, Time);
    wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();

}

public void visibilityOfElement(By element) {
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(element));

}

	
}
