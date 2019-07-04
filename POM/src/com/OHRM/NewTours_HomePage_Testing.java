package com.OHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_HomePage_Testing extends BaseTest{
	
	@Test
	public void homePage() throws InterruptedException, IOException
	{
		OHRM_HomePage ohp = PageFactory.initElements(driver, OHRM_HomePage.class);
		
		FileInputStream file1 = new FileInputStream("./src/com/ApplicationTestDataFiles/OHRM_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<rowCount;i++)
		{
		System.out.println(" Value of i is :"+i);
			Row row=sheet.getRow(i);
			
		ohp.logIn(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		
		try{
			String expected_text="Welcome Admin";
	System.out.println("The expected text is :"+expected_text);
	
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
	String actual_Text=welcomeAdmin.getText();
	System.out.println("The actual text is : "+actual_Text);
	
	if(actual_Text.contains(expected_text))
	{
		System.out.println("Successfully logIn - PASS");
		welcomeAdmin.click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println(" LogOut Successfull ");
		
	}
	System.out.println(" Test completed ");
	}
	catch(Exception e)
	{
		if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
		{
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ScreenShot/img.png"));
			
			System.out.println("LogIn Failed - FAIL");
			driver.quit();
		}
		
		
	}
		
		System.out.println(" loop for next value");
		//driver.navigate().back();
		
		FileOutputStream file2 = new FileOutputStream("./src/com/ApplicationTestResultFiles/OHRM_LogInTestResult.xlsx");
		workBook.write(file2);
		
		}
		
		//driver.navigate().back();
		
		//Thread.sleep(10000);
		
		
	}	
	//	ohp.dropDown();
	}



