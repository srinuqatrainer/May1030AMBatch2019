package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_GoogleHomePage {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String google_ActualTitle=driver.getTitle();
		
		System.out.println(" The title of Google Home Page is : "+google_ActualTitle);
		
		driver.quit();
		
	}

}
