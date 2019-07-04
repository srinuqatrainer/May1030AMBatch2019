package com.WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmail_Help_CreateGoogleAcccount_Click_BackToGmail_Privacy_Click {
	
	@Test
	public void gmail()
	{
		WebDriver driver = null;
		String url="http://gmail.com";
		driver = new FirefoxDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Geeting the Title of Gmail HomePage
		System.out.println(" The Title of Parent window is :"+driver.getTitle());
		
		String parent=driver.getWindowHandle(); // will get the Id of the Current Window
		System.out.println(parent);
		
		// Automating Help
		driver.findElement(By.linkText("Help")).click();
		
Set<String>child=driver.getWindowHandles(); // Getting the Id's of both tab's/Window's
		
		System.out.println(child); // Printing all the Id's of the tab's/Window's
		
		for(String h:child) // for each loop -- moving to the Child Window/Tab
		{
			
			if(!h.equals(parent)) // checking whether we are in parent window or Not
			{
				// if not parent then we are in child Window / new Tab
				driver.switchTo().window(h);// Switching to Child window/Tab
				{
					System.out.println("The new Tab/Window Title is : "+driver.getTitle());
					
String childWindowElementText=driver.findElement(By.linkText("Create a Google Account"))
																				.getText();
		System.out.println(" Child Element Text is :"+ childWindowElementText);
					
			driver.findElement(By.linkText("Create a Google Account")).click();
		
	System.out.println(" The Title of the Sub child window is : "+driver.getTitle());
					
				}
			}
			
		}
		
		driver.close(); // closing the current Tab/Window we are in
		
		driver.switchTo().window(parent); // Switching back to Parent Window
		
		// Automating Privacy Element on Gmial Webpage
		driver.findElement(By.linkText("Privacy")).click(); 
	
		driver.quit(); // closing all the Windows
	}
	
}
