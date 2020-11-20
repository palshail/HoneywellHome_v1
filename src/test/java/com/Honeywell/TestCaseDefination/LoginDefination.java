package com.Honeywell.TestCaseDefination;

import java.net.MalformedURLException;
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
	}

	@When("User click on Login btn")
	public void user_click_on_login_btn() {
		log.info("Application Lanuched");
		logimapping.clickonhomelogin();
		log.info("Home Login Button clicked");
	}

	@Then("User set email adress as")
	public void user_set_email_adress_as() {
		logimapping.setemail();
		log.info("Email ID set");
	}

	@Then("Password as")
	public void password_as() {
		
		logimapping.setpassowrd();
		log.info("Password is set");
	}

	@Then("user click on authlogin btn")
	public void user_click_on_authlogin_btn() {
		
		logimapping.clickonbtnlogin();
		log.info("Auth Login button is clicked ");
	}
	
}
