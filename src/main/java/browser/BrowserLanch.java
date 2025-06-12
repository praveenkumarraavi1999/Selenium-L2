package browser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import propertie.PropertiesFile;

public class BrowserLanch {
	public static WebDriver driver;
	public static void browserSetUP(String Browserkey) throws IOException
	{
		String Browser=PropertiesFile.propertieFiles(Browserkey);
//		switch(.equalsIgnoreCase())
//		{
//		case
//		}
		if(Browser.equalsIgnoreCase("chrome"))
			{
			driver=new ChromeDriver();
				}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else 
		{
			System.out.println("enter valid browser name");
		}
		
		
	}
	public static void url(String url) throws IOException
	{
		driver.manage().window().maximize();
		driver.get(PropertiesFile.propertieFiles(url));
		
	}
	
	public static void tearDown()
	{
		driver.quit();
	}
	
	

}
