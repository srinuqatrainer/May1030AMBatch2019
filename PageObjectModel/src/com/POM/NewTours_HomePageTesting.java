package com.POM;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_HomePageTesting extends BaseTest {

	
	@Test
	public void homePage()
	{
		WelcomeMerucryTours wmt = PageFactory.initElements(driver, WelcomeMerucryTours.class);
		
		wmt.SignOn();
		
		driver.navigate().back();
		
		wmt.Register();
		
		driver.navigate().back();
		
		wmt.Support();
		
		driver.navigate().back();
		
		wmt.logIn("tutorial", "tutorial");
		
	}

	
}
