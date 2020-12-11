package com.Honeywell.TestCaseDefination;

import com.Honeywell.PageObject.PlatformExecutionObject;
import com.Honeywell.Runner.BaseClass;

import io.cucumber.java.en.*;

public class PlatfromExecutionDefination extends BaseClass {
	
	
	
	@Given("verifiy user is logged in")
	public void verifiy_user_is_logged_in() {
		platformmapping = new PlatformExecutionObject(driver);
		platformmapping.verifiyglobeldrwer();
		log.info("User is logged in");
	}

	@When("user navigate to platfrom screen")
	public void user_navigate_to_platfrom_screen() {
		
		if(platformmapping.verifiyglobeldrwer().TRUE)
		{
			platformmapping.directclickglobeldrwer();
		}else
		{
			log.info("user is not logged in");
		}
	    
	}

	@Then("system capture aviable text present in platfrom")
	public void system_capture_aviable_text_present_in_platfrom() {
	
	}
	
	@Then("verifiy Activity history")
	public void verifiy_activity_history() {
	    
	}

	@Then("verifiy Invite User")
	public void verifiy_invite_user() {
	    
	}

	@Then("verifiy Adress")
	public void verifiy_adress() {
	   
	}

	@Then("verifiy Account Details")
	public void verifiy_account_details() {
		 platformmapping.verfiyaccountdetails();
	}

	@Then("verifiy Connected Services")
	public void verifiy_connected_services() {
	  platformmapping.verfiyconnectedservices();
	}

	@Then("verifiy get Help")
	public void verifiy_get_help() {
		platformmapping.verfiygethelp();
	}

	@Then("verifiy About the app")
	public void verifiy_about_the_app() {
		platformmapping.verfiyabouttheapp();
	}

}
