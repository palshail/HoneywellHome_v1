package com.Honeywell.TestCaseDefination;

import com.Honeywell.PageObject.LogOutObject;
import com.Honeywell.Runner.BaseClass;

import io.cucumber.java.en.*;

public class LogoutDefination extends BaseClass {
	
	
	@Given("User is logged in and on dashboard")
	public void user_is_logged_in_and_on_dashboard() {
		logoutmapping = new LogOutObject(driver);
		log.info("DashBoard is visible");
	}

	@Then("User click on globaldrwaer")
	public void user_click_on_globaldrwaer() {
		
		logoutmapping.clickglobeldrwer();
		log.info("Globel Drawer is clicled");
	}

	@Then("User logsOut")
	public void user_logs_out() {
		
		logoutmapping.HHlogout();
		log.info("User is logOuit");
	}

}
