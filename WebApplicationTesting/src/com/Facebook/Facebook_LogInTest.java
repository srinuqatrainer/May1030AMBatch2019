package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		String url="http://facebook";
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
		// locator - id
		// Selector - email
		
		driver.findElement(By.id("email")).sendKeys("mohdjaveedmohdjaveed");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		driver.findElement(By.id("pass")).sendKeys("5465465");
		
		// <label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		
		driver.findElement(By.id("loginbutton")).click();

	}

}
