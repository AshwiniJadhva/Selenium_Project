package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prerequisites {
	public static WebDriver start(String url) {
		System.out.println("Step 1.Launch Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver start() {
		return start("http://automationbykrishna.com");
	}

}
