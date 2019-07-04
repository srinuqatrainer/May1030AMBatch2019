package com.DataDrivern;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest{
	
	@Test
	public void logIn()
	{
		// <input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys(UserName);
		
		// <input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys(Password);
				
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
			driver.findElement(By.name("login")).click();
				
				String expected_Title="Find";
				System.out.println(" The expected title after login is : "+expected_Title);
				
				String actual_Title=driver.getTitle();
				System.out.println(" The actual title after logIn is : "+actual_Title);
				
				if (actual_Title.contains(expected_Title))
				{
					System.out.println(" LogIn Successfull - PASS");
				}
				else
				{
					System.out.println(" LogIn Failed - FAIL");
				}
				
	}


}
