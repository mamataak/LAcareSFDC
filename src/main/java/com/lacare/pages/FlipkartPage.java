package com.lacare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lacare.generic.BasePage;

public class FlipkartPage extends BasePage
{
	@FindBy(xpath="//a[.='Login & Signup']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	private WebElement usernameTB;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTB;

	public FlipkartPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickloginbutton()
	{
		loginBTN.click();
	}
public void enterusername(String un)
{
	usernameTB.sendKeys(un);
}
	
public void enterpassword(String pw)
{
	passwordTB.sendKeys(pw);
}

}
