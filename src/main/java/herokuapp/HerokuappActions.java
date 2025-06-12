package herokuapp;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import browser.BrowserLanch;
import propertie.PropertiesFile;

public class HerokuappActions extends BrowserLanch{
	static String result;
	static String expected;
	static String actual;
	
	public static void js_Alert(String jsxpath,String expresultText) throws IOException 
	{
		WebElement jsxpat=driver.findElement(By.xpath(PropertiesFile.propertieFiles(jsxpath)));
		jsxpat.click();
		
		driver.switchTo().alert().accept();
		result=driver.findElement(By.xpath(PropertiesFile.propertieFiles(expresultText))).getText();
		actual=result;
		expected="You successfully clicked an alert";
		assertEquals(actual, expected);
	}
		
	public static void js_ConformationClick(String jscon,String expectext) throws IOException
	{
		WebElement jsconform=driver.findElement(By.xpath(PropertiesFile.propertieFiles(jscon)));
		jsconform.click();
		
		driver.switchTo().alert().accept();
		result=driver.findElement(By.xpath(PropertiesFile.propertieFiles(expectext))).getText();
		actual=result;
		expectext="You clicked: Ok";
		assertEquals(actual, expectext);
		
		
	}
	public static void js_comformationDismiss(String jscon,String expectext) throws IOException
	{
		WebElement jsconform=driver.findElement(By.xpath(PropertiesFile.propertieFiles(jscon)));
		jsconform.click();
		
		driver.switchTo().alert().dismiss();
		result=driver.findElement(By.xpath(PropertiesFile.propertieFiles(expectext))).getText();
		actual=result;
		expectext="You clicked: Cancel";
		assertEquals(actual, expectext);
	}
	
	public static void js_prompt(String jspro,String sendkey, String expectext ) throws IOException
	{
		WebElement jspromptt=driver.findElement(By.xpath(PropertiesFile.propertieFiles(jspro)));
		jspromptt.click();
		driver.switchTo().alert().sendKeys(sendkey);
		driver.switchTo().alert().accept();
		result=driver.findElement(By.xpath(PropertiesFile.propertieFiles(expectext))).getText();
		System.out.println(result);
		
	}
		
		
		
		
		
	
	
	
}
