package com.lacare.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/**
	 * To verify the title of the webpage
	 * @param eTitle
	 */
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching: "+eTitle,true);
		}
		catch (Exception e) 
		{
			Reporter.log("Title is not matching; Expected title is:"+eTitle,true);
			Reporter.log("Actual title is: "+driver.getTitle(),true);
			Assert.fail();
		}
	}
	
	/**
	 * To verify whether the specified element is present or not
	 * @param element
	 */
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present.......",true);
		}
		catch (Exception e) 
		{
			Reporter.log("Element is not present..........",true);
			Assert.fail();
		}
	}
}
