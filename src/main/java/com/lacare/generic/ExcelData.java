package com.lacare.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String filePath, String sheetName, int rn, int cn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			String data = sh.getRow(rn).getCell(cn).toString();
			return data;
		} 
		catch (Exception e) 
		{
			return "";
		}
	}
	
	
	public static int getRowCount(String filePath, String sheetName)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			int rc = WorkbookFactory.create(fis).getSheet(sheetName).getLastRowNum();
			return rc;
		}
		catch (Exception e)
		{
			return 0;
		}
	}

	
	public static int getCellCount(String filePath, String sheetName, int rn)
	{
	
		try {
			FileInputStream fis = new FileInputStream(new File(filePath));
			Row r = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rn);
			int cc = r.getLastCellNum();
			return cc;
		} 
		catch (Exception e)
		{
			return 0;
		}
	}
}