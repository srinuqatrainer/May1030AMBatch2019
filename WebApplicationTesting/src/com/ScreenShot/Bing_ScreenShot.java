package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = null;
		String url = "http://bing.com";
				
		driver = new FirefoxDriver();
		driver.get(url);
		
		//TakesScreenshot - an interface of WebDriver
		// Type casting
		// OutputType - an inteface of WebDriver
		
		File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_ScreenShot, new File("./ScreenShots/bing.png"));
		
		driver.quit();

	}

}
