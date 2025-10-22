package org.seleniumsamples.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables_Sample {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/drag.xhtml");
	driver.manage().window().maximize();
	
	//tbody[@id='form:j_idt94_data']/li

	
	List<WebElement> elements = driver.findElements(By.xpath("//tbody[@id='form:j_idt94_data']/li"));
	WebElement from = elements.get(1);
	WebElement to = elements.get(0);
	
	Actions action = new Actions(driver);
	action.clickAndHold(from).moveToElement(to).release(to).build().perform();
}
}
