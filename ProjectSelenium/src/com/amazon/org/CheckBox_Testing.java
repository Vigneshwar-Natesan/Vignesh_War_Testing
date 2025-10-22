package com.amazon.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox_Testing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		
		WebElement basicBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		basicBox.click();
		
		WebElement notificationBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
		notificationBox.click();
		
		WebElement toggleButton = driver.findElement(By.id("j_idt87:j_idt100"));
		toggleButton.click();
		
		WebElement disableBox = driver.findElement(By.id("j_idt87:j_idt102"));
		boolean result = disableBox.isSelected();
		System.out.println("The Box is Enabled: "+result);
		
		
	}

}
