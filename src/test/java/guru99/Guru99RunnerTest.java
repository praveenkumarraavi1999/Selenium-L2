package guru99;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.BrowserLanch;
import demoguru.DemoGuru99;

public class Guru99RunnerTest {
	@BeforeTest
	public void guruSetUPtest() throws IOException
	{
		BrowserLanch.browserSetUP("browser3");
		BrowserLanch.url("url_guru");
		
		
	}
	
	
	@Test
	public void guruRunner() throws IOException
	{
		//DemoGuru99.rownsAndColumns("rows", "columns");
		DemoGuru99.rownsAndColumns("rows", "columns");
	}

}
