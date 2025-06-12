package demowebshoptest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.BrowserLanch;
import tricentisactions.tricentisAss1;

public class DemoWebShopRunnerTest {
	@BeforeTest
	public  void browser() throws IOException
	{
//		
		BrowserLanch.browserSetUP("browser1");
		BrowserLanch.url("url_tricentis");
		
		
	}

	
	@Test
	public  void testActions() throws IOException, InterruptedException
	{
		tricentisAss1.moveCustSev_ClkBlog("customer_service");
		tricentisAss1.checkUrl("expectedurl");
		tricentisAss1.findText("text");
		
	}
	
	
//	@AfterTest
//	public void closeBrowser()
//	{
//		BrowserLanch.tearDown();
//	}
	
	
	
	
	
	
	

}
