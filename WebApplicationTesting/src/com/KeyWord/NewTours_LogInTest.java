package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest {
	
	@Test
	public void logIn() throws IOException
	{
		// Identifying the properties file in the System
		FileInputStream file = new FileInputStream("./NewTours.properties");
		
		// Creating a Properties class Object
		Properties pr = new Properties();
		// Using the Properties class Object loading the properties file
		pr.load(file);		
		
		// identifying the element based on the properties from the properties file
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(userName);
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(password);
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		
		String expected_Title="Find";
		System.out.println(" The expected title after login is : "+expected_Title);
							
			String actual_Title=driver.getTitle();
		System.out.println(" The actual title after logIn is : "+actual_Title);
							
			if (actual_Title.contains(expected_Title))
			{
				System.out.println(" LogIn Successfull - PASS");
			}
			else
			{
				System.out.println(" LogIn Failed - FAIL");
			}

	}
	
	

}
