package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingDynamicWebTableData {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url ="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// identify the WebTable
				// xpath of the WebTable - /html/body/div[1]/div[6]/section[1]/div
WebElement webTable=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));

// Goto the WebTable and find the total numner of Rows in it using the tag <tr>
	List<WebElement>rows=webTable.findElements(By.tagName("tr"));
	
	for(int i=0;i<rows.size();i++) // to goto all the Rows of the table
	{
		// In the Row - finding the number of Columns using the tag <td>
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td")); 
		
		for(int j=0;j<cols.size();j++) // To goto a Row and get all the Column data
		{
			// goto all the columns and get the text
			String data=cols.get(j).getText();
			System.out.print(data+" ");
		}
		System.out.println();
		}
	driver.quit();
	}
}
