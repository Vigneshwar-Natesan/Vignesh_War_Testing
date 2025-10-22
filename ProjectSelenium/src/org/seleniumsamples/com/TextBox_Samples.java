package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_Samples {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Vigneshwar");
		
		WebElement countryBox = driver.findElement(By.id("j_idt88:j_idt91"));
		countryBox.sendKeys(" , India");
		
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean status = disabledBox.isEnabled();
		System.out.println("Is the Box is Enabled: "+status);
		
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		WebElement retriveBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String attribute = retriveBox.getAttribute("value");
		System.out.println("The text in the Retrive Box is :"+attribute);
	}

}
