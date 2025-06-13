package ksrtc1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.BrowserLanch;
import ksrtc.KsRtcFunctionalities;
import utils.Screenshot;

public class KsrtcRunnerTest {
	
	@BeforeTest
	public void browserLanch() throws IOException
	{
		System.out.print("file running.........");
		BrowserLanch.browserSetUP("browser4");
		BrowserLanch.url("url_ksrtc");
		
	}
	
	@Test
	public void functionalities() throws IOException, InterruptedException
	{
		KsRtcFunctionalities.verify_phone_num("phn_no");
		KsRtcFunctionalities.clickSignInButton("cum_login");
		KsRtcFunctionalities.FillUserNameAndPassword("email", "emailtext", "mobxpath", "phn", "passwordxpath", "password");
		KsRtcFunctionalities.checkBox("checkboxxpath");
		KsRtcFunctionalities.login("loginxpath");
		KsRtcFunctionalities.validationAndClickOk("okxpathh");
		KsRtcFunctionalities.forgottenPassword("forgotpasswordxpath", "okbutt");
		Screenshot.screenshotFile();
	}
	
//	@AfterTest
//	public void close()
//	{
//		BrowserLanch.tearDown();
//	}

}
