

package ksrtc;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.BrowserLanch;
import propertie.PropertiesFile;

public class KsRtcFunctionalities extends BrowserLanch{
	 static String expected;
	 static String actual;
	public static void verify_phone_num(String phnnum) throws IOException
	{
//		String ph=PropertiesFile.propertieFiles(phnnum);
//		expected=ph;
//		String actual=driver.findElement(By.xpath(""));
		
		boolean phnNumber=driver.getPageSource().contains(PropertiesFile.propertieFiles(phnnum));
		assertTrue(phnNumber);
		System.out.println(phnNumber );
		
		
	}
	
	//clickOnSignIn
	public static void clickSignInButton(String login) throws IOException
	{
		driver.findElement(By.xpath(PropertiesFile.propertieFiles(login))).click();
		
	}
	
	//3.Fill username&password
	public static void FillUserNameAndPassword(String email,String emailtex,String mobilexpath,String phone,String passwordxpath, String password) throws IOException
	{
		WebElement emailInput=driver.findElement(By.xpath(PropertiesFile.propertieFiles(email)));
		emailInput.click();
		emailInput.sendKeys(PropertiesFile.propertieFiles(emailtex));
		
		WebElement mob=driver.findElement(By.xpath(PropertiesFile.propertieFiles(mobilexpath)));
		mob.click();
		mob.sendKeys(PropertiesFile.propertieFiles(phone));
		
		WebElement pass=driver.findElement(By.xpath(PropertiesFile.propertieFiles(passwordxpath)));
		pass.click();
		pass.sendKeys(PropertiesFile.propertieFiles(password));
		
		
	}
	public static void checkBox(String checkBox ) throws IOException
	{
		WebElement checkB=driver.findElement(By.xpath(PropertiesFile.propertieFiles(checkBox)));
		checkB.click();
	}
	public static void login(String loginxpath) throws IOException 
	{
		WebElement loginCli=driver.findElement(By.xpath(PropertiesFile.propertieFiles(loginxpath)));
		loginCli.click();
	}
	public static void validationAndClickOk(String okxpath) throws IOException, InterruptedException
	{
		
		
		Thread.sleep(5000);
		//boolean expected=driver.getPageSource().contains(PropertiesFile.propertieFiles(expText));
		
		//String actual=driver.findElement(By.xpath("//div[@class='alert--content error login--alert']")).getText();
//		String act=actual.substring(0, actual.length()-2);
//		
//		System.out.println(act);
		
		//assertEquals(actual, expected);
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PropertiesFile.propertieFiles(okxpath)))));
		 WebElement okk=driver.findElement(By.xpath(PropertiesFile.propertieFiles(okxpath)));
		 okk.click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PropertiesFile.propertieFiles(okxpath))));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='OK']"))));
//		WebElement ok=driver.findElement(By.xpath(PropertiesFile.propertieFiles(okxpath)));
//		
//		ok.click();
	}
	
	public static void forgottenPassword(String forgotpass, String okbutton) throws IOException
	{
		driver.findElement(By.xpath(PropertiesFile.propertieFiles(forgotpass))).click();
//		actual="//div[@class='alert--content error login--alert']";
		String actualtext="There is no accounts exist's with given user name";
		
		String expected=driver.findElement(By.xpath("//div[@class='alert--content error login--alert']")).getText();
		boolean expp=expected.contains(actualtext);
		assertEquals(actual, expp);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(PropertiesFile.propertieFiles(okbutton))).click();
	}
	

}
