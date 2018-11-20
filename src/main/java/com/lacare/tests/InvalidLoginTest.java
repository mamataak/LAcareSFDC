package com.lacare.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.lacare.generic.BaseTest;
import com.lacare.generic.ExcelData;
import com.lacare.pages.LoginPage;
@Ignore

public class InvalidLoginTest extends BaseTest
{
	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException
	{
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String eErrMessge = ExcelData.getData(file_path, "TC02", 1, 2);
		LoginPage lp = new LoginPage(driver);
		
		//verify login page
		lp.verifyTheTitle(loginTitle);
		
		int rc = ExcelData.getRowCount(file_path, "TC02");
		
		for(int i=1;i<=rc;i++)
		{
			String un = ExcelData
					.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			
			Reporter.log("UserName: "+un,true);
			Reporter.log("Password: "+pw,true);
			
			//Enter invalid username
			lp.enterUserName(un);
			
			//Enter invalid password
			lp.enterPassword(pw);
			
			//click on Login
			lp.clickOnLogin();
			
			
			
			Thread.sleep(2000);
			Reporter.log("===================================================",true);
		}
	}
}
