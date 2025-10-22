package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkTest_Samples {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		WebElement elementButton = driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']"));
		elementButton.click();
		WebElement hyperLink = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-link layout-menuitem-icon']"));
		hyperLink.click();
		WebElement link = driver.findElement(By.linkText("Go to Dashboard"));
		link.click();
	}

}
