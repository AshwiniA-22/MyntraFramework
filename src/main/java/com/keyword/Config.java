package com.keyword;

import java.io.IOException;

import com.utilities.PropUtil;

public class Config {

	public String getBrowserName() {
		return readProperty("browser_name");
	}

	public String getappUrl() {
		return readProperty("app_url");

	}

	private String readProperty(String property) {
		String basedir = System.getProperty("user.dir");
		PropUtil prop = new PropUtil(basedir + "/src/main/resources/Config.properties");
		String browserName = null;
		try {
			browserName = prop.getValue(property);
		} catch (IOException e) {

		}
		return browserName;
	}

}
