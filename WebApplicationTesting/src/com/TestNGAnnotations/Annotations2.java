package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeTest
	public void yahooLaunchAndLogIn() {
		System.out.println(" Yahoo Application Launch and LogIn ");
	}

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

	@AfterTest
	public void yahooApplicationClose() {
		System.out.println(" Closing Yahoo Application ");
	}

}
