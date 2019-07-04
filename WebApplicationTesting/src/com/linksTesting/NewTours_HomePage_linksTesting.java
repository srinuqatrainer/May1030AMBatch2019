package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_linksTesting {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
					
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
System.out.println(" The total number of links on the NewTours Home Page are : "
																		+links.size());

// Displaying the names of all the links on the current WebPage
		for(int i=0;i<links.size();i++)
		{

			String linkName=links.get(i).getText();
			System.out.println(i+" "+linkName);
			
			links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
		
			// will go back One Page
			driver.navigate().back();
			
			// Re-Create the Array List again to store all the elements into the Array
			links=driver.findElements(By.tagName("a"));
		}
		
		driver.quit();



	}

}
