package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.keyword.KeywordC;

public class LoginPage {
	
	@FindBy(xpath="//input[@class=\"form-control mobileNumberInput\"]")
	public WebElement mobNo;
	
	@FindBy(xpath="//div[@class=\"submitBottomOption\"]")
	public WebElement continue1;
	
    @FindBy(xpath="//div[@class=\"errorContainer\"]")   
	public WebElement errormsg;
	
	public LoginPage() {
		PageFactory.initElements(TestBase.key.driver, this);
	}
	
	public void enterMobNo(String text) {
		mobNo.sendKeys(text);

	}
	
	public void clickOnContinueBtn() {
		continue1.click();

	}
	
	public String  getErrormsg() {
		return errormsg.getText();
	}
}
