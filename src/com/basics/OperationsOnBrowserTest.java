package com.basics;
/*
 * Test - 2

1. Launch a chrome
2. Open Google.com
3. Get page title name and verify with expected title
4. navigate to automationbykrishna.com
5. Get page title name and verify with expected title
6. navigate back in history
7. Get page title name and verify with expected title [google]
8. navigate forward in the history
9. Get page title name and verify with expected title [automationbykrishna]
10. refresh the page and verify the expected title [automationbykrishna]
11. Close the browser.

 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationsOnBrowserTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "E:\\ashwiniProjects\\chrome exe\\chromedriver-win64\\chromedriver.exe");
		
		System.out.println("Step 1. Launch a chrome");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.google.com/";
		System.out.println("Step 2. Open Google.com");
		driver.get(Url);
		
		System.out.println("Step 3. Get page title name and verify with expected title");
		String actualTitle= driver.getTitle();
		String expectedTile = "Google";
		if(expectedTile.equals(actualTitle)) {
			System.out.println("title is : "+expectedTile);
			System.out.println("Test Pass");
		}
		else System.out.println("Test Fail");
		
		
		
		System.out.println("Step 4. navigate to automationbykrishna.com");
		driver.navigate().to("http://automationbykrishna.com/");
		
		System.out.println("Step5. Get page title name and verify with expected title");
		String expeckedAkTitle = driver.getTitle();
		String actualAKTile = "Login Signup Demo";
		if(expeckedAkTitle.equals(actualAKTile)) {
			System.out.println(" AK Title is :"+actualAKTile);
			System.out.println("Test Pass");
		}
		else System.out.println("Test Fail");
		
		System.out.println("Step 6. navigate back in history");
		driver.navigate().back();
		
		System.out.println("Step 7. Get page title name and verify with expected title [google]");
		String backTitle = driver.getTitle();
		if(backTitle.equals(actualTitle)) {
			System.out.println("History Title is : "+backTitle);
			System.out.println("Test Pass");
		}
		
		System.out.println("Step 8. navigate forward in the history");
		driver.navigate().forward();
		
		System.out.println("Step 9. Get page title name and verify with expected title [automationbykrishna]");
		String forwordTitle = driver.getTitle();
		if(forwordTitle.equals(actualAKTile)) {
			System.out.println("Forword History Title is : "+forwordTitle);
			System.out.println("Test Pass");
		}
		
		System.out.println("Step 10. refresh the page and verify the expected title [automationbykrishna]");
		driver.navigate().refresh();
		System.out.println("refreshed ak");
		
		System.out.println("Step 11. Close the browser.");
		driver.close();
		}

}
