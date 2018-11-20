package com.lacare.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility
{
	public Actions act;
	
	public ActionsUtility(WebDriver driver)
	{
		act = new Actions(driver);
	}
	
	public void moveToElment(WebElement target)
	{
		act.moveToElement(target).perform();
	}
	
	public void doubleClick(WebElement target)
	{
		act.doubleClick(target).perform();
	}
}
;