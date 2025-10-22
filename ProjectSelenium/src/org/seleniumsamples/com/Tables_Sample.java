package org.seleniumsamples.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01gaslx3q6hffcpze6qozquf7v3199196.node0");
		
		List<WebElement> coloumns = driver.findElements(By.tagName("th"));
		int coloumCount = coloumns.size();
		System.out.println("The Total Number Of Coloumns in the Table is: "+coloumCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("The Total Number of Rows in the Table is: "+rowsCount);
		
		WebElement representative = driver.findElement(By.xpath("//td[contains(text(),'Arvin Octavia')]//following::td[2]"));
		String name = representative.getText();
		System.out.println("The Name of the Representative is: "+name);
	}

}
