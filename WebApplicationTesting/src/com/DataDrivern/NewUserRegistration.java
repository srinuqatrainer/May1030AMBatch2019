package com.DataDrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewUserRegistration extends BaseTest {
	
	@Test(priority=1)
	public void register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
	}
	
	@Test(priority=2)
	public void userRegistration() throws IOException
	{
FileInputStream file = new FileInputStream
					("C:\\Users\\srinivas1\\Desktop\\May1030Batch\\WebApplicationTesting\\src\\com\\ApplicationTestDataFiles\\NewUserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// identify the total Rows with active data
		int rowCount=sheet.getLastRowNum();
		
		// goto all the active Rows with Test data - to test functionality		
for(int i=1;i<=rowCount;i++) 
		{
			// goto a Row in the Sheet
			Row row=sheet.getRow(i);
					
driver.findElement(By.name("firstName")).sendKeys(row.getCell(0).getStringCellValue());
driver.findElement(By.name("lastName")).sendKeys(row.getCell(1).getStringCellValue());
		
		// Type Casting - changing one dataType to another dataType
		double d=row.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
	driver.findElement(By.id("userName")).sendKeys(row.getCell(3).getStringCellValue());
		
	driver.findElement(By.name("address1")).sendKeys(row.getCell(4).getStringCellValue());
	driver.findElement(By.name("address1")).sendKeys(row.getCell(5).getStringCellValue());
	driver.findElement(By.name("state")).sendKeys(row.getCell(6).getStringCellValue());
		
		double u=row.getCell(7).getNumericCellValue();
		long y=(long)u;
		String postalCode=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
	driver.findElement(By.name("country")).sendKeys(row.getCell(8).getStringCellValue());
		
	driver.findElement(By.id("email")).sendKeys(row.getCell(9).getStringCellValue());		
	driver.findElement(By.name("password")).sendKeys(row.getCell(10).getStringCellValue());
driver.findElement(By.name("confirmPassword")).sendKeys(row.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName=row.getCell(9).getStringCellValue();
		System.out.println(" The expected User Name is : "+expected_UserName);
		
String actual_RegistedUserNameText=driver.findElement
(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
		+ "td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();

System.out.println(" The actual Registered User Name is : "+actual_RegistedUserNameText);
		
		if(actual_RegistedUserNameText.contains(expected_UserName))
		{
			System.out.println(" User Registered Successfully - PASS");
			row.createCell(12).setCellValue("User Registered Successfully - PASS");
		}
		else
		{
			System.out.println(" User Registration Failed - FAIL");
			row.createCell(12).setCellValue("User Registration Failed - FAIL");
		}
		
FileOutputStream file1 = new FileOutputStream
("C:\\Users\\srinivas1\\Desktop\\May1030Batch\\WebApplicationTesting\\src\\com\\ApplicationTestResultFiles\\NewUserRegistration_TestResult.xlsx");
		workBook.write(file1);
		driver.navigate().back();
		
		}	

	}
	

}
