package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_SelectCountryName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
// explicit Wait - will wait for sure for give time before performing operation on the next
// statement(on next Element)
		Thread.sleep(10000);
		
		// <a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - property of Country Element
		WebElement country=driver.findElement(By.name("country"));
	
		//Select class is used to select Optional values from the dropDown
		
		Select selection = new Select(country);
		//selection.selectByIndex(8);
		//selection.selectByValue("7");
		selection.selectByVisibleText("INDIA");
		
		

	}

}
