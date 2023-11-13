package com.facebook.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.facebook.Base.BaseClass;

public class ExcelReader {
	
	public static XSSFSheet data() throws IOException {
		
		
		// Specify The Location of The File 
		File source = new File(".\\src\\test\\resources\\Excel\\Facebookd.xlsx");
		
		//Create Fis Object and Pass the Source
		FileInputStream fis = new FileInputStream(source);
		
		//Load the Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//Load Sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Get The Name of Loaded Sheet
		System.out.println("Sheet Name:-  " + sheet.getSheetName());
		
		//To get Total Number of rows Present in the Table
		System.out.println("Total Number of Rows:-  " + sheet.getPhysicalNumberOfRows());
		
		//To get First Number of row Present in the Table
		System.out.println("First Number of Rows:-  " + sheet.getFirstRowNum());
		
		//To get The Last Number of row Present in the Table
		System.out.println("Last Number of Rows:-  " + sheet.getLastRowNum());
		
		return sheet;
		
	}

}
