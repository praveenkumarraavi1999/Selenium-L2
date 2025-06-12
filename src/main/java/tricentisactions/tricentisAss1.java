package tricentisactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import propertie.PropertiesFile;

import static browser.BrowserLanch.*;
import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.io.IOException;

public class tricentisAss1  {
	static String current;
	static String expected;
	public static void moveCustSev_ClkBlog(String customerxpath) throws IOException
	{
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement customer_service=driver.findElement(By.xpath(PropertiesFile.propertieFiles(customer_service)));
		WebElement customerservice=driver.findElement(By.xpath(PropertiesFile.propertieFiles("customer_service")));
		//js.executeScript("argument[0].sc"), null)
		js.executeScript("arguments[0].scrollIntoView(true);", customerservice);
		
		driver.findElement(By.xpath(PropertiesFile.propertieFiles("blog"))).click();
		
	}
	public static void checkUrl(String exp) throws IOException
	{
		 current=driver.getCurrentUrl();
		 expected=PropertiesFile.propertieFiles(exp);
		//assertEquals(false, null);
		assertEquals(current, expected);
		
	}
	public static void findText(String textname) throws IOException, InterruptedException
	{
		//String text=PropertiesFile.propertieFiles(textname);
		
		 current=driver.findElement(By.xpath(PropertiesFile.propertieFiles(textname))).getText();
		 expected="BLOG ARCHIVE";
		assertEquals(current, expected);
		System.out.println("Able to find the text "+textname);
		
	}

}
