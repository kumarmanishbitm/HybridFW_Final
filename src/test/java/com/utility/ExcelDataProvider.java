package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File file= new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel file "+e.getMessage());
			
		}
	}
	
	public String getStringData(String sheetName, int row, int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
