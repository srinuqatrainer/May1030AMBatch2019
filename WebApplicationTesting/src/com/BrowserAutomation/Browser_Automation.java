package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Automation {

	public static void main(String[] args) {
		
		// Firefox Browser
							   					// path of the driver file in the Project
System.setProperty("webdriver.gecko.driver", "C:\\Users\\srinivas1\\Desktop\\May1030Batch\\WebApplicationTesting\\driverFiles\\geckodriver.exe");
FirefoxDriver f = new FirefoxDriver();
		
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\May1030Batch\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		
		// Edge Browser
		//  in the below statement '.' indicates the Current working directory 
		System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
		EdgeDriver e = new EdgeDriver();
		
		//IE Browser
		System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();

	}
}
