package org.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pim).perform();
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empId);
		

	}

}
