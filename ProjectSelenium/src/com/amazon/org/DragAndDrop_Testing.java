package com.amazon.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Testing {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProjectSelenium\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://leafground.com/drag.xhtml;jsessionid=node01e94nht6sl9951qp2a5thy7asl3081146.node0");
      
      WebElement from = driver.findElement(By.id("form:drag_content"));
      WebElement to = driver.findElement(By.id("form:drop_content"));
      
      Actions action = new Actions(driver);
      
      action.dragAndDrop(from, to).build().perform();
	}

}
