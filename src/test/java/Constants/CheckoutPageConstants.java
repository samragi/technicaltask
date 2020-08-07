package Constants;

import org.openqa.selenium.By;


public interface CheckoutPageConstants {
	
    By GUESTCUSTOMERBUTTON= By.cssSelector("a[title='continue as guest']");
	By NEXTDAYDELIVERY=By.cssSelector("div[data-service-group='DOMND']");
    By FIRSTNAME=By.cssSelector("#shipping_first_name");
    By LASTNAME=By.cssSelector("#shipping_last_name");
    By PHONENUMBER=By.cssSelector("#billing_phone");
    By EMAILID=By.cssSelector("#billing_email");
    By COMFIRMEMAIL=By.cssSelector("#billing_confirmemail");
    By POSTCODE=By.cssSelector("#shipping-address-search");
    By AUTOADDRESS=By.cssSelector(".pcadescription");
    By ADDRESSSELECTED=By.xpath("/html/body/div[10]/div[1]/div[2]/div[5]");
    By NAMEONCARD=By.cssSelector("#order_payment_name");
    By CARDNUMBER=By.cssSelector("#card-number");
    By MONTHDROPDOWN=By.cssSelector("select[title='Expirymonth ']");
    By YEARDROPDOWN=By.cssSelector("select[title='Expiryyear ']");
    By CVV=By.cssSelector("#cvv");
    By BUYNOWBUTTON=By.cssSelector("#submit");
    
    
    
}
