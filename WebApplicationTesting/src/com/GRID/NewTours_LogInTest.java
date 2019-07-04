package com.GRID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_LogInTest {
	
	@Parameters("Browser")
	@Test
	public void logIn(String browser) throws IOException  
	{
		 // Node Info
// DesiredCapabilities - should be specified with the Browser and the platform(OS) on which
		 			//    Test should be Executed	
		
		System.out.println(" The browser name is :"+browser);
		
		DesiredCapabilities cap = null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
RemoteWebDriver driver = 
						new RemoteWebDriver(new URL("http://192.168.1.22:4444/wd/hub"),cap);
		
		String url = "http://newtours.demoaut.com";
		
		driver.get(url);
		
		FileInputStream file=new FileInputStream
				("./src/com/ApplicationTestDataFiles/NewTours_LogInTestData.xlsx");
XSSFWorkbook workBook = new XSSFWorkbook(file);
XSSFSheet sheet =workBook.getSheet("Sheet1");

int rowCount=sheet.getLastRowNum(); // finding all the active Rows in the Sheet

for(int i=1;i<=rowCount;i++) // Goes to all the active Rows in the Sheet
{
	Row r=sheet.getRow(i);// in the sheet goes to every active Row

	// get the row of a cell value into UserName ELement
driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
// get the row of a cell value into Password Element
driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
				
	driver.findElement(By.name("login")).click();
				
String expected_Title="Find";
System.out.println(" The expected title after login is : "+expected_Title);
				
String actual_Title=driver.getTitle();
System.out.println(" The actual title after logIn is : "+actual_Title);
				
if (actual_Title.contains(expected_Title))
{
	System.out.println(" LogIn Successfull - PASS");
	// creating a row of a cell and setting the result into it
r.createCell(2).setCellValue("LogIn Successfull - PASS");
}
else
{
	System.out.println(" LogIn Failed - FAIL");
	// creating a row of a cell and setting the result into it
	r.createCell(2).setCellValue("LogIn Failed - FAIL");
}

// Writting the result to another external File
FileOutputStream file1 = new FileOutputStream
		("./src/com/ApplicationTestResultFiles/NewTours_LogInTestResult.xlsx");

//save the file
workBook.write(file1);
			
		driver.navigate().back();
}

		driver.quit();
	}
	
	

}
