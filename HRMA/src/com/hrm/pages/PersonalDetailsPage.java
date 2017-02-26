package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hrm.base.HomePage;

public class PersonalDetailsPage extends HomePage {
	
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName;
	
	@FindBy(id="personal_txtEmployeeId")
	private WebElement empID;
	
	public PersonalDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyFirstName(String eFN)
	{
		String aFN=firstName.getAttribute("value");
		Assert.assertEquals(aFN, eFN);
	}
	
	public String getEmpid(){
		return empID.getAttribute("value");
	}

	
}
