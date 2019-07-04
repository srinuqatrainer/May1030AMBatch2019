package com.ApplicationData_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountryDropDownData_To_ExcelSheet {

	public static void main(String[] args) throws IOException
	{
	
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
// explicit Wait - will wait for sure for give time before performing operation on the next
// statement(on next Element)
		//Thread.sleep(10000);
		
		// <a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - property of Country Element
		WebElement country=driver.findElement(By.name("country"));
	// going to Country Element and finding all the Elements in it - using Option tag(dropdown)
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		int countriesCount=countryNames.size();
		System.out.println(countriesCount);
		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int i=0;i<countriesCount;i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(countryName);
			
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			c.setCellValue(countryName);
			
			FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
			workBook.write(file1);
			
		}
		
		driver.quit();
	}

}
