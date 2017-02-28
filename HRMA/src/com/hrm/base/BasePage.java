package com.hrm.base;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generics.Utility;

public abstract class BasePage {
  public Logger log=Logger.getLogger(this.getClass());
  public long timeout=Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
  public WebDriver driver;
  public WebDriverWait wait;
 
  public BasePage(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  wait=new WebDriverWait(driver,timeout);
  }
  
  public void verifyElementIsPresent(WebElement element)
  {
	  boolean present = Utility.verifyElementIsPresent(driver, element);
	 Assert.assertTrue(present);
	 log.info("Element is present");
  }
  
  public void verifyElementIsNotPresent(By locator)
  {
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		  log.error("FAIL: Element is Present");
		  Assert.fail();
	  }
	  catch(Exception e)
	  {
		  log.info("PASS: Element is not Present");
	  }
  }
  
  public void verifyListBoxHasNoDuplicate(WebElement listBox, int startindex)
  {
	  ArrayList<String> allText= Utility.getAllTextFromListBox(listBox, startindex);
	  boolean hasDuplicate = Utility.ArrayListBoxHasDuplicate(allText);
	  Assert.assertFalse(hasDuplicate, "ListBox has Duplicates");
			  
  }
  public void verifyListBoxIsSorted(WebElement listBox,int startindex)
  {
	  ArrayList<String> allText= Utility.getAllTextFromListBox(listBox, startindex);
	  boolean sorted = Utility.checkArrayListIsSorted(allText);
	  Assert.assertTrue(sorted, "ListBox is not Sorted");
  }
  
  public void waitAndClick(WebElement element)
  {
	  wait.until(ExpectedConditions.elementToBeClickable(element));
	  element.click();
  }
  
  public void verifyURLhas(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
  }
  
}
