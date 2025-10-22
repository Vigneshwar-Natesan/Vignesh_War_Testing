package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0cguin1y731qw1h8c7h194r4a62798678.node0");
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		actions.dragAndDrop(from, to).build().perform();
	}

}
