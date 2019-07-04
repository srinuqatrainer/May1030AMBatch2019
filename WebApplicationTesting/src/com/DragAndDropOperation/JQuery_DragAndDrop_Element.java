package com.DragAndDropOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		Thread.sleep(10000);
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		// Switching to a particular frame of the Webpage - in which element should be found
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
		// id="draggable" - Drag me to my Target element Property
		WebElement drag_Element=driver.findElement(By.id("draggable"));
				
		// id="droppable" - drop here element property
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		// performing darg and drop operation using dragAndDrop() method
		act.dragAndDrop(drag_Element, drop_Element).perform();
	
		// switching back to the default content of the Webpage
		driver.switchTo().defaultContent();
		

	}

}
