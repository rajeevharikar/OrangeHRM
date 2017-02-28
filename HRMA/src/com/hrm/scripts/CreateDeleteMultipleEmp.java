package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PersonalDetailsPage;

import generics.Utility;

public class CreateDeleteMultipleEmp extends BaseTest{
	
	@Test
	public void testCreateDeleteEmp() throws InterruptedException
	{
	DashboardPage dbPage= new DashboardPage(driver);
	dbPage.clickPIM_Menu();
	AddEmpPage aePage= new AddEmpPage(driver);
	EmpInfoPage eiPage= new EmpInfoPage(driver);
	eiPage.clickAddemp_Menu();
	
	int rc= Utility.getExcelRowCount(INPUT_PATH, "Emp");
	for(int i=1;i<=rc;i++)
	{
	String fn = Utility.getExcelCellValue(INPUT_PATH, "Emp", i, 0);
	String ln = Utility.getExcelCellValue(INPUT_PATH, "Emp", i, 1);
	aePage.setFirstname(fn);
	aePage.setlasttname(ln);
	aePage.clickSave();
	eiPage.clickAddemp_Menu();
	}
	PersonalDetailsPage pdPage= new PersonalDetailsPage(driver);
	
	pdPage.clickEmpList_Menu();
    Thread.sleep(3000);
	eiPage.selectAllCheckBox();
	eiPage.clickDelete();
	eiPage.clickOk();
	eiPage.noRecordFoundText();
	}
}
