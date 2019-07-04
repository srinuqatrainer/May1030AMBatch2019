package com.CapturingUrl_ValidatingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_ValidatingUrl_Facebook {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		String url="http://facebook.com";
		driver.get(url);
		
		String expected_url="facebook.com";
		System.out.println(" The expected Url is : "+expected_url);
		
		String actual_url=driver.getCurrentUrl();
		System.out.println(" The actual url is : "+actual_url);
		
		if(actual_url.contains(expected_url))
		{
			System.out.println(" Url matched - PASS");
		}
		else
		{
			System.out.println(" Url not matched - FAIL");
		}
		
		driver.quit();

	}

}
