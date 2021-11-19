/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderPage {
	
public WebDriver driver;
public OrderPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
private WebElement proceed_Button;
/**
 * @return the proceed_Button
 */
public WebElement getProceed_Button() {
	return proceed_Button;
}


}
