package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.id("email")).sendKeys("Srinu");
		
		Actions act = new Actions(driver);
// Performing KeyBoard TAB key operation using Actions Class object with sendKeys Method 
		act.sendKeys(Keys.TAB).perform();

// without identifying the properties of Password Element directly automating Password Element
//Since the actions class Object focus is now at password Element-we can directly automate it		
		act.sendKeys("Hello").perform();

//	Performing KeyBoard ENTER key operation using Actions Class object with sendKeys Method
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
