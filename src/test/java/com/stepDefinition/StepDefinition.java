package com.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.Baseclass.BaseClass;
import com.Runnerclass.RunnerClass;
import com.sdp.FileReaderManager;
import com.sdp.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



/**
 * @author 91888
 *
 */
public class StepDefinition extends BaseClass {
	public static WebDriver driver = RunnerClass.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	@Given("^user Should Launch The Website$")
	public void user_Should_Launch_The_Website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url = FileReaderManager.getInstatnceFRM().getInstanceFR().getUrl();
		urlLaunch(url);
	}

	@When("^user Click The Womens Button$")
	public void user_Click_The_Womens_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getTitle();
		clickingElement(pom.getObjectHomePage().getWomenButton());
	    
	}

	@When("^user Selects The Sorting Option From The Dropdown$")
	public void user_Selects_The_Sorting_Option_From_The_Dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		dropDown(pom.getObjectWomensPage().getDropDown(), "byindex", "4");
	    
	}

	@When("^user Click The Printed Dress And It Navigates To Printed Dress Page$")
	public void user_Click_The_Printed_Dress_And_It_Navigates_To_Printed_Dress_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		clickingElement(pom.getObjectWomensPage().getPrintedDress());
	    
	}

	@When("^user Click The Add To Cart Button$")
	public void user_Click_The_Add_To_Cart_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
		
		clickingElement(pom.getObjectSleevePage().getAddToCart());
	    
	}

	@Then("^user Click The Proceed To Checkout Button And It Navigates To Order Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Order_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
		
		clickingElement(pom.getObjectSleevePage().getCheckOut());
	  
	}

	@When("^user Clicks The Proceed To Proceed To Checkout Button And It Naviagates To Sign In Page$")
	public void user_Clicks_The_Proceed_To_Proceed_To_Checkout_Button_And_It_Naviagates_To_Sign_In_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		clickingElement(pom.getObjectOrderPage().getProceed_Button());
	}

	@When("^user Enters The Username In The Username Field$")
	public void user_Enters_The_Username_In_The_Username_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String userName = FileReaderManager.getInstatnceFRM().getInstanceFR().getUserName();
		sendKeys(pom.getObjectLoginPage().getEmail_Button(),userName);
		
	  
	}

	@When("^user Enters The Password In The Password Button$")
	public void user_Enters_The_Password_In_The_Password_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		String getpassword = FileReaderManager.getInstatnceFRM().getInstanceFR().getpassword();
		sendKeys(pom.getObjectLoginPage().getPasswd_Button(), getpassword);
	  
	}

	@Then("^user Clicks The Proceed To Checkout Button And It Naviagtes To Shipping Page$")
	public void user_Clicks_The_Proceed_To_Checkout_Button_And_It_Naviagtes_To_Shipping_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickingElement(pom.getObjectLoginPage().getClick_Button());
	    
	}

	@When("^user Select The Terms Of Service Checkbox$")
	public void user_Select_The_Terms_Of_Service_Checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
      clickingElement(pom.getObjectAdressCheckPage().getProceed_Button());
	    
	   
	    
	}

	@Then("^user Click The Proceed To Checkout Button And It Navigates To Payment Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Payment_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 clickingElement(pom.getObjectShipmentPage().getCheck_Box());
		    
	    
	}

	@When("^user Click The Pay By Check Option It Navigates To Order Summary Page$")
	public void user_Click_The_Pay_By_Check_Option_It_Navigates_To_Order_Summary_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    clickingElement(pom.getObjectShipmentPage().getClick_Button());
	    
	}

	@Then("^user Click The I Confirm My Order Button And It Navigates To Order Confirmation Page$")
	public void user_Click_The_I_Confirm_My_Order_Button_And_It_Navigates_To_Order_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
