package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Samples {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/calendar.xhtml");
		
		WebElement next = driver.findElement(By.xpath("//button[@class='fc-next-button fc-button fc-button-primary']"));
		next.click();
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'15')]"));
		date.click();
	}

}
