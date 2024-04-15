package basics.webTables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {
	static WebDriver start() {
		System.out.println("Step 1.Launch Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Step 2.Goto datatables.com");
		driver.get("https://datatables.net/");
		driver.manage().window().maximize();
		return driver;
	}

}
