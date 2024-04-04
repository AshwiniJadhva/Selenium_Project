package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test case - 2

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
	
	static WebDriver start(String url) {
		System.setProperty("webdriver.driver.chrome", "./Selenium_Project/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Step 2. Open Google.com");
		driver.get(url);
		return driver;
	}
	
	static void actionsPerform(String url) {
		WebDriver driver = start(url);
		
		System.out.println("Step 3. Get page title name and verify with expected title");
		String expectedGoogelTitle ="Google";
		String GoogelpageTitle  = driver.getTitle();
		//System.out.println("Page Title - "+GoogelpageTitle);
		if(expectedGoogelTitle.equals(GoogelpageTitle)) {
			System.out.println("Test Pass");
		}
		else System.out.println("Test Failed");
		
		System.out.println("Step 4. navigate to github.com");
		driver.navigate().to("https://github.com/");
		
		System.out.println("Step 5. Get page title name and verify with expected title");
		String expectedGitHubPageTitle = "GitHub";
		String actualGitHubPageTitle = driver.getTitle();
		if(expectedGitHubPageTitle.equals(actualGitHubPageTitle)) {
			System.out.println("Test Pass");
		}
		else System.out.println("Test Failed");
		
		System.out.println("Step 6. navigate back in history");
		driver.navigate().back();
		
		System.out.println("7. Get page title name and verify with expected title [google]");
		String expectedGoogelTitle1 ="Google";
		String GoogelpageTitle1 = driver.getTitle();
		if(expectedGoogelTitle1.equals(GoogelpageTitle1)) {
			System.out.println("Test pass After navigate Back in History");
		}
		else System.out.println("Test Failed After navigate Back in History");
		
		System.out.println("Step 8. navigate forward in the history");
		driver.navigate().forward();
		
		System.out.println("Step 9. Get page title name and verify with expected title [automationbykrishna]");
		String expectedGitHubPageTitle1 = "GitHub: Let’s build from here · GitHub";
		String actualGitHubPageTitle1 = driver.getTitle();
		System.out.println(actualGitHubPageTitle1 );
		if(expectedGitHubPageTitle1.equals(actualGitHubPageTitle1)) {
			System.out.println("Test Pass After navigate forword");
		}
		else System.out.println("Test Failed After navigate forword");
		
		System.out.println("Step 10. refresh the page and verify the expected title [automationbykrishna]");
		driver.navigate().refresh();
		String expectedGitHubPageTitle2 = "GitHub: Let’s build from here · GitHub";
		String actualGitHubPageTitle2 = driver.getTitle();
		if(expectedGitHubPageTitle2.equals(actualGitHubPageTitle2)) {
			System.out.println("Test Pass After Refresh");
		}
		else System.out.println("Test Failed After Refresh");
		
		
		System.out.println("Step 11. Close the browser.");
		driver.close();
	}
	
	public static void main(String[] args) {
		System.out.println("Step 1. Launch a chrome ");
		actionsPerform("https://www.google.com/");
	}

}
