@smoke
Feature: End to End Functionality


Scenario: verify the functionality for placing order as a Guest costumer
Given I am on homepage
When I add products to the basket
And I click on Basket button
And I click on checkout button
And I continue as a guest customer
And I enter valid credentials
|firstname|samragi|
|lastname|singh|
|phonenumber|07365389266|
|email|samragishaktawat@gmail.com|
|confirmemail|samragishaktawat@gmail.com|
|postcode|CR2 6PZ|
And I click on Buy now
Then I will be able to successfully place the order


