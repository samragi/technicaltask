package com.driver;

import java.util.concurrent.TimeUnit;

import com.runner.BaseClass;

public class Implicitwait extends BaseClass {

	
	public void applyImplicitWait(){
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
}
	
	
}
