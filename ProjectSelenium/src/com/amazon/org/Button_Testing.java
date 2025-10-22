package com.amazon.org;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button_Testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();

		WebElement confirmButton = driver.findElement(By.id("j_idt88:j_idt90"));
		String text = confirmButton.getText();
		System.out.println(text);
		
		WebElement disabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean disable = disabledButton.isEnabled();
		System.out.println("The Button is Enabled: "+disable);
		
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyButton = submitButton.getLocation();
		int x = xyButton.getX();
		int y = xyButton.getY();
		System.out.println("The Location of the Button is: "+x+","+y);
		
		WebElement saveButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = saveButton.getCssValue("color");
		System.out.println("The Color of the Save Button is: "+color);
		
		WebElement submitButton1 = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = submitButton1.getSize().getHeight();
		int width = submitButton1.getSize().getWidth();
		System.out.println("The Size of the Button is: "+height+","+width);
		
	}
}
