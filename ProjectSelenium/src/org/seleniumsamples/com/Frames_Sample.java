package org.seleniumsamples.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement insideFrame = driver.findElement(By.id("Click"));
		insideFrame.click();
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		List<WebElement> countFrames = driver.findElements(By.tagName("iframe"));
		int size = countFrames.size();
		System.out.println(size);
	    driver.switchTo().defaultContent();

		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
        driver.switchTo().frame(2);
		WebElement nestedFrame = driver.findElement(By.xpath("//button[@id='Click'] [@onclick='change()'] [@style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']"));
	    nestedFrame.click();
	    String text2 = driver.findElement(By.xpath("//*[@id='Click'] [@onclick='change()'] [@style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']")).getText();
	    System.out.println(text2);
	}

}
