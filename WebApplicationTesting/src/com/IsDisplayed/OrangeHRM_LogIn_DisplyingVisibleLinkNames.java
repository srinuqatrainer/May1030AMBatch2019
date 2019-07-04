package com.IsDisplayed;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_LogIn_DisplyingVisibleLinkNames {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
// OrageHRM logIn Test
		// id="txtUsername"
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		// id="txtPassword"
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		
		driver.findElement(By.id("btnLogin")).click();

		// Finding all the elements of the current webpage which are of type links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		// find the size of the ArrayList
		System.out.println(" Total number of links are : "+ links.size());
		for(int i=0;i<links.size();i++) // goes to every Index of the arrayList
		{
if(links.get(i).isDisplayed())//checking whether the index of an Array is saved with a value 
			{
				String linkName=links.get(i).getText();
				System.out.println(linkName);
			}
		}
		driver.quit();
	}
}
