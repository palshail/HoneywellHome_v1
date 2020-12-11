package com.Honeywell.Runner;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.Honeywell.PageObject.LogOutObject;
import com.Honeywell.PageObject.LoginObject;
import com.Honeywell.PageObject.PlatformExecutionObject;
import com.Honeywell.Utilities.RandomStringsAndNumbers;
import com.Honeywell.Utilities.WaitHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class BaseClass {

	public static AndroidDriver<MobileElement> driver;
	public static Logger log;
	public static LoginObject logimapping;
	public static LogOutObject logoutmapping;
	public static PlatformExecutionObject platformmapping;
	public static WaitHelper wait;
	//public static RandomStringsAndNumbers randomstrnum;
	public static String ThermostatName;
	public static final String PLATFORM_EXCEL_SHEET_PATH_MAPPING = "F:\\HH App\\Honeywell\\HoneywellHome_v1\\platform.xlsx";
	public static Workbook book; 
	public static Sheet sheet;
	
	public void setup() throws MalformedURLException
	{
		log = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("log4J.properties");
		try {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME , MobilePlatform.ANDROID);
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 5T");
			caps.setCapability(MobileCapabilityType.UDID, "c9962a1c");
			caps.setCapability("appPackage", "com.honeywell.android.lyric");
			caps.setCapability("appActivity", "com.honeywell.granite.graniteui.presentation.activity.dashboard.DashBoardActivity");
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, caps);
			log.info("Application Lanuched successfully...");	
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
		
	}
	
}
