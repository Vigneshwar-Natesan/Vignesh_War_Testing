package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditButton_Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		WebElement disableButton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean status = disableButton.isEnabled();
		System.out.println("The Button is Enabled: "+status);
		
		WebElement submitbutton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point point = submitbutton.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("The Position of the Button is: "+x+","+y);
		
		WebElement saveButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String buttonColor = saveButton.getCssValue("color");
		System.out.println("The Color of the Save Button is: "+buttonColor);
		
		WebElement sizebutton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		System.out.println("The size of the Submit Button is: "+height+","+width);
		
	}

}
