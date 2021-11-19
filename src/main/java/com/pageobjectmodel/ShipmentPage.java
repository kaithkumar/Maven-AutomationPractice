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
public class ShipmentPage {
	public WebDriver driver;
	public ShipmentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement check_Box;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement click_Button;
	/**
	 * @return the check_Box
	 */
	public WebElement getCheck_Box() {
		return check_Box;
	}

	/**
	 * @return the click_Button
	 */
	public WebElement getClick_Button() {
		return click_Button;
	}
}
