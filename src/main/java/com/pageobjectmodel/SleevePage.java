/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SleevePage {

	public WebDriver driver;
	
	public SleevePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkOut;

	/**
	 * @return the addToCart
	 */
	public WebElement getAddToCart() {
		return addToCart;
	}

	/**
	 * @return the checkOut
	 */
	public WebElement getCheckOut() {
		return checkOut;
	}
	
}
