package com.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.base.TestBase;
import com.keyword.KeywordC;

public class OpenLargeViewPage extends SearchProductPage {

	@FindBy(xpath ="(//img[@class='img-responsive'])[1]")
	public WebElement product;

	@FindBy(css = "svg.iz-news-hub-bell")
	public WebElement bell;

	public OpenLargeViewPage() {
		PageFactory.initElements(TestBase.key.driver, this);
	}

	
	public void clickOnSingleItem() {
		product.click();

	}
//	public void clickonBellIcon() {
//		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(TestBase.key.driver);
//		wait.withTimeout(Duration.ofSeconds(60));
//		wait.withMessage("Element not appear");
//		wait.pollingEvery(Duration.ofMillis(500));
//		wait.ignoring(NoSuchElementException.class);
//		
//		wait.until(ExpectedConditions.visibilityOf(bell));
//		bell.click();
//
//	}
}
