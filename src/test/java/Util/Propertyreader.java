package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyreader {

	String rootpath = System.getProperty("user.dir");
	String value=" ";
	public String readPropertyFile(String key) throws Exception{
		Properties pr = new Properties();
		String exactpath = rootpath+"//src//test//java//Influensterwebconfig//application.properties";
		File file = new File(exactpath);
		try {
			if(file.exists()){
				pr.load(new FileInputStream(file));
				value = pr.getProperty(key);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Failed to read from application.properties file.");  
		}
		return value;
	}
}