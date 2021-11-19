/**
 * 
 */
package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pageobjectmodel.AdressCheckPage;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.OrderPage;
import com.pageobjectmodel.ShipmentPage;
import com.pageobjectmodel.SleevePage;
import com.pageobjectmodel.WomensPage;

public class PageObjectManager {

	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	private  HomePage hp;
	private  WomensPage wp;
	private  SleevePage sp;
	private  OrderPage op;
	private  LoginPage lp;
	private  AdressCheckPage acp;
	private  ShipmentPage ship;
	
	public HomePage getObjectHomePage()
	{
		if(hp==null)
		{
			hp= new HomePage(driver);
		}
		return hp;
	}
	public WomensPage getObjectWomensPage()
	{
		if(wp==null)
		{
			wp= new WomensPage(driver);
		}
		return wp;
	}
	public SleevePage getObjectSleevePage()
	{
		if(sp==null)
		{
			sp= new SleevePage(driver);
		}
		return sp;
	}
	public OrderPage getObjectOrderPage()
	{
		if(op==null)
		{
			op= new OrderPage(driver);
		}
		return op;
	}
	public LoginPage getObjectLoginPage()
	{
		if(lp==null)
		{
			lp= new LoginPage(driver);
		}
		return lp;
	}
	public AdressCheckPage getObjectAdressCheckPage()
	{
		if(acp==null)
		{
			acp= new AdressCheckPage(driver);
		}
		return acp;
	}
	public ShipmentPage getObjectShipmentPage()
	{
		if(ship==null)
		{
			ship= new ShipmentPage(driver);
		}
		return ship;
	}
	
	
}
