package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven1 {

	private static void demo() throws Exception {
		File f = new File("E:\\RAJ-PROCESS JOB\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("WriteData-11");

		String[] dd = { "firstname", "age", "location" };
		String[] firstname = { "raji", "ranjith", "rajkumar" };
		String[] lastname = { "anjappan", "anjappan", "anjappan" };
		int[] ageStrings = { 25, 28, 32 };
		String[] locStrings = { "chennai", "singapore", "poompuhar" };

		// Writing header row

		for (int i = 0; i < dd.length; i++) {
			wb.getSheet("WriteData-11").createRow(0).createCell(i).setCellValue(dd[i]);


		for (int j = 1; j < firstname.length; j++) {

			wb.getSheet("WriteData-11").createRow(j).createCell(0).setCellValue(firstname[j]);
			wb.getSheet("WriteData-11").createRow(j).createCell(1).setCellValue(ageStrings[j]);
			wb.getSheet("WriteData-11").createRow(j).createCell(2).setCellValue(locStrings[j]);
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
	}
	public static void main(String[] args) throws Exception {
		demo();
	}

}

