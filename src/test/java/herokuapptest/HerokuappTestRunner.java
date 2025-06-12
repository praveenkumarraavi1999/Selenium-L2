package herokuapptest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.BrowserLanch;
import herokuapp.HerokuappActions;


public class HerokuappTestRunner {
	@BeforeTest
	public  void herokuappBrow() throws IOException
	{
		BrowserLanch.browserSetUP("browser2");
		BrowserLanch.url("url_herokuapp");
		
	}
	
	@Test
	public  void heroKuappAction() throws IOException
	{
		//HerokuappActions.js_Alert("js_alert", "expresultText");
		HerokuappActions.js_Alert("js_alert", "expresultText");
		HerokuappActions.js_ConformationClick("js_conformm", "expresultText");
		HerokuappActions.js_comformationDismiss("js_conformm", "expresultText");
		HerokuappActions.js_prompt("js_promp", "praveen", "expresultText");
	}
	
	@AfterTest
	public void closing()
	{
		BrowserLanch.tearDown();
	}

}
