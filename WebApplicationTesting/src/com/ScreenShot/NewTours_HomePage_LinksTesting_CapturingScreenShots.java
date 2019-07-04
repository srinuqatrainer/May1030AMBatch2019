package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksTesting_CapturingScreenShots {

	public static void main(String[] args) throws IOException {
		
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
		
			File sceenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sceenShot, new File("./ScreenShots/"+linkName+".png"));
			
			// will go back One Page
			driver.navigate().back();
			
			// Re-Create the Array List again to store all the elements into the Array
			links=driver.findElements(By.tagName("a"));
		}
		
		driver.quit();


	}

}
