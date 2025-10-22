package com.amazon.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Testing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();
		Set<String> windowSets = driver.getWindowHandles();
		for (String childWindow : windowSets) {
			driver.switchTo().window(childWindow);
		}
		WebElement help = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[4]/a/i"));
		help.click();
		driver.close();
		driver.switchTo().window(parentWindow);
		
		WebElement openMultiple = driver.findElement(By.id("j_idt88:j_idt91"));
		openMultiple.click();
		Set<String> multiwindows = driver.getWindowHandles();
		int size = multiwindows.size();
		System.out.println("No of Windows Opened: "+size);
		
		
		WebElement closeWindows = driver.findElement(By.id("j_idt88:j_idt93"));
		closeWindows.click();
		Set<String> newWindows = driver.getWindowHandles();
		for (String everywindows : newWindows) {
			if (!everywindows.equals(parentWindow)) {
				driver.switchTo().window(everywindows);
				driver.close();
			}
		}
	}

}
