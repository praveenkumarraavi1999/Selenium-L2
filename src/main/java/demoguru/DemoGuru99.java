package demoguru;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.BrowserLanch;
import propertie.PropertiesFile;

public class DemoGuru99 extends BrowserLanch{
	
	public static void rownsAndColumns(String rows, String columnz) throws IOException
	{
		 //WebElement row=driver.findElement(By.xpath(PropertiesFile.propertieFiles(rows)));
		 List<WebElement> rowz=driver.findElements(By.xpath(PropertiesFile.propertieFiles(rows)));
		 System.out.println(rowz.size());
		
		System.out.println(rows);
		
		List<WebElement> colum=driver.findElements(By.xpath(PropertiesFile.propertieFiles(columnz)));
		System.out.println(colum.size());
	}

}
