package basics.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * Test case - 1

1. Launch a chrome
2. Open Google.com
3. Get page title name and length and print on console
4. Get page URL and verify if it is a correct or not.
5. Get page source and page source length and print on console
6. Close the browser.
 */

public class TestCase1 {
	
	@Test
	void Test1() throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		
		System.out.println("step 1. Launch a chrome");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("step 2. Open Google.com");
		String url = "https://www.google.com/";
		driver.get(url);
		
		System.out.println("step 3. Get page title name and length and print on console");
		String pageTitle = driver.getTitle();
		System.out.println("page Title - "+pageTitle);
		
		System.out.println("step 4. Get page URL and verify if it is a correct or not.");
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, url);
		System.out.println("current url is - "+currentUrl);
			
		
		System.out.println("step 5. Get page source and page source length and print on console");
		//System.out.println(driver.getPageSource());
		
		System.out.println("step 6. Close the browser.");
		driver.close();
	}


}
