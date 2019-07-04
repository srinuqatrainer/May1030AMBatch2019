package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_DisplayingNames {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		/*
		 <a href="mercurysignon.php">SIGN-ON</a>
		<a href="mercuryregister.php">REGISTER</a>
		<a href="mercuryunderconst.php">SUPPORT</a>

		 */
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
System.out.println(" The total number of links on the NewTours Home Page are : "
																		+links.size());

// Displaying the names of all the links on the current WebPage
		for(int i=0;i<links.size();i++)
		{

			String linkName=links.get(i).getText();
			System.out.println(i+" "+linkName);
			
		}
		
		driver.quit();

	}

}
