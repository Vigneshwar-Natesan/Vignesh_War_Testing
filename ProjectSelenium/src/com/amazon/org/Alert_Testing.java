package com.amazon.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Testing {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://leafground.com/alert.xhtml");
       
       WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
       simpleAlert.click();
       Alert alert = driver.switchTo().alert();
       alert.accept();
       
       WebElement confirmAlert = driver.findElement(By.id("j_idt88:j_idt93"));
       confirmAlert.click();
       Alert alert1=driver.switchTo().alert();
       alert1.dismiss();
       
       WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
       promptAlert.click();
       Alert alert2=driver.switchTo().alert();
       alert2.sendKeys("dummy");
       alert2.accept();
       
       WebElement mmalert = driver.findElement(By.id("j_idt88:j_idt111"));
       mmalert.click();
       WebElement maxButton = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']"));
       Actions action = new Actions(driver);
       action.moveToElement(maxButton).click().build().perform();
       driver.close();
	}

}
