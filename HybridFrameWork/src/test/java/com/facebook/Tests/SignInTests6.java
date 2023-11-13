package com.facebook.Tests;

import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.Base.BaseClass;
import com.facebook.Pages.SignIn;
import com.facebook.Utilities.ExcelReader;
import com.facebook.Utilities.Screenshot;

public class SignInTests6 extends BaseClass{
	
	
	
	public static SignIn signin;
	
	
	
	@Test
	public void loginWithBlankCradinital() throws Exception {

		 XSSFSheet sheet = ExcelReader.data();
		 int rowCount = sheet.getPhysicalNumberOfRows();
		 
		 for(int i=1; i<rowCount;i++) {
			 
			 XSSFRow row = sheet.getRow(i);
			 
			 driver = intilizeBroser("facebookURL");
			 
			 signin = new SignIn(driver); 
			 signin.enterEmail(row.getCell(0).getStringCellValue());
			 signin.enterPassword(row.getCell(1).getStringCellValue());
			 
			 Killbrowser();
			
		 }
		 
	}
	
	

}
