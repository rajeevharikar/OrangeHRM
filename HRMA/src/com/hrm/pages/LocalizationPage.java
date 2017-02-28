package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

import generics.Utility;

public class LocalizationPage extends HomePage{
	
	@FindBy(xpath="//a[text()='Language and font help']")
	private WebElement languageLink;

	public LocalizationPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickLanguageLink()
	{
		languageLink.click();
	}
	
	public boolean switchToBrowser()
	{
		String eTitle="Orange - Localizit";
		return Utility.switchBrowser(driver, eTitle);
	}
	

}
