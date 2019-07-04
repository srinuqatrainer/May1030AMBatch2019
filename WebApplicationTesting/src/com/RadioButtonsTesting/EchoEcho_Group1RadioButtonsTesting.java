package com.RadioButtonsTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_Group1RadioButtonsTesting {

	public static void main(String[] args) {
		

		WebDriver driver = null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Inspect the block of webPage in which radioButtons existing
		// Inspected Block xpath - absolute xpath
	// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td

		// identifying the block(radio buttons) of the webpage
WebElement group1_RadioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		
		/*
		 <input type="radio" name="group1" value="Milk">
		<input type="radio" name="group1" value="Butter" checked="">
		<input type="radio" name="group1" value="Cheese">

		<input type="radio" name="group2" value="Water">
		 */
 // finding all the element of the block of the Webpage(group1 elements only)
List<WebElement>group1_radioButtons=group1_RadioButtonsBlock.findElements(By.name("group1"));

// finding the size of the list of elements save in ArrayList
	System.out.println(" The Group1 radio buttons count is : "+group1_radioButtons.size());
	
	// Testing the radio buttons
		for(int i=0;i<group1_radioButtons.size();i++) // performs click on each Radio button
		{
			group1_radioButtons.get(i).click();
			
	for(int j=0;j<group1_radioButtons.size();j++) // to get the status of radio buttons
			{
		// name of the radio buttons along with status of the radio buttons
		
/*	System.out.println(group1_radioButtons.get(j).getAttribute("value")+" - "
			                   +group1_radioButtons.get(j).getAttribute("checked")); */
	
		// OR
		
		System.out.println(group1_radioButtons.get(j).getAttribute("value")+" - "
                +group1_radioButtons.get(j).isSelected());	
			}
		}
		driver.quit();
	}
}
