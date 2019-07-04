package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingFirstColumnData {

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
		
	// xpath of First Row of First Column Element 
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
// from the above xpath's we obsorve that only Row Number is changing
// Dividing the xpath into 2 parts and taking them into Variables of String Type

String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[1]";

		for(int i=1;i<=36;i++)
		{
			// getting the text of all the elements of first Column of the WebTable
//String cityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]")).getText();
		
			//   OR - 2nd approach Below
	String cityName	=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(cityName);
		}
	}
}
