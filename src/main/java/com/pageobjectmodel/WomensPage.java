/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensPage {
	
public WebDriver driver;

public WomensPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//select[@id='selectProductSort']")
private WebElement dropDown;

@FindBy(xpath="(//img[@title='Printed Dress'])[1]")
private WebElement printedDress;

/**
 * @return the dropDown
 */
public WebElement getDropDown() {
	return dropDown;
}

/**
 * @return the printedDress
 */
public WebElement getPrintedDress() {
	return printedDress;
}



}
