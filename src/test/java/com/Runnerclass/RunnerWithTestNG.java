package com.Runnerclass;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Baseclass.BaseClass;
import com.sdp.FileReaderManager;
import com.sdp.PageObjectManager;

public class RunnerWithTestNG extends BaseClass
{
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(RunnerWithTestNG.class);
	public static PageObjectManager pom;
	
	@BeforeSuite
	private void log4jConfiguration() 
	{
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@BeforeTest
	public void settingProperties()
	{
	driver=	webDriverLaunch("chrome");
	log.info("properties set");

	}
	@BeforeClass
	private void changingDriver() {
		// TODO Auto-generated method stub
		pom = new PageObjectManager(driver);
	}
	
	@Test(priority=1)
	@Parameters({"url"})
	public void getUrl(String url) throws IOException, InterruptedException 
	{
		//String url = FileReaderManager.getInstatnceFRM().getInstanceFR().getUrl();
		urlLaunch(url);
		log.info("url launched sucessfully");
		Thread.sleep(4000);
		
		
	}

 
	@Test(priority =2)
	public void navigateToWomenPage() throws InterruptedException 
	{
		clickingElement(pom.getObjectHomePage().getWomenButton());
		log.info("element clciked");
		
		dropDown(pom.getObjectWomensPage().getDropDown(), "byindex", "4");
		log.info("dropdown selected");
		
		clickingElement(pom.getObjectWomensPage().getPrintedDress());
		log.info("printed dress selected");
		Thread.sleep(4000);
		 
	}
    @Test(priority=3)
	public void fullPurchase() throws IOException, InterruptedException 
    {
    	clickingElement(pom.getObjectSleevePage().getAddToCart());
		log.info("added to cart");
		
		Thread.sleep(4000); 
		
		clickingElement(pom.getObjectSleevePage().getCheckOut());
		
		clickingElement(pom.getObjectOrderPage().getProceed_Button());
		
		String userName = FileReaderManager.getInstatnceFRM().getInstanceFR().getUserName();
		sendKeys(pom.getObjectLoginPage().getEmail_Button(),userName);
		
		String getpassword = FileReaderManager.getInstatnceFRM().getInstanceFR().getpassword();
		sendKeys(pom.getObjectLoginPage().getPasswd_Button(), getpassword);
		log.info("logged in");
		
		clickingElement(pom.getObjectLoginPage().getClick_Button());
		
	    clickingElement(pom.getObjectAdressCheckPage().getProceed_Button());
	    
	    clickingElement(pom.getObjectShipmentPage().getCheck_Box());
	    
	    clickingElement(pom.getObjectShipmentPage().getClick_Button());
		
		screenShot("TestNG v");
		log.info("screen shot taken");
		
		quitBrowser();
		
	}

}
