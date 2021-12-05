/**
 * 
 */
package com.testRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.BaseClass;
import com.sdp.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\featureFiles\\AutomationPractice.feature",
		glue="com.stepDefinition",
		monochrome=true,
		//tags={"~@secondPage","~@firstPage"},
		plugin= {
				"html:Report\\htmlreport.html",
				"json:Report\\jsonreport.json",
				"pretty",
			//	"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentreport.html"
		
		}
		)


public class TestRunner { 
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws IOException {
		// TODO Auto-generated method stub
		driver=BaseClass.webDriverLaunch(FileReaderManager.getInstatnceFRM().getInstanceFR().getBrowser());
		
	}
	
	@AfterClass
	public static void tear_Down() {
		// TODO Auto-generated method stub
      driver.quit();
	}
}
