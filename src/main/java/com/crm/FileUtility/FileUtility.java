package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String excel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fls=new FileInputStream("/pricTasks/src/main/resources/executable.properties");
	   Workbook wb=WorkbookFactory.create(fls);
	   org.apache.poi.ss.usermodel.Sheet  sheet = wb.getSheet("Sheet1");
	   
	 String s= sheet.getRow(row).getCell(cell).toString();
	 return s;
	
	}

}
