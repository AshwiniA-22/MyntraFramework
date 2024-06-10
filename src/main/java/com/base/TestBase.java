package com.base;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.keyword.Config;
import com.keyword.KeywordC;

public class TestBase {
	
	
	public final static KeywordC key= new KeywordC();
	
	@BeforeMethod
	public void setUp() {
		Config conf=new Config();
		key.openBrowser(conf.getBrowserName());
		key.launchUrl(conf.getappUrl());
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notification");

	}
//	
//	@AfterMethod
//	public void tearDown()  {
//	key.quitBrowser();

	}


