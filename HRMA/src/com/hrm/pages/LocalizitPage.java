package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

import generics.Utility;

public class LocalizitPage extends HomePage {

	@FindBy(id="languageList")
	private WebElement languageList;

	public LocalizitPage(WebDriver driver) {
		super(driver);
	}

	public void checkLanguageListIsSorted() throws InterruptedException
	{
		verifyListBoxIsSorted(languageList, 1);
		Thread.sleep(2000);
		driver.close();
	}
}
