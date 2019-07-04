package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryDropDown_FindingTheCountAndDisplayNamesOfElements {

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
	// going to Country Element and finding all the Elements in it - using Option tag(dropdown)
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		int countriesCount=countryNames.size();
		System.out.println(countriesCount);
		
		for(int i=0;i<countriesCount;i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(countryName);
		}
		
		driver.quit();
	}
}
