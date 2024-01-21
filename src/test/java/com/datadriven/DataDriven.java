package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class DataDriven {
	
	
  private static void getsheetdata() throws IOException {
	  File fi=new File(".\\Excel\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheet=w.getSheetAt(0);
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		
	     CellType cellType = cell.getCellType();
	     if(cellType.equals(CellType.STRING)) {
	    	 
	    	 String stringCellValue = cell.getStringCellValue(); 
	    	 System.out.println(stringCellValue);
	     }else if (cellType.equals(CellType.NUMERIC)) {
	    	 double numericCellValue = cell.getNumericCellValue();
	                 
	    	 int ans= (int) numericCellValue;
	    	 System.out.println(ans);
	    	 
		}
	     w.close();
}
	
	
  private static void excelalldataget() throws IOException {
	  File fi=new File(".\\Excel\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheet=w.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();	
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println("no of header :" + physicalNumberOfRows);
		System.out.println("no of row :"+lastRowNum);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		  
		for (int i = 1; i <= lastRowNum; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = row.getCell(j);
//				data formattter  is used to any adata formato string convert 
//				data passed to sendkeys acces only STRING TYPE ONLY
				DataFormatter dft=new DataFormatter();
				
				String value = dft.formatCellValue(cell);
//				String stringCellValue = cell.getStringCellValue();
			System.out.println(value);
			
			} 
		}
		w.close();
	  
	  
	
	  
}
  
//    WRITE DATA IN EXCEL 
  
  
  
  private static void writedata() throws Exception {
	  
	   File f = new File("E:\\RAJ-PROCESS JOB\\Book1.xlsx");

       FileInputStream fis = new FileInputStream(f);
       Workbook wb = new XSSFWorkbook(fis);

       // Creating a new sheet named "WriteData"
       Sheet sheet = wb.createSheet("WriteData-2");

       String[] dd = {"name", "age", "location"};
       String[] nameStrings = {"raji", "ranjith", "rajkumar"};
       int[] ageStrings = {25, 28, 32};
       String[] locStrings = {"chennai", "singapore", "poompuhar"};

       // Writing header row
       Row headerRow = sheet.createRow(0);
       for (int i = 0; i < dd.length; i++) {
           headerRow.createCell(i).setCellValue(dd[i]);
       }

       // Writing data rows
       for (int j = 0; j < nameStrings.length; j++) {
           Row dataRow = sheet.createRow(j + 1);
           dataRow.createCell(0).setCellValue(nameStrings[j]);
           dataRow.createCell(1).setCellValue(ageStrings[j]);
           dataRow.createCell(2).setCellValue(locStrings[j]);
       }

       // Writing the changes to the file
       FileOutputStream fos = new FileOutputStream(f);
       wb.write(fos);

       // Closing the streams
       fos.close();
       wb.close();

       System.out.println("Write successfully");

	}
	



  
 
	
	
	
	
public static void main(String[] args) throws Exception {
	
	getsheetdata();
	
	excelalldataget();

writedata();
	
}
}
