package com.MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSigIn_MouseHover {

	public static void main(String[] args) {
				
		WebDriver driver = null;
		String url="http://amazon.in";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		// id="nav-link-yourAccount" - property of HelloSignIn Element
		
		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		// Actions class is used to perform both Mouse and Keyboard Opertions
		
//actions class is provided an argument as driver-to perform the operation on current webPage
		Actions act = new Actions(driver);
// Using action class object - moving to an element hello SignIn with "moveToElement" method
// Always use perform() method to perform the operation on the Element or else it won't
// perform any operation on the expected Element		

	act.moveToElement(helloSignIn).perform();
		
// automation "Your Orders Element" - its a link - its a Hidden element under helloSignIn 
		WebElement yourOrders=driver.findElement(By.linkText("Your Orders"));
		yourOrders.click();
		
		
	}
}
