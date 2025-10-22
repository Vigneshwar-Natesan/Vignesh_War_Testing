package org.seleniumsamples.com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload_Sample {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		WebElement downloadButton = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadButton.click();
		
		File fileLocation = new File("C:\\Users\\user\\Downloads");
		File[] totalfiles = fileLocation.listFiles();
		for (File file : totalfiles) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File Downloaded");
				break;
			}
		}
		
	}

}
