package com.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OHRM_HomePage {
	
	// Object Repository Class
	
	// id="txtUsername"
//cannot use the driver object of a browser because we are not automating Browser in this class
	//WebElement userName=driver.findElement(By.id("txtUsername"));
	//userName.sendKeys("admin");
	
	@FindBy(id="txtUsername")
	WebElement UserName;
	
	// id="txtPassword"
	@FindBy(id="txtPassword")
	WebElement Password;
	
	// id="btnLogin"
	@FindBy(id="btnLogin")
	WebElement SignIn;
	
	public void logIn(String uName,String Pwd) throws InterruptedException
	{
		UserName.sendKeys(uName);
		Password.sendKeys(Pwd);
		
	//	Thread.sleep(10000);
		SignIn.click();
	}

	// id="openIdProvider"
	
	@FindBy(id="openIdProvider")
	WebElement logInDropDown;
	
	public void dropDown()
	{
		List<WebElement>dropDownElements=logInDropDown.findElements(By.tagName("option"));
		
		for(int i=0;i<dropDownElements.size();i++)
		{
			System.out.println(dropDownElements.get(i).getText());
		}
		
	}
}
