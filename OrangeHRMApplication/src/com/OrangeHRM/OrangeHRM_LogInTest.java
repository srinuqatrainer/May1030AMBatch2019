package com.OrangeHRM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_LogInTest {

	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";

@Given("^Open firefox browser and navigate to OrangeHRM application$")
public void Open_firefox_browser_and_navigate_to_OrangeHRM_application()
{

	driver = new FirefoxDriver();
	driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

/* @When("^User enters valid UserName and valid Password and click on SignIn button$")
public void User_enters_valid_UserName_and_valid_Password_and_click_on_SignIn_button() 
{
	// id="txtUsername"
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	
	// id="txtPassword"
	driver.findElement(By.id("txtPassword")).sendKeys("pasword");
	
	// id="btnLogin"
	driver.findElement(By.id("btnLogin")).click();
	
}*/


@When("^User enters valid \"([^\"]*)\" and valid \"([^\"]*)\" and click on SignIn button$")
public void User_enters_valid_and_valid_and_click_on_SignIn_button
														(String UserName, String Password)
{
	// id="txtUsername"
	driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		
		// id="txtPassword"
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
		// id="btnLogin"
		driver.findElement(By.id("btnLogin")).click();
}



@Then("^User should be able to successfully logIn the application and close the application$")
public void User_should_be_able_to_successfully_logIn_the_application_and_close_the_application() throws IOException 
{
	
	try{
		
		String expected_text="Welcome Admin";
System.out.println("The expected text is :"+expected_text);

// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
String actual_Text=driver.findElement(By.id("welcome")).getText();
System.out.println("The actual text is : "+actual_Text);

if(actual_Text.contains(expected_text))
{
	System.out.println("Successfully logIn - PASS");
}

}
	
catch(Exception e)
{
	System.out.println(" The exceptio is : "+e);
	if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
	{
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("./ScreenShot/img.png"));
		
		System.out.println("LogIn Failed - FAIL");
		driver.quit();
	}
}

	driver.quit();
}
}
