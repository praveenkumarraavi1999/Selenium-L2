package propertie;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static String propertieFiles(String key) throws IOException
	{
		String filepath=System.getProperty("user.dir")+"/src/testUtilities/config.properties";
	FileInputStream fis=new FileInputStream(filepath);
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key).trim();
	
	
	
	
	
	}
	

}
