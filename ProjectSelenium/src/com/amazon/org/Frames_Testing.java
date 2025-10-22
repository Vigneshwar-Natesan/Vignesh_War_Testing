package com.amazon.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement clickMe = driver.findElement(By.id("Click"));
		clickMe.click();
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		int size = totalFrame.size();
		System.out.println("No of Frames: "+size);
	}

}
