/*
 * Test case - 1

1. Launch a chrome
2. Open Google.com
3. Get page title name and length and print on console
4. Get page URL and verify if it is a correct or not.
5. Get page source and page source length and print on console
6. Close the browser.
 */

package com.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ashwiniProjects\\chrome exe\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		driver.get(url);
		System.out.println("STEP 1 - Check current Url");
		String currntUrl =driver.getCurrentUrl();		
		if(url.equals(currntUrl))
			System.out.println("Test Pass");
		else {
			System.out.println("Test Fail");
		}
		System.out.println("Step 2 - check tilte");

		String currentTitle = driver.getTitle();
		System.out.println("Title is : "+currentTitle);
		System.out.println("length of title is : "+currentTitle.length());
		
		
		System.out.println("Step 3 - page length");
		String pagesource = driver.getPageSource();
		
		//System.out.println(pagesource);
		int pageLength = pagesource.length();
		System.out.println(pageLength);
		
		System.out.println("Step 4 - close browser");
		driver.close();
		
	}

}
