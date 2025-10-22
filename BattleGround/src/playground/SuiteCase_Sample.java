package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteCase_Sample {
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser() {
		startTime=System.currentTimeMillis();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\BattleGround\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {
       driver.get("https://www.google.com/");
	}
	@Test
	public void openFireFox() {
       driver.get("https://www.firefox.com/");
	}
	@Test
	public void openYahoo() {
       driver.get("https://in.mail.yahoo.com/");
	}
	@Test
	public void openEdge() {
       driver.get("https://microsoft-edge.en.download.it/");
	}
	@AfterSuite
	public void closeBrowser() {
      driver.quit();
      endTime=System.currentTimeMillis();
      long totalTime = endTime-startTime;
      System.out.println("The Total Time consumed to Run This Class is: "+totalTime);
	}
}
