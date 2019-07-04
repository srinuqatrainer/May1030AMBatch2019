package com.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
// explicit Wait - will wait for sure for give time before performing operation on the next
// statement(on next Element)
		
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Thread.sleep(10000);
		// class="border_grey1" - current location element property
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		Select selection = new Select(currentLocation);
		selection.selectByVisibleText("Chennai");
		
		// id="id_industry" - property of Industry Element
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select selection1 = new Select(industry);
		selection1.selectByIndex(0);
		selection1.selectByValue("65");
		selection1.selectByValue("4");
		selection1.selectByVisibleText("Banking/Financial Services");
		
		// deselecting Optional values from the dropDown
		
		selection1.deselectByVisibleText("Any");
		selection1.deselectByIndex(0);
		selection1.deselectByValue("65");
		selection1.deselectAll();
		
		//driver.quit();
	}

}
