package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest {
	
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	Logger logger = Logger.getLogger(LogInTest.class);
	
	@BeforeTest
	public void setUP()
	{

		PropertyConfigurator.configure("Log4j.properties");
		
		driver = new FirefoxDriver();
		//System.out.println(" Firefox Browser Opened Successfully ");
		
		logger.info("Firefox Browser Opened Successfully");
		
		driver.get(url);
		//System.out.println(" Successfully navigated to OrageHRM Home Page");
		logger.info("Successfully navigated to OrageHRM Home Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		//System.out.println(" OrangeHRM Application closed Successfully ");
		logger.info("OrangeHRM Application closed Successfully");
	}
	
	@Test
	public void logIn()
	{
		// id="txtUsername"
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//System.out.println(" Entered User Name Successfully ");
		logger.info("Entered User Name Successfully");
		
		// id="txtPassword"
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		//System.out.println(" Entered Password Successfully ");
		logger.info("Entered Password Successfully");
		
		
		// id="btnLogin"
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(" Performed Click operation on LogIn button");
		
		String expected_Text="Welcome";
		//System.out.println(" The expected text after logIn is : "+expected_Text);
		logger.info("The expected text after logIn is : "+expected_Text);
		
		WebElement welComeText=driver.findElement(By.id("welcome"));
		String actual_WelComeText=welComeText.getText();
		//System.out.println(" The actual Text after LogIn Is : "+actual_WelComeText);
		logger.info(" The actual Text after LogIn Is : "+actual_WelComeText);
		
		
		if(actual_WelComeText.contains(expected_Text))
		{
			//System.out.println(" LogIn Successfull - PASS");
			logger.info("LogIn Successfull - PASS");
		}
		else
		{
			//System.out.println(" LogIN Failed - FAIL");
			logger.info("LogIN Failed - FAIL");
		}
		
	}
	
}
