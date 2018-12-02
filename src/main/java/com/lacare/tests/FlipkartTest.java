package com.lacare.tests;

import org.testng.annotations.Test;

import com.lacare.generic.BaseTest;
import com.lacare.generic.ExcelData;
import com.lacare.pages.FlipkartPage;

public class FlipkartTest extends BaseTest
{
	@Test(priority=1)
public void flipkartlogin()
{
	String un = "vinod";
	String pw = "vinod";
	
	FlipkartPage fp = new FlipkartPage(driver);
	fp.clickloginbutton();
	fp.enterusername(un);
	fp.enterpassword(pw);
	
}	
}
