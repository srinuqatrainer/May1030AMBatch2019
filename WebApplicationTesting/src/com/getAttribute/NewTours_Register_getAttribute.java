package com.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_getAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// <a href="mercuryregister.php?osCsid=9dfca1b40b119bc3d09475884b73c202">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String registerElementText=register.getText();
		
		String expected_RegisterUrl=register.getAttribute("href");
	System.out.println("The exepceted Url of register element is : "+expected_RegisterUrl);
		
		System.out.println(registerElementText);
		
		register.click();
		
		String actual_RegisterUrl=driver.getCurrentUrl();
		System.out.println(" The actual Url of register webPage is : "+actual_RegisterUrl);
	
		// Validating the Register link
		if(actual_RegisterUrl.equals(expected_RegisterUrl))
		{
			System.out.println(" Successfully reached Register Webpage - PASS");
		}
		else
		{
			System.out.println(" Failed to reach Register Webpage - FAIL");
		}
		driver.quit();
	}
}
