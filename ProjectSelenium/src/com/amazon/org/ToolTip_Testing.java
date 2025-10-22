package com.amazon.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Testing {

	public static void main(String[] args)  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://leafground.com/dashboard.xhtml");
      driver.manage().window().maximize();
      
      WebElement globe = driver.findElement(By.xpath("//*[@class='pi pi-globe']"));
      String attribute = globe.getAttribute("data-tooltip");
      System.out.println(attribute);
	}

}
