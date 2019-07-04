package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Vacations_BackToHome_CLick {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		driver.findElement(By.linkText("Vacations")).click();
		
		// <img src="/images/forms/home.gif" width="118" height="23" border="0">
		// Relative xpath expression based on Property of Element - 
 // xpath Expression for "BackToHome"Elelement - //img[@src='/images/forms/home.gif']

		// Absolute xpath based on the html tags of Inspected element
// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/                                           table/tbody/tr[4]/td/a/img		
		// based on Relative xpath
//	WebElement backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
		// based on Absolute xpath                                                           
	WebElement backToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
		backToHome.click();
		

	}

}
