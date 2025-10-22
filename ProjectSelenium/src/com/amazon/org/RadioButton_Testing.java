package com.amazon.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Testing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/radio.xhtml");
		
		WebElement favBrowser = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
		favBrowser.click();
		
		WebElement defaultButton1 = driver.findElement(By.id("j_idt87:console2:0"));
		WebElement defaultButton2 = driver.findElement(By.id("j_idt87:console2:1"));
		WebElement defaultButton3 = driver.findElement(By.id("j_idt87:console2:2"));
		WebElement defaultButton4 = driver.findElement(By.id("j_idt87:console2:3"));
		
		
		boolean status1 = defaultButton1.isSelected();
		boolean status2 = defaultButton2.isSelected();
		boolean status3 = defaultButton3.isSelected();
		boolean status4 = defaultButton4.isSelected();
		
		System.out.println("Status Of Chrome Button is:"+status1);
		System.out.println("Status Of FireFox Button is:"+status2);
		System.out.println("Status Of Safari Button is:"+status3);
		System.out.println("Status Of Edge Button is:"+status4);
		
		
		
	}

}
