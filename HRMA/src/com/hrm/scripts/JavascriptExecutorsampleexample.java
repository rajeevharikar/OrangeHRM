package com.hrm.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.hrm.base.AutomationConstants;

public class JavascriptExecutorsampleexample implements AutomationConstants{
	
	public static void main(String[] args) {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/textjavascriptexample.html");
		JavascriptExecutor j= (JavascriptExecutor) driver;
		//1
		//j.executeScript("document.getElementById('t1').value='rajeev'");
		
		//2
		//j.executeScript("document.getElementById('t1').value=arguments[0]", "rajeev");
		
		//3
		WebElement ele=driver.findElement(By.id("t1"));
		//j.executeScript("arguments[0].value='rajeev'",ele);
		
		//4
		j.executeScript("arguments[0].value=arguments[1]",ele,"rajeev");
		
	}
	
}
