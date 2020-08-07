package Constants;

import org.openqa.selenium.By;

public interface AddToBasketConstants {

	By ADDTOBASKETBUTTON= By.cssSelector(".add-to-bag-button.button");
	By BASKETBUTTON= By.cssSelector("a[title='View Bag']");
	By CHECKOUTBUTTON=By.cssSelector("#checkout-submit");
	By SIZEDROPDOWN=By.name("size-dropdown");
	By FILTERDROPDOWN=By.cssSelector("button[data-id='category-sorting']");
}
