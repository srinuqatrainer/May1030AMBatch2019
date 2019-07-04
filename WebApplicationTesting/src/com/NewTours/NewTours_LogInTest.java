package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		// <input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
		

	}

}
