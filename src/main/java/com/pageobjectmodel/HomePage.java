/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement womenButton;
	/**
	 * @return the womenButton
	 */
	public WebElement getWomenButton() {
		return womenButton;
	}
	
}
