package com.Honeywell.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Honeywell.Runner.BaseClass;
import com.Honeywell.Utilities.WaitHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginObject extends BaseClass{

	AppiumDriver<MobileElement> ldriver;
	String locatoreName = null;
	String locatoreValue = null;

	public LoginObject(AppiumDriver<MobileElement> driver)
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="com.honeywell.android.lyric:id/fragment_login_login_button") @CacheLookup WebElement homelogin;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText\r\n") @CacheLookup WebElement textemail;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText") @CacheLookup WebElement textpassword;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]\r\n") WebElement btnlogin;
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button") WebElement allowaccess;
	@FindBy(id="com.honeywell.android.lyric:id/dont_use_txt") WebElement increasesecurity;
	@FindBy(id="com.honeywell.android.lyric:id/btn_positive_got_it") WebElement statnext;
	@FindBy(id="com.honeywell.android.lyric:id/btn_positive_got_it") WebElement wethernext;
	@FindBy(id="com.honeywell.android.lyric:id/btn_positive_got_it") WebElement wetherDone;
	@FindBy(id="com.honeywell.android.lyric:id/dashboard_device_name") WebElement statName;

	public void clickonhomelogin()
	{
		wait = new WaitHelper(ldriver);
		wait.WaitForElement(homelogin, 30);
		homelogin.click();
	}
	public void setemail()
	{
		wait.WaitForElement(textemail, 30);
		textemail.sendKeys("wld@mailinator.com");
	}
	public void setpassowrd()
	{
		wait.WaitForElement(textpassword, 30);
		textpassword.sendKeys("Balaji123");
	}
	public void clickonbtnlogin()
	{
		wait.WaitForElement(btnlogin, 30);
		btnlogin.click();
	}

	public Boolean checkelementpreste()
	{
		wait.WaitForElement(allowaccess, 30);
		if(allowaccess.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	public Boolean checkincreasesecurity()
	{
		wait.WaitForElement(increasesecurity, 30);
		if(increasesecurity.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	public Boolean checkstatnext()
	{
		wait.WaitForElement(statnext, 10);
		if(statnext.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	public Boolean checkewethernext()
	{
		wait.WaitForElement(wethernext, 10);
		if(wethernext.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}

	public Boolean checkewetherDone()
	{
		wait.WaitForElement(wetherDone, 10);
		if(wetherDone.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}

	public void handelcoachmark()
	{

		if(checkelementpreste().TRUE)
		{
			allowaccess.click();
			log.info("Allowed Location");
		}else {
			log.info("No Allowed Location");
		}

		if(checkincreasesecurity().TRUE)
		{
			increasesecurity.click();
			log.info("Dont add scurity");
		}else {

			log.info("No Dont add scurity");
		}

		if(checkstatnext().TRUE)
		{
			statnext.click();
			log.info("Thermostart Next Clicked");

		}else {
			log.info("No Thermostart Next");
		}
		if(checkewethernext().TRUE)
		{
			wethernext.click();
			log.info("Wether Next Clicked");
		}else
		{
			log.info("No Wether Next");
		}

		if(checkewetherDone().TRUE) {
			wetherDone.click();
			log.info("Wether Done Clicked");
		}
		else {
			log.info("No Coachmark displayed");
		}
	}

	/*
	 * public String ThermostatName() { wait.WaitForElement(statName, 30);
	 * ThermostatName = statName.getText().toString();
	 * log.info("Thermostar Name capture"); return ThermostatName; }
	 */
}
