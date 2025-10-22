package com.amazon.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_Testing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Vigneshwar Natesan");
		
		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys(" , India");
		
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean disable = disabledBox.isEnabled();
		System.out.println("The Box is Enabled: "+disable);
		
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		WebElement retriveBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String attribute = retriveBox.getAttribute("value");
		System.out.println("The Text in the Box is: "+attribute);
	}
	
}
