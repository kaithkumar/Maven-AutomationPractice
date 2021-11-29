/**
 * 
 */
package com.Runnerclass;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.BaseClass;
import com.pageobjectmodel.AdressCheckPage;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.OrderPage;
import com.pageobjectmodel.ShipmentPage;
import com.pageobjectmodel.SleevePage;
import com.pageobjectmodel.WomensPage;
import com.sdp.FileReaderManager;
import com.sdp.PageObjectManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = webDriverLaunch("chrome");
	public static Logger log = Logger.getLogger(RunnerClass.class);
	public static PageObjectManager pom = new PageObjectManager(driver);
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = FileReaderManager.getInstatnceFRM().getInstanceFR().getUrl();
		urlLaunch(url);
		log.info("url launched");
		
		getTitle();
		
		clickingElement(pom.getObjectSleevePage().getAddToCart());
		log.info("added to cart");
		
		Thread.sleep(2000);
		
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
		
		screenShot("check");
		log.info("screen shot taken");
		
		quitBrowser();
		
	}

}
