package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMerucryTours {
	
	// Object Repository Class
	
	// Elements identification and Operation on them are Written in this class
	
	//WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	//signOn.click();
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void logIn(String userName,String password)
	{
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		SignIn.click();
	}
	
	
	
	
	

}
