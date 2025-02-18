package com.orgHRM.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class PredefinedAction {
	
	protected static WebDriver driver;
	
	static public void start() {
		 start("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	static public void start( String url) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//return driver;
	}
	public static void main(String[] args) {
		start();
	}

}
