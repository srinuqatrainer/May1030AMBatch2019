package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_ElementsCounts_DisplayingNames {

	public static void main(String[] args) {
	
		WebDriver driver = null;
		String url="https://tsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		// Identify the Block of the WebPage which is under Test
		// class="menu-wrap" - proptery of the Block of the Webpage
		
		WebElement headBlock=driver.findElement(By.className("menu-wrap"));
	
		// Going to the block of the WebPage and finding all the elements in it
		List<WebElement>links=headBlock.findElements(By.tagName("a"));
		
		// finding the size of the Array List
		int linksCount=links.size();
		
		System.out.println("The total number of Header block elements are : "+linksCount);
		
		// displaying all the names(Elements) of the ArrayList
		for(int i=0;i<linksCount;i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(i+" - "+linkName);
		}
		driver.quit();
	}
}
