package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {

	@BeforeMethod
	public void yahooLaunchAndLogIn() {
		System.out.println(" Yahoo Application Launch and LogIn ");
	}

	@AfterMethod
	public void yahooApplicationClose() {
		System.out.println(" Closing Yahoo Application ");
	}

	// for every Test Case BeforeMethod and AfterMethod Will be executed
	// Every Test case is automated as an individual Test Case

	@Test(enabled = false)
	public void composeMail() {
		System.out.println(" Testing ComposeMail Functionality ");
	}

	@Test(priority = 2)
	public void sentMail() {
		System.out.println(" Testing SentMail Functionality ");
	}

	@Test(priority = 1)
	public void inBox() {
		System.out.println(" Testing Inbox functionality ");
	}
}
