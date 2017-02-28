package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hrm.base.HomePage;

public class EmpInfoPage extends HomePage {
	
	public EmpInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(id="empsearch_job_title")
	private WebElement jobTitleListBox;
	
	@FindBy(id="empsearch_termination")
	private WebElement includeListBox;
	
	@FindBy(id="btnDelete")
	private WebElement deleteBtn;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement ok;
	
	@FindBy(id="ohrmList_chkSelectAll")
	private WebElement selectAllCheckBox;
	
	@FindBy(xpath="//td[text()='No Records Found']")
	private WebElement noRecordFoundText;
	
	public void selectEmpcheckBox(String empID)
	{
		String xp="//a[text()='"+empID+"']/../..//input[@type='checkbox']";
		driver.findElement(By.xpath(xp)).click();
	}
	
	public void selectAllCheckBox()
	{
		selectAllCheckBox.click();
	}
	
	public void noRecordFoundText()
	{
		verifyElementIsPresent(noRecordFoundText);
	}
	
	
	public void verifyJobTitleHasNoDuplicate()
	{
		log.info("verify that content of the jobTitle ListBox has duplicates");
	    verifyListBoxHasNoDuplicate(jobTitleListBox, 1);
	    log.info("ListBox has no Duplicates");
	}

	public void verifySearchBtnPresent()
	{
		verifyElementIsPresent(searchBtn);
	}
	
	public void verifyJobTitleIsSorted(){
		
		log.info("verify that content of jobtitle ListBox is Sorted or not");
		verifyListBoxIsSorted(jobTitleListBox, 1);
		log.info("ListBox content is Sorted");
		
	}
	
	public void verifyIncludeListBoxIsSorted()
	{
		log.info("verify that content of include ListBox is Sorted or not");
		verifyListBoxIsSorted(includeListBox, 0);
		log.info("ListBox content is Sorted");
	}
	
	public void verifyIncludeListBoxHasDuplicates()
	{ 
		log.info("verify that content of the Include ListBox has duplicates");
	    verifyListBoxHasNoDuplicate(includeListBox, 0);
	    log.info("ListBox has no Duplicates");
	}
	
	public void clickDelete()
	{
		deleteBtn.click();
	}
	
	public void clickOk()
	{
		ok.click();
	}
	
	public void verifyEmpNotPresent(String empID)
	{
		By loc=By.xpath("//a[text()='"+empID+"']");
		verifyElementIsNotPresent(loc);
	}

}
