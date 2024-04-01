package com.basics.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prerequisites {
	public static WebDriver starts(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\ashwiniProjects\\\\chrome exe\\\\chromedriver-win64\\\\chromedriver.exe");
		System.out.println("Step 1.Launch the broswer ");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Step 2. Open url");
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
