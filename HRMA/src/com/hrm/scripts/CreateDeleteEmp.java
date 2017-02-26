package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PersonalDetailsPage;

public class CreateDeleteEmp extends BaseTest{
	
	@Test
	public void testCreateDeleteEmp() throws InterruptedException
	{
	DashboardPage dbPage= new DashboardPage(driver);
	dbPage.clickPIM_Menu();
	
	EmpInfoPage eiPage= new EmpInfoPage(driver);
	eiPage.clickAddemp_Menu();
	
	AddEmpPage aePage= new AddEmpPage(driver);
	
	aePage.setFirstname("rajeev2");
	aePage.setlasttname("harikar");
	aePage.clickSave();
	
	PersonalDetailsPage pdPage= new PersonalDetailsPage(driver);
	pdPage.verifyFirstName("rajeev2");
	
	String empID=pdPage.getEmpid();
	pdPage.clickEmpList_Menu();
    Thread.sleep(3000);
	eiPage.selectEmpcheckBox(empID);
	eiPage.clickDelete();
	eiPage.clickOk();
	eiPage.verifyEmpNotPresent(empID);
	}
}
