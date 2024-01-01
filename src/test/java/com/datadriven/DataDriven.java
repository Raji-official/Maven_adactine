package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("no of header :" + physicalNumberOfRows);
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
  
//  
//	private static void writedata(String excelpath,int rownumber ,int columnumber,String data) throws IOException {
//		try {
//			
//	
//		 File fi=new File(excelpath);
//			FileInputStream fis=new FileInputStream(fi);
//			Workbook w=new XSSFWorkbook(fis);
//			Sheet sheet=w.getSheetAt(0);
//			Row row = sheet.getRow(rownumber);
//			Cell cell = row.getCell(columnumber,org.apache.poi.ss.usermodel.Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
//	     
//			
//			if (cell==null) {
//				row.createCell(columnumber);
//				cell.setCellValue(data);
//			}else {
//				cell.setCellValue(data);
//			}
//			
//			FileOutputStream out=new FileOutputStream(fi);
//			w.write(out);
//			w.close();
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
////			System.out.println("error");
//			
//		}
//		   
//		}
//
//
//	
//	
	
	
	
	
public static void main(String[] args) throws IOException {
	
	getsheetdata();
	
	excelalldataget();
	
	String excelpath=".\\Excel\\Book1.xlsx";
//	writedata(excelpath, 4, 1, "kumar");
	
}
}
