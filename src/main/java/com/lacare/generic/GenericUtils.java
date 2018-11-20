package com.lacare.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	/**
	 * To take the screen shots of the webpage
	 * @param driver
	 * @param name
	 * @author Rakesh
	 */
	public static void getScreenShot(WebDriver driver, String name)
	{
		try 
		{
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./screenshots/"+name+".png"));
		}
		catch (IOException e) {
		}
	}
	
	/**
	 * To select the options from the list box using index
	 * @param element
	 * @param index
	 *@author Rakesh
	 */
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * To select the options from the list box using value
	 * @param element
	 * @param value
	 * @author Rakesh
	 */
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * To select the options from the list box using visible text
	 * @param element
	 * @param text
	 * @author Rakesh
	 */
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
}
