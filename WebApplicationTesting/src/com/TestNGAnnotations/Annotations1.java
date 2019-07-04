package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1 {
	// multiple Test cases written in a class should be always set with the
	// Priority
	// If the test cases are not given with Priority - then they execute based
	// on the
	// alphabetical order of the given test case names(Method Names - starting
	// letters)
	@Test(priority = 1)
	public void lauchBrowserAndNavigateToYahooApplication() {
		System.out.println(" Chrome Browser lauched Successfully and Opened Yahoo HomePage ");
	}

	@Test(priority = 2)
	public void logIn() {
		System.out.println(" Yahoo LogIn Successfull ");
	}

	// if Test case is set as "enabled=false" - then TestNG will ignore the
	// execution of the
	// Test during the Test Run
	@Test(enabled = false)
	public void composeMail() {
		System.out.println(" Testing ComposeMail Functionality ");
	}

	@Test(priority = 3)
	public void sentMail() {
		System.out.println(" Testing SentMail Functionality ");
	}
}
