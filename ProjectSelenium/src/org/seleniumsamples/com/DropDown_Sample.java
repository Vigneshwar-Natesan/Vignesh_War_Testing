package org.seleniumsamples.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(dropDown1);
		select.selectByIndex(2);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
	}

}
