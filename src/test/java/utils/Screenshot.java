package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browser.BrowserLanch;

public class Screenshot extends BrowserLanch {
	
	public static void screenshotFile() throws IOException
	{
		File scrfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File path=new File("C:\\Users\\prave\\eclipse-workspace\\seleniumL2\\src\\test\\resources\\screenshots.scr1.png");
		FileUtils.copyFile(scrfile, path);
	}


	

}
