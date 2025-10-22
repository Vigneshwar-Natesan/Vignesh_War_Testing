package org.seleniumsamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node0wz1rg7sp62ju1m3ltwh364io74271098.node0");
		driver.manage().window().maximize();
//
//		WebElement favBrowser = driver.findElement(By.xpath("//input[contains(@id,'j_idt87:console1:0')]"));
//    	favBrowser.click();

		WebElement favBrowser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
    	favBrowser.click();
		
		WebElement chrome = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1:0\"]"));
		boolean status1 = chrome.isSelected();
		System.out.println("Is the Browser chrome is selected: "+status1);

		WebElement fireFox = driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']"));
		boolean status2 = fireFox.isSelected();
		System.out.println("Is the Browser firefox is selected: "+status2);

		WebElement safari = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		boolean status3 = safari.isSelected();
		System.out.println("Is the Browser safari is selected: "+status3);

		WebElement edge = driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']"));
		boolean status4 = edge.isSelected();
		System.out.println("Is the Browser edge is selected: "+status4);
	}


}
