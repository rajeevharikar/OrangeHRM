package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class VerifyJobTitleIsSorted extends BaseTest {
	
	@Test
	public void verifyJobTitleIsSorted()
	{
		DashboardPage dbPage= new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		
		EmpInfoPage eiPage= new EmpInfoPage(driver);
		eiPage.verifyJobTitleIsSorted();
		
		eiPage.verifyJobTitleHasNoDuplicate();
		
	}
	

}
