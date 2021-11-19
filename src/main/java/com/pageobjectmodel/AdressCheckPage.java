/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 91888
 *
 */
public class AdressCheckPage {
	public WebDriver driver;
	public AdressCheckPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed_Button;
	/**
	 * @return the proceed_Button
	 */
	public WebElement getProceed_Button() {
		return proceed_Button;
	}


}
