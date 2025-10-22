package org.seleniumsamples.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox_Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0c977upsvjwrm1exppihomkruq2712690.node0");
		driver.manage().window().maximize();

		WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		WebElement confirmAlert = driver.findElement(By.id("j_idt88:j_idt93"));
		confirmAlert.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();

		WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
		promptAlert.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Blinding Lights");
		alert3.accept();
	}
}
