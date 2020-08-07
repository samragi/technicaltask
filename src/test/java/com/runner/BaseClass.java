package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.driver.Waits;
import com.pages.AddToBasketPage;
import com.pages.CheckoutPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MyAccountPage;
import com.pages.SearchResultPage;


public class BaseClass{

	public static WebDriver driver;
	public static String globalSearchWord;
	public static HomePage homePage = new HomePage();
	public static SearchResultPage searchResultPage = new SearchResultPage();
	public static LoginPage loginPage = new LoginPage();
    public static MyAccountPage myAccountPage = new MyAccountPage();
	public static AddToBasketPage addToBasketPage=new AddToBasketPage();
	public static CheckoutPage checkoutPage=new CheckoutPage();
	public static Action action=new Action();
	public static Waits wait=new Waits();

}