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

	public LoginObject(AppiumDriver<MobileElement> driver)
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="com.honeywell.android.lyric:id/fragment_login_login_button") @CacheLookup WebElement homelogin;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText\r\n") @CacheLookup WebElement textemail;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText") @CacheLookup WebElement textpassword;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]\r\n") WebElement btnlogin;
	
	
	public void clickonhomelogin()
	{
		wait = new WaitHelper(ldriver);
		wait.WaitForElement(homelogin, 30);
		homelogin.click();
	}
	public void setemail()
	{
		wait.WaitForElement(textemail, 30);
		textemail.sendKeys("wlds29@grr.la");
	}
	public void setpassowrd()
	{
		wait.WaitForElement(textpassword, 30);
		textpassword.sendKeys("Balaji@123");
	}
	public void clickonbtnlogin()
	{
		wait.WaitForElement(btnlogin, 30);
		btnlogin.click();
	}
}
