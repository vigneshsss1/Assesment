package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {

	public static  String  readConfig(String key) throws FileNotFoundException, IOException {
		
		
		Properties p= new Properties();
		
		p.load(new FileInputStream("./configuration/config.properties"));
			
		
		return p.getProperty(key);
			
		
		
	

		}
		
	}
	

