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
  
  
  
  private static void demo() throws Exception {
	   File f = new File("E:\\RAJ-PROCESS JOB\\Book1.xlsx");

       FileInputStream fis = new FileInputStream(f);
       Workbook wb = new XSSFWorkbook(fis);
       wb.createSheet("WriteData-10");

       String[] dd = {"firstname", "age", "location"};
       String[] firstname = {"raji", "ranjith", "rajkumar"};
       String[] lastname = {"anjappan", "anjappan", "anjappan"};
       int[] ageStrings = {25, 28, 32};
       String[] locStrings = {"chennai", "singapore", "poompuhar"};
       
       // Writing header row
       
       for (int i = 0; i < dd.length; i++) {
    	   wb.getSheet("WriteData-10").createRow(0).createCell(i).setCellValue(dd[i]);
    	
       }
       for (int j = 1; j < firstname.length; j++) {
	          
    	   wb.getSheet("WriteData-10").createRow(j).createCell(0).setCellValue(firstname[j]);
    	   wb.getSheet("WriteData-10").createRow(j).createCell(1).setCellValue(lastname[j]);
    	   wb.getSheet("WriteData-10").createRow(j).createCell(1).setCellValue(ageStrings[j]);
    	   wb.getSheet("WriteData-10").createRow(j).createCell(2).setCellValue(locStrings[j]);
       }
       // Writing data rows
     

       // Writing the changes to the file
       FileOutputStream fos = new FileOutputStream(f);
       wb.write(fos);

       // Closing the streams
       fos.close();
       wb.close();

       System.out.println("Write successfully method-1");

}
  
  
  
  
  
  
  
  
  private static void writedata() throws Exception {
	   File file = new File("C:\\Users\\Welcome\\Desktop\\Book2.xlsx");

       try (FileInputStream fis = new FileInputStream(file);
            Workbook wb = new XSSFWorkbook(fis)) {

           // Check if sheet already exists, if not, create it
           Sheet sheet = wb.getSheet("WriteData-1");
           if (sheet == null) {
               sheet = wb.createSheet("WriteData-1");
           }

           String[] dd = {"name", "age", "location"};
           String[] nameStrings = {"raji", "ranjith", "rajkumar", "ramu"};
           int[] ageStrings = {25, 28, 32, 35};
           String[] locStrings = {"chennai", "singapore", "poompuhar", "poompuhar"};

           // Writing header row
           Row h_row = sheet.createRow(0);
           for (int i = 0; i < dd.length; i++) {
               h_row.createCell(i).setCellValue(dd[i]);
           }

           // Writing data rows
           for (int j = 0; j < nameStrings.length; j++) {
               Row row = sheet.createRow(j + 1);
               row.createCell(0).setCellValue(nameStrings[j]);
               row.createCell(1).setCellValue(ageStrings[j]);
               row.createCell(2).setCellValue(locStrings[j]);
           }

           // Writing the changes to the file
           try (FileOutputStream fos = new FileOutputStream(file)) {
               wb.write(fos);
               fos.close();
               wb.close();
               System.out.println("Write successfully method-2");
           }

         

       } catch (IOException e) {
           e.printStackTrace();
       }

	}
	



  
  private static void singleWriteData() throws IOException {
		
		File f = new File("E:\\RAJ-PROCESS JOB\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
//		wb.createSheet("WriteData-5");
		
		wb.getSheet("WriteData-5").getRow(0).createCell(1).setCellValue("THENDRAL");
	
		wb.getSheet("WriteData-5").createRow(1).createCell(0).setCellValue("PASSWORD");
		
		wb.getSheet("WriteData-5").getRow(1).createCell(1).setCellValue("thendo");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		
		System.out.println("Write successfully");
		
		wb.close();

	}

	
	
	
	
public static void main(String[] args) throws Exception {
//	
//	getsheetdata();
//
//	
//	excelalldataget();
////	demo();
//	singleWriteData();
	
writedata();

	
}
}
