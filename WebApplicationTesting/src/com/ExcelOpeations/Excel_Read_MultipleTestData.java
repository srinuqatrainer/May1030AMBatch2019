package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) // to goto every Row
		{
			Row r=sheet.getRow(i); // in the sheet going to a Row
	int cellCount=r.getLastCellNum(); // in the Row finding all the active Cells with data
			
			for(int j=0;j<cellCount;j++) // to goto every Row of All the Cells
			{
				String data=r.getCell(j).getStringCellValue(); // get the data from row of cell
				System.out.print(data+" ");
			}
			System.out.println(); 
		}
		

	}

}
