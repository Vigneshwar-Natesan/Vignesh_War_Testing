
package com.amazon.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Testing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml;jsessionid=node0ut3tgnf97jadw3gkyp33mem2957953.node0");
		driver.manage().window().maximize();
		
		WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		driver.navigate().back();
		
		WebElement destinationLink = driver.findElement(By.partialLinkText("Find the URL"));
		String attribute = destinationLink.getAttribute("href");
		System.out.println("The Link is Navigated Towards: "+attribute);
		
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The Link is Broken");
		}
		else {
			System.out.println("The Link is not Broken");
		}
		driver.navigate().back();
		
		WebElement dashBoardDuplicate = driver.findElement(By.partialLinkText("Go to"));
		dashBoardDuplicate.click();
		driver.navigate().back();
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int size = totalLinks.size();
		System.out.println("The Number of Links are: "+size);
	}
}
