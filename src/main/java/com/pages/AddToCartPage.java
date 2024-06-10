package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class AddToCartPage extends SearchProductPage {

	@FindBy(xpath = "(//img[@class='img-responsive'])[1]")
	public WebElement itemImage;

	@FindBy(xpath = "//p[number()='10']")
	public WebElement size;

	@FindBy(xpath = "//div[starts-with(@class,'pdp-add-to-bag')]")
	public WebElement addToBag;

	public AddToCartPage() {
		PageFactory.initElements(TestBase.key.driver, this);
	}

	public void clickOnItem() {
		itemImage.click();
	}

	public void clickOnSize() {
		size.click();
	}

	public void clickOnAddToBag() {
		addToBag.click();

	}
}
