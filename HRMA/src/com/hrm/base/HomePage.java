package com.hrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import generics.Utility;

public abstract class HomePage extends BasePage{

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement empList_Menu;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement admin_Menu;
	
	@FindBy(id="menu_admin_Configuration")
	private WebElement configurationBtn;
	
	@FindBy(id="menu_admin_localization")
	private WebElement localozationBtn;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickPIM_Menu()
	{
		pim_Menu.click();
	}
	
	public void clickAddemp_Menu()
	{
		addEmp_Menu.click();
	}
	
	public void clickEmpList_Menu()
	{
		empList_Menu.click();
	}
	
	public void clickAdmin_Menu()
	{
		admin_Menu.click();
	}
	
	public void hoverConfigurationBtn()
	{
		Actions actions= new Actions(driver);
		actions.moveToElement(configurationBtn).perform();;
	}
	
	public void clickLocalizationBtn()
	{
	   waitAndClick(localozationBtn);
	}

	public void logout(){
		Utility.clickUsingJS(driver, welcome);
		//logout.click();
	}
}
