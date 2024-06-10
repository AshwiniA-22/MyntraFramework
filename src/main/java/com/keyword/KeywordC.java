package com.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KeywordC {

	public static RemoteWebDriver driver;

	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser name" + browserName);
			throw new InvalidBrowserNameError(browserName);
		}
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterText(String xpath, String mobno) {
		driver.findElement(By.xpath(xpath)).sendKeys(mobno);
	}

	public void clickOnBtn(String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}

	public void closeBrowser() {
		driver.close();

	}

	public void quitBrowser() {
		driver.quit();

	}

}
