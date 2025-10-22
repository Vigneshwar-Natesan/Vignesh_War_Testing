package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrallelTesting_Sample {

	WebDriver driver;

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\BattleGround\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}

	@Test
	public void openYahoo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\BattleGround\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.quit();
	}

}
