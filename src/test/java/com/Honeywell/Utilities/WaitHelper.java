package com.Honeywell.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WaitHelper {
	
public AppiumDriver<MobileElement> driver; 
	
	public WaitHelper(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void WaitForElement(WebElement homelogin,long timeoutinsec)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeoutinsec);
		wait.until(ExpectedConditions.visibilityOf(homelogin));
	}

}
