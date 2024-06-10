package com.testingPurpose;


import java.util.Set;


import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.TestBase;

import com.keyword.Config;
import com.keyword.KeywordC;
import com.keyword.Locator;
import com.pages.AddToCartPage;
import com.pages.FiltersPage;
import com.pages.OpenLargeViewPage;
import com.pages.LoginPage;
import com.pages.SearchProductPage;
import com.utilities.PropUtil;

public class TestCases extends TestBase {

	@Test
	public void verifyLogin() throws InterruptedException {
		// KeywordC key= new KeywordC();
		Config conf = new Config();
		String dir = System.getProperty("user.dir");
		String filepath = dir + "/src/test/resources/Locators.properties";
		PropUtil prop = new PropUtil(filepath);

		key.enterText(Locator.MOBNO, "8830042609");
		key.clickOnBtn(Locator.CONTINUE);
	}

	@Test
	public void VerifyLoginUsingPOM() {
		LoginPage login = PageFactory.initElements(KeywordC.driver, LoginPage.class);
		login.enterMobNo("8830042617");
		login.clickOnContinueBtn();
	}

	@Test
	public void verifyErrMsgWrongMobNo() {
		String expectederrmsg = "Please enter a valid mobile number (10 digits)";
		LoginPage login = new LoginPage();
		login.enterMobNo("000000000");
		login.clickOnContinueBtn();
		String actualmsg = login.getErrormsg();
		Assert.assertEquals(actualmsg, expectederrmsg);
	}

	@Test
	public void verifyProduct() {
		SearchProductPage prod = new SearchProductPage();
		prod.eneterProductName("Women puma");
		String count = prod.getCountOfProducts();
		System.out.println("Women Puma count :" + count);
		prod.selectByCategory();
		prod.selectByColor();

	}

	
	@Test
	public void verifyAddToCart() throws InterruptedException {
		AddToCartPage cart = new AddToCartPage();
		cart.eneterProductName("puma");
		cart.clickOnItem();
		String handle = TestBase.key.driver.getWindowHandle();
		

		Set<String> handles = TestBase.key.driver.getWindowHandles();
		
		for (String string : handles) {
		if (string.contentEquals(handle)) {
			System.out.println("ignoring Originalhandle");
		} else {
			
			TestBase.key.driver.switchTo().window(string);
			cart.clickOnSize();
			cart.clickOnAddToBag();

		}
			
		}
		
		}

	@Test
	public void verifyLargeView() {
		OpenLargeViewPage offer = new OpenLargeViewPage();
		offer.eneterProductName("puma");
		offer.clickOnSingleItem();

	}
	
	@Test
	public void verifyWomenFilterAppliedOrNot() {
		FiltersPage filter=new FiltersPage();
		filter.eneterProductName("levis");
		filter.clickOnWomenFilter();

	}
}