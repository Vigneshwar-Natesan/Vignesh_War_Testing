package org.seleniumsamples.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		String oldWindow = driver.getWindowHandle();
		WebElement open = driver.findElement(By.id("j_idt88:new"));
		open.click();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement kebabButton = driver.findElement(By.id("right-sidebar-button"));
		kebabButton.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple = driver.findElement(By.id("j_idt88:j_idt91"));
		openMultiple.click();
		int size = driver.getWindowHandles().size();
		System.out.println("Number of Windows Opened: "+size);
		
		WebElement closewindows = driver.findElement(By.id("j_idt88:j_idt93"));
		closewindows.click();
		Set<String> currentwindow = driver.getWindowHandles();
		for (String allwindow : currentwindow) {
			if (!allwindow.equals(oldWindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
			}
		}
     	}
	}
