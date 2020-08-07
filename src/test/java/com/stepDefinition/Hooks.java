package com.stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import com.runner.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	String URL="https://www.superdry.com/";
	
	
	@Before
	public void start() {
	  System.setProperty("webdriver.chrome.driver","/Users/samragi/Desktop/Automation/chromedriver3");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  wait.applyImplicitWait();
	  driver.get(URL);
	  
	}

	@After
	public void close() {
		driver.close();
		
	}
}
