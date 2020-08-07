package Constants;

import org.openqa.selenium.By;

public interface SearchConstants {

	 By SEARCHTEXTBOX1 = By.cssSelector(".search-input.js-dummy-input");
	 By SEARCHTEXTBOX2 = By.cssSelector("#pop-in-search-term");
	 By SEARCHBUTTON = By.xpath("//*[@id=\"menu-pop-in\"]/div[2]/div[1]/a[2]");
}