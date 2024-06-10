package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class SearchProductPage {

	@FindBy(css = "input[placeholder=\"Search for products, brands and more\"]")
	public WebElement searchbox;

	@FindBy(css = "span.title-count")
	public WebElement productCount;

	@FindBy(css = "input[value=\"Shorts\"]")
	public WebElement categoryFilter;

	@FindBy(xpath = "//div[@id='mountRoot']/descendant::input[@value='Shorts']")
	public WebElement checkBox;

	// WebElement checkbox= TestBase.key.driver.findElement(By.xpath(""));

	@FindBy(xpath="//span[@data-colorhex='pink']")
	public WebElement color;
	
	@FindBy(xpath = "//input[@value=\"1724.0 TO 2849.0\"]")
	public WebElement price;

	public SearchProductPage() {
		PageFactory.initElements(TestBase.key.driver, this);
	}

	public void eneterProductName(String text) {
		searchbox.sendKeys(text, Keys.ENTER);
	}

	public String getCountOfProducts() {
		return productCount.getText();

	}

	public void selectByCategory() {
		usingjavaScript(checkBox);

	}
	
	
	public void selectByColor() {
		usingjavaScript(color);

	}
	public void selectFilterPrize() {
		usingjavaScript(price);

	}

	public static void usingjavaScript(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) TestBase.key.driver;
		js.executeScript("arguments[0].click()", ele);

	}

}
