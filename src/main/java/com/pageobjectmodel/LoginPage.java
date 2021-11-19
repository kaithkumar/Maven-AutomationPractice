/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email_Button;
	
	@FindBy(id="passwd")
	private WebElement passwd_Button;
	
	@FindBy(id="SubmitLogin")
	private WebElement click_Button;
	
	/**
	 * @return the email_Button
	 */
	public WebElement getEmail_Button() {
		return email_Button;
	}

	/**
	 * @return the passwd_Button
	 */
	public WebElement getPasswd_Button() {
		return passwd_Button;
	}

	/**
	 * @return the click_Button
	 */
	public WebElement getClick_Button() {
		return click_Button;
	}

	
}
