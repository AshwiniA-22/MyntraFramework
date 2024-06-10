package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class FiltersPage extends SearchProductPage {
	
	@FindBy(xpath="//label[@class=\"common-customRadio gender-label undefined\"]")
	public WebElement women;
	
	
	public FiltersPage() {
		PageFactory.initElements(TestBase.key.driver, this);
	}

	public void clickOnWomenFilter() {
		women.click();

	}
}
