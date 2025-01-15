package basics.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basics.PredrfinedActions;

/*
 *Test - 2

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
public class TestCase2 {
	
	
	@Test
	void titleOperations() throws InterruptedException{
		System.out.println("step 1. Launch a chrome");
		System.setProperty("webdriver.driver.chromedriver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Step 2. Open Google.com");
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("step 3. Get page title name and verify with expected title");
		String expectedGoogelTitle = "Google";
		String actualGoogelTitle = driver.getTitle();
		System.out.println(actualGoogelTitle);
		Thread.sleep(3000);
		Assert.assertEquals(expectedGoogelTitle, actualGoogelTitle);
		System.out.println("step 4. navigate to automationbykrishna.com");
		driver.get("http://automationbykrishna.com/");
		System.out.println("Step 5. Get page title name and verify with expected title");
		String expextedAKTitel = "Login Signup Demo";
		String actualAKtitle = driver.getTitle();
		Assert.assertEquals(actualAKtitle, expextedAKTitel);
		System.out.println("Step 6. navigate back in history");
		driver.navigate().back();
		System.out.println("Step 7. Get page title name and verify with expected title [google]");
		actualGoogelTitle = driver.getTitle();
		Assert.assertEquals(actualGoogelTitle, expectedGoogelTitle);
		System.out.println("Step 8. navigate forward in the history");
		driver.navigate().forward();
		System.out.println("Step 9. Get page title name and verify with expected title [automationbykrishna]");
		actualAKtitle = driver.getTitle();
		Assert.assertEquals(actualAKtitle, expextedAKTitel);
		System.out.println("Step 10. refresh the page and verify the expected title [automationbykrishna]");
		driver.navigate().refresh();
		actualAKtitle = driver.getTitle();
		Assert.assertEquals(actualAKtitle, expextedAKTitel);
		driver.close();
		
		
	}
	
	

}
