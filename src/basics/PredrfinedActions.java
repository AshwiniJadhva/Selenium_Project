package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredrfinedActions {
	
	private  static WebDriver driver ;
	public static  WebDriver start() {
		System.out.println("step 1. Launch a chrome");
		System.setProperty("webdriver.driver.chromedriver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	public static  void tearDown() {
		driver.close();
	}

}
