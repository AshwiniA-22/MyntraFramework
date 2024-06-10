package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class can be used to readproperties file.
 */

public class PropUtil {
	private String filepath;
	/**
	 * This method is used to get value of specified key
	 * 
	 * @param filepath from which you want to read value
	 * @param key      for which you need value
	 * @return
	 */
	public PropUtil (String locatorFile) {
		filepath=locatorFile;

	}
	public PropUtil(){
		
	}
	
	
	public String getValue(String filepath, String key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
	//Handling code
		}
		Properties prop= new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			//Handling code
		}
		String value=prop.getProperty(key);
		return value;

	}
	/**
	 * This method can be used along with {@code PropUtil (String filepath)}
	 * This method can read file which is initilized during object creation
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getValue(String key)throws IOException {
		FileInputStream fis= new FileInputStream(filepath);
		Properties prop =new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}
	
}
