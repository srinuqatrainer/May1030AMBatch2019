package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String expected_Title="google";
		System.out.println(" The expected Title of Google Home Page is :"+expected_Title);
		
		String acutal_Title=driver.getTitle();
		System.out.println(" The actual title of Google Home Page is : "+acutal_Title);
		
		//if(acutal_Title.equals(expected_Title))
		if(acutal_Title.equalsIgnoreCase(expected_Title))
		{
			System.out.println(" Title Matched - PASS");
		}
		else
		{
			System.out.println(" Title not matched - FAIL");
		}
		
		driver.quit();
	}
}
