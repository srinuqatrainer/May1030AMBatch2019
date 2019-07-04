package com.NavigateToAnApplication;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_NavigateToBingApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("http://www.bing.com");
		
		//driver.get("http://facebook.com");
		
		driver.navigate().to("http://google.com");
		
		driver.close();

	}

}
