package com.Honeywell.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Honeywell.Runner.BaseClass;
import com.Honeywell.Utilities.WaitHelper;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LogOutObject extends BaseClass {
	
	AppiumDriver<MobileElement> ldriver;

	public LogOutObject(AppiumDriver<MobileElement> driver)
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Main Menu\"]") WebElement globeldrwer;
	@FindBy(id="com.honeywell.android.lyric:id/destructive_text_view") WebElement btnlogout;
	
	public void clickglobeldrwer()
	{
		wait = new WaitHelper(ldriver);
		wait.WaitForElement(globeldrwer, 30);
		globeldrwer.click();
	}
	public void HHlogout()
	{
		wait.WaitForElement(btnlogout, 30);
		btnlogout.click();
	}

}
