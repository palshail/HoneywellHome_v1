package com.Honeywell.TestCaseDefination;

import java.net.MalformedURLException;

import org.junit.Assert;

import com.Honeywell.PageObject.LoginObject;
import com.Honeywell.Runner.BaseClass;
import io.cucumber.java.en.*;

public class LoginDefination extends BaseClass{
	
	BaseClass bc;

	
	@Given("User Launch Applocation application")
	public void user_launch_applocation_application() throws MalformedURLException {
		bc = new BaseClass();
		bc.setup();
		log.info("Application Lanuched");
		logimapping = new LoginObject(driver);
		Assert.assertTrue(true);
	}

	@When("User click on Login btn")
	public void user_click_on_login_btn() {
		log.info("Application Lanuched");
		logimapping.clickonhomelogin();
		log.info("Home Login Button clicked");
		Assert.assertTrue(true);
	}

	@Then("User set email adress as")
	public void user_set_email_adress_as() {
		logimapping.setemail();
		log.info("Email ID set");
		Assert.assertTrue(true);
	}

	@Then("Password as")
	public void password_as() {
		
		logimapping.setpassowrd();
		log.info("Password is set");
		Assert.assertTrue(true);
	}

	@Then("user click on authlogin btn")
	public void user_click_on_authlogin_btn() {
		
		logimapping.clickonbtnlogin();
		log.info("Auth Login button is clicked ");
		Assert.assertTrue(true);
	}
	
	@Then("system land script to dashboard")
	public void system_land_script_to_dashboard() {
	    
		logimapping.handelcoachmark();
		log.info("Coach Mark are handeld");
		Assert.assertTrue(true);
		
	}

	/*
	 * @Then("capture thermostat Name {string}") public void
	 * capture_thermostat_name(String statname) {
	 * 
	 * logimapping.ThermostatName(); statname = LoginObject.ThermostatName;
	 * System.out.println("Stat Name captured = "+statname);
	 * log.info("Stat Name = "+ statname); Assert.assertTrue(true); }
	 */
	
}
