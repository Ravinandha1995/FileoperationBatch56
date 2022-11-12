package org.filoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesData {
	
 public static String getPropertyData(String key) throws Exception {
		File F = new File(System.getProperty("user.dir")
				+"/java/new/project1/batch56.properties");
		FileReader fr = new FileReader(F);
		
		Properties prop = new Properties();
		prop.load(fr);
		String name = prop.getProperty(key);
		System.out.println(name);
		return name;
	}
	
	public static void main(String[] args) throws Exception {
		String name_two = getPropertyData("name_two");
	}

}
