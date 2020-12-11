package com.Honeywell.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Honeywell.Runner.BaseClass;
import com.Honeywell.Utilities.RandomStringsAndNumbers;
import com.Honeywell.Utilities.WaitHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PlatformExecutionObject extends BaseClass {
	
	AppiumDriver<MobileElement> ldriver;
	public int rateingnumber;

	public PlatformExecutionObject(AppiumDriver<MobileElement> driver)
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Main Menu\"]") WebElement verifiyglobeldrwer;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_settings_list") WebElement platfromlist;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView") WebElement abouttheapptxt;
	@FindBy(id="com.honeywell.android.lyric:id/rate_text_view") WebElement ratetheapptxt;
	@FindBy(id="com.honeywell.android.lyric:id/rate_one") WebElement rateone;
	@FindBy(id="com.honeywell.android.lyric:id/rate_two") WebElement ratetwo;
	@FindBy(id="com.honeywell.android.lyric:id/rate_three") WebElement ratethree;
	@FindBy(id="com.honeywell.android.lyric:id/rate_four") WebElement ratefour;
	@FindBy(id="com.honeywell.android.lyric:id/rate_five") WebElement ratefive;
	@FindBy(id="com.honeywell.android.lyric:id/btn_close") WebElement closeratingupper;
	@FindBy(id="com.honeywell.android.lyric:id/feedback_thankyou_note") WebElement thankyounote;
	@FindBy(id="com.honeywell.android.lyric:id/feedback_text") WebElement feedbacktext;
	@FindBy(id="com.honeywell.android.lyric:id/anonymous_enable_toggle") WebElement feedbacktoggle;
	@FindBy(id="com.honeywell.android.lyric:id/btn_send_feedback") WebElement feedbacksend;
	@FindBy(id="com.honeywell.android.lyric:id/close_btn") WebElement feedbackclose;
	@FindBy(id="com.honeywell.android.lyric:id/feedback_btn_close") WebElement goodratingclose;
	@FindBy(id="com.honeywell.android.lyric:id/feedback_btn_continue") WebElement googratingcontinue;
	@FindBy(id="com.honeywell.android.lyric:id/privacy_policy_text_view") WebElement eulapage;
	@FindBy(id="com.honeywell.android.lyric:id/toolbar_title\r\n") WebElement eulatoolbar;
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate Up\"]") WebElement navigateup;
	@FindBy(id="com.honeywell.android.lyric:id/acknowledge_text_view") WebElement acknowladgepage;
	@FindBy(id="com.honeywell.android.lyric:id/list_item_lyric_subtext_sub_text_view") WebElement appversion;
	@FindBy(id="com.honeywell.android.lyric:id/send_logs_text_view") WebElement sendlogs;
	@FindBy(id="com.honeywell.android.lyric:id/activity_email_log_button") WebElement sendlogbtn;
	@FindBy(id="android:id/button1") WebElement sendlogbtnok;
	@FindBy(id="android:id/alertTitle") WebElement acknowladgepagetitle;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView") WebElement gethelp;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView") WebElement connectedservices;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView") WebElement accountdetails;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_name_text") WebElement accusername;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_first_edit_text") WebElement accuserfirstname;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_last_edit_text") WebElement accuserlastname;
	@FindBy(id="com.honeywell.android.lyric:id/view_save_name") WebElement accchangename;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_email_text") WebElement accuseremailid;
	@FindBy(id="com.honeywell.android.lyric:id/change_password_button") WebElement accuserchangepassword;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.view.View/android.widget.EditText") WebElement validationpassword;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]") WebElement validationcontinuesaveouter;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]") WebElement validationcancelouter;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]") WebElement validationcontinuesaveinner;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]") WebElement validationcontinuesaveinner1st;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[2]") WebElement validationcancelineer;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]") WebElement validationrequiredfiled;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.widget.EditText") WebElement validationewpassword;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.widget.EditText") WebElement validatioconfirmpaswword;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]") WebElement validationworkigproper;
	@FindBy(id="com.honeywell.android.lyric:id/remove_access_button") WebElement deleteaccount;
	@FindBy(id="com.honeywell.android.lyric:id/devices_learn_how") WebElement learnhowtodelete;
	@FindBy(id="com.honeywell.android.lyric:id/helpful_button") WebElement yeshelpfull;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_use_passcode_switch") WebElement passcodetoggle;
	@FindBy(id="com.honeywell.android.lyric:id/pin_editbox") WebElement set4digitpassword;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_change_passcode_tv") WebElement changepasscode;
	@FindBy(id="com.honeywell.android.lyric:id/fragment_current_user_unlock_with_touch_switch") WebElement unlockwithfingure;

	
	public Boolean verifiyglobeldrwer()
	{
		wait = new WaitHelper(ldriver);
		wait.WaitForElement(verifiyglobeldrwer, 30);
		return verifiyglobeldrwer.isDisplayed();
	}
	
	public void directclickglobeldrwer()
	{
		verifiyglobeldrwer.click();
	}
	
	public Boolean abouttheapp()
	{
		wait.WaitForElement(abouttheapptxt, 30);
		if(abouttheapptxt.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void feedbackhandle()
	{
		wait.WaitForElement(feedbacktext, 30);
		feedbacktext.clear();
		feedbacktext.sendKeys("test");
		log.info("Text intered as text");
		wait.WaitForElement(feedbacktoggle, 30);
		feedbacktoggle.isEnabled();
		log.info("Toggle is on");
		feedbacktoggle.isEnabled();
		log.info("Toggle is off");
		wait.WaitForElement(feedbacksend, 30);
		feedbacksend.isEnabled();
		log.info("feedback send is displayed");
		wait.WaitForElement(feedbackclose, 30);
		feedbackclose.click();
		log.info("feedback page is closed");
	}
	
	public void goodfeedbackhandle()
	{
		wait.WaitForElement(googratingcontinue, 30);
		googratingcontinue.isDisplayed();
		log.info("Continue buttion Dispaled");
		wait.WaitForElement(goodratingclose, 30);
		goodratingclose.click();
		log.info("close buttion clicked");
	}
	
	public void verfiyabouttheapp() 
	{
		if(abouttheapp().TRUE)
		{
			abouttheapptxt.click();
			log.info("About The App clicked");
			wait.WaitForElement(ratetheapptxt, 30);
			ratetheapptxt.click();
			wait.WaitForElement(closeratingupper, 30);
			closeratingupper.click();
			ratetheapptxt.click();
			//randomstrnum = new RandomStringsAndNumbers();
			//rateingnumber = randomstrnum.getRandomNumber(1, 6);
			int rateingnumber = RandomStringsAndNumbers.getRandomNumber(1, 6);
			System.out.println("Rating given as "+rateingnumber);
			if(rateingnumber==1)
			{
				rateone.click();
				log.info("Rating 1 selected");
				feedbackhandle();
				
			}else if(rateingnumber==2){
				ratetwo.click();
				log.info("Rating 2 selected");
				feedbackhandle();
			}else if(rateingnumber==3){
				ratethree.click();
				log.info("Rating 3 selected");
				feedbackhandle();
			}else if(rateingnumber==4){
				ratefour.click();
				log.info("Rating 4 selected");
				goodfeedbackhandle();
				
			}else
			{
				ratefive.click();
				log.info("Rating 5 selected");
				goodfeedbackhandle();
			}

		}else {
			log.info("About The App is not present");
		}
		
		wait.WaitForElement(eulapage, 30);
		eulapage.click();
		log.info("Eula Page Clicked");
		wait.WaitForElement(navigateup, 30);
		navigateup.click();
		log.info("navigate up clicked");
		wait.WaitForElement(acknowladgepage, 30);
		acknowladgepage.click();
		log.info("Acknowledgement page open");
		wait.WaitForElement(acknowladgepagetitle, 30);
		System.out.println(acknowladgepagetitle.getText().toString());
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		log.info("Acknowledgement back navigated");
		wait.WaitForElement(appversion, 30);
		String appveriosn = appversion.getText().toString();
		log.info("App version = "+appveriosn);
		wait.WaitForElement(sendlogs, 30);
		sendlogs.click();
		log.info("Send log open");
		wait.WaitForElement(sendlogbtn, 30);
		sendlogbtn.click();
		log.info("log sent succusfully");
		wait.WaitForElement(sendlogbtnok, 30);
		sendlogbtnok.click();
		log.info("Send log ok clicked");
		wait.WaitForElement(navigateup, 30);
		navigateup.click();
		log.info("navigated to platform");
	}
	
	
	public void verfiygethelp() 
	{
		wait.WaitForElement(gethelp, 30);
		gethelp.click();
		log.info("gethelp page is open");
	    ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	    log.info("gethelp page verifired");
	}
	
	public void verfiyconnectedservices() 
	{
		wait.WaitForElement(connectedservices, 30);
		connectedservices.click();
		log.info("concted services verified succuesfully");
		wait.WaitForElement(navigateup, 30);
		navigateup.click();
		log.info("navigated to platform");
	}
	
	public void passcodeenable() 
	{
		wait.WaitForElement(passcodetoggle, 30);
		passcodetoggle.click();
		log.info("Passcode enable selected");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("created passcode with 1425");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("confirmed passcode with 1425");
		
	}
	public void passcodediable() 
	{
		wait.WaitForElement(passcodetoggle, 30);
		passcodetoggle.click();
		log.info("Passcode disable selected");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("Passcode disable succesfull");
	}
	public void changepasscod() 
	{
		wait.WaitForElement(changepasscode, 30);
		changepasscode.click();
		log.info("Change passcode is clicked");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("Passcode is confirmed");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("created passcode with 1425");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("confirmed passcode with 1425");
	}
	public void unlockwithfigurprint() 
	{
		wait.WaitForElement(unlockwithfingure, 30);
		unlockwithfingure.click();
		log.info("unlockwithfingure enable");
		unlockwithfingure.click();
		log.info("unlockwithfingure is disable");
		wait.WaitForElement(set4digitpassword, 30);
		set4digitpassword.sendKeys("1425");
		log.info("unlockwithfingure is disable succusfull");
	}
	
	
	public void verfiyaccountdetails() 
	{
		wait.WaitForElement(accountdetails, 30);
		accountdetails.click();
		log.info("account details open");
		
		
		String passcodestatus2 = passcodetoggle.getTagName();
		System.out.println(passcodestatus2.toString());
		
		Object passcodestatus3 = passcodetoggle.getClass();
		System.out.println(passcodestatus3.toString());
	
		
		if(passcodestatus2.contains(passcodestatus2))
		{
			System.out.println("Passcode is enable");
			passcodediable();
			passcodeenable();
			changepasscod();
			unlockwithfigurprint();
			passcodediable();
		}
		else
		{
			System.out.println("Passcode is disable");
			passcodeenable();
			changepasscod();
			unlockwithfigurprint();
			passcodediable();
		}
		
		
		
		wait.WaitForElement(accusername, 30);
		accusername.click();
		log.info("User Name clicked");
		String FirstName = RandomStringsAndNumbers.randomstring(5);
		String LastName = RandomStringsAndNumbers.randomstring(4);;
		wait.WaitForElement(accuserfirstname, 30);
		accuserfirstname.clear();
		accuserfirstname.sendKeys(FirstName);
		log.info("First Name set");
		wait.WaitForElement(accuserlastname, 30);
		accuserlastname.clear();
		accuserlastname.sendKeys(LastName);
		log.info("last Name set");
		wait.WaitForElement(accchangename, 30);
		accchangename.click();
		log.info("User Full Name is saved successfully");
	
		wait.WaitForElement(accuseremailid, 30);
		String accountemail = accuseremailid.getText().toString();
		log.info("logged in with account "+accountemail);
		
		wait.WaitForElement(accuserchangepassword, 30);
		accuserchangepassword.click();
		log.info("Change passord page open");
		
		wait.WaitForElement(validationcancelouter, 45);
		validationcancelouter.click();
		log.info("navigated back");
		
		wait.WaitForElement(accuserchangepassword, 30);
		accuserchangepassword.click();
		log.info("Change passord page open");
		
		wait.WaitForElement(validationpassword, 45);
		validationpassword.sendKeys("Balaji123");
		log.info("Correct Password updated successfull");
		
		wait.WaitForElement(validationcontinuesaveouter, 30);
		validationcontinuesaveouter.click();
		log.info("Validation is successful");
		
		wait.WaitForElement(validationcontinuesaveinner1st, 45);
		validationcontinuesaveinner1st.click();
		log.info("validationcontinuesaveinner1st clicked is successful");
		
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		
		wait.WaitForElement(validationrequiredfiled, 30);
		String baothempty = validationrequiredfiled.getText().toString();
		log.info("Both filed empaty vaildation succesull " + baothempty);
		
		
		wait.WaitForElement(validationewpassword, 30);
		validationewpassword.sendKeys("Balaji123");
		log.info("New Password set successuly");
		
		wait.WaitForElement(validatioconfirmpaswword, 30);
		validatioconfirmpaswword.sendKeys("Balaji123");
		log.info("Recofirm Password set successuly");
		
		wait.WaitForElement(validationcontinuesaveinner, 30);
		validationcontinuesaveinner.click();
		log.info("Password change is successful");
		
		wait.WaitForElement(validationworkigproper, 30);
		String workingpropeor = validationworkigproper.getText().toString();
		log.info("Password set successuly with error"+workingpropeor);
		
		wait.WaitForElement(validationcancelineer, 30);
		validationcancelineer.click();
		log.info("after vailidation cancel is clicked");
		
		wait.WaitForElement(deleteaccount, 30);
		deleteaccount.click();
		log.info("Delete Account Clicked succussfull");
		
		wait.WaitForElement(learnhowtodelete, 30);
		learnhowtodelete.click();
		log.info(" Learn how to Delete Account Clicked succussfull");
		
		wait.WaitForElement(yeshelpfull, 30);
		yeshelpfull.click();
		log.info("Articalhelp succesfull");
		
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		
		wait.WaitForElement(navigateup, 30);
		navigateup.click();
		log.info("navigated to main platfrom");
		
		System.out.println(passcodetoggle.toString());
		System.out.println(passcodetoggle.hashCode());
		
		//pascode code
		
		wait.WaitForElement(navigateup, 30);
		navigateup.click();
		
	}
	
	
}
