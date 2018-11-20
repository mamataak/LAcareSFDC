package com.lacare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lacare.generic.BasePage;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="username")
	private WebElement userNameTB;
	
	@FindBy(id="password")
	private WebElement passwordTB;
	
	@FindBy(id="Login")
	private WebElement loginBTN;
	
	@FindBy(xpath="[.='Remind Me Later']")
	private WebElement remindME;
	//initialization
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void enterUserName(String un)
	{
		userNameTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	public void clickOnRemindMe()
	{
		remindME.click();
	}
	
}
