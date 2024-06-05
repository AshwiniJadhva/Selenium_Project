package basics.multiSelectDropDown.testcae5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Prerequisites {
	public  WebDriver driver;
	@BeforeTest
	public WebDriver start() {
		System.out.println("Step 1.Launch Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com");
		driver.manage().window().maximize();
		return driver;
	}
	
	}


