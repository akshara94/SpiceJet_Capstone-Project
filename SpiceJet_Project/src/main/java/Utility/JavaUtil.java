package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class JavaUtil {
	
	
	//create property filepath locations
	
	public String getValue(String key) throws Throwable {
		
	    String filepath = System.getProperty("user.dir") + "/config.properties.txt"; 
		String Value = null;	
		
		try {
	    Properties prop = new Properties();		
		
			FileInputStream instream = new FileInputStream(filepath);

			prop.load(instream);
			Value = prop.getProperty(key);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Value;
		
		}

}
