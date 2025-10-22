package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node0pacqvknrizpa18gyih0dwkot42737639.node0");
		
		WebElement basicBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		basicBox.click();
		
		WebElement toggleButton = driver.findElement(By.id("j_idt87:j_idt100_input"));
        boolean isOff = toggleButton.isSelected();
		System.out.println(isOff);
		
		WebElement disabledBox = driver.findElement(By.id("j_idt87:j_idt102"));
		boolean selected = disabledBox.isSelected();
		System.out.println(selected);
	}

}
