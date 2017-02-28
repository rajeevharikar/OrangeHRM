package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.LocalizationPage;
import com.hrm.pages.LocalizitPage;

import generics.Utility;

public class SwitchToLocalizationWindow extends BaseTest {
	
	@Test
	public void switchToLocalizationWindow() throws InterruptedException
	{
	   DashboardPage dbPage= new DashboardPage(driver);
	   
	   dbPage.clickAdmin_Menu();
	   Thread.sleep(2000);
	   dbPage.hoverConfigurationBtn();
	   Thread.sleep(2000);
	   dbPage.clickLocalizationBtn();
	   
	   LocalizationPage lzPage= new LocalizationPage(driver);
	   
	   lzPage.clickLanguageLink();
	   boolean b = lzPage.switchToBrowser();
	   if(b)
	   {
		   LocalizitPage lpage= new LocalizitPage(driver);
		   lpage.checkLanguageListIsSorted();
		   boolean mh = Utility.switchBrowser(driver, "OrangeHRM");
		   if(mh)
		   {
			   dbPage.logout();
			   log.info("logged out succesfully");
		   }
	   }
	   else
	   {
		   System.out.println("no Browser found");
	   }
	   
	   
	}

}
