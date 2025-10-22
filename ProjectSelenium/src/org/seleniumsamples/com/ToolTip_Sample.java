package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		
		WebElement globeIcon = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[2]/a/i"));
		String attribute = globeIcon.getAttribute("data-tooltip");
		System.out.println(attribute);
	}

}
