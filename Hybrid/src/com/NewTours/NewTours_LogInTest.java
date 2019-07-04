package com.NewTours;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest {
	
	@Test
	public void logIn() throws IOException
	{
FileInputStream file1 = new FileInputStream
					("./src/com/ApplicationTestDataFiles/NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
		
		// Identifying the properties file in the System
		FileInputStream file = new FileInputStream("./NewTours.properties");
		
		// Creating a Properties class Object
		Properties pr = new Properties();
		// Using the Properties class Object loading the properties file
		pr.load(file);		
		
		// identifying the element based on the properties from the properties file
driver.findElement(By.name(pr.getProperty("UserName"))).
											sendKeys(row.getCell(0).getStringCellValue());
driver.findElement(By.name(pr.getProperty("Password"))).
											sendKeys(row.getCell(1).getStringCellValue());

		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		
		String expected_Title="Find";
		System.out.println(" The expected title after login is : "+expected_Title);
							
			String actual_Title=driver.getTitle();
		System.out.println(" The actual title after logIn is : "+actual_Title);
							
			if (actual_Title.contains(expected_Title))
			{
				System.out.println(" LogIn Successfull - PASS");
				row.createCell(2).setCellValue("LogIn Successfull - PASS");
			}
			else
			{
				System.out.println(" LogIn Failed - FAIL");
				row.createCell(2).setCellValue("LogIn Failed - FAIL");
			}
			
FileOutputStream file2 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTestResult.xlsx");
			workBook.write(file2);
			
			driver.navigate().back();
		}
	}


}
