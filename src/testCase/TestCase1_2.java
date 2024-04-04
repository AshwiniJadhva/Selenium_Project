package testCase;

/*Test case - 1

1. Launch a chrome
2. Open Google.com
3. Get page title name and length and print on console
4. Get page URL and verify if it is a correct or not.
5. Get page source and page source length and print on console
6. Close the browser.
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1_2 {
	public static void main(String[] args) {
		
		System.out.println("Step 1. Launch a chrome ");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Step 2. Open Google.com");
		String url = "https://www.youtube.com/";
		//driver.get(url);
		driver.navigate().to(url);
		
		System.out.println("Step 3. Get page title name and length and print on console");
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		
		System.out.println("Step 4. Get page URL and verify if it is a correct or not.");
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals(url)) {
			System.out.println("Test pass");
		}
		else System.out.println("Test Fail");
		
		System.out.println("Step 5. Get page source and page source length and print on console");
		String pageSource = driver.getPageSource();
		//System.out.println("Page Source : "+pageSource);
		System.out.println("Length : "+pageSource.length());
		
		boolean ok = pageSource.contains(" abc");
		System.out.println(ok);
		System.out.println("Step 6. Close the browser.");
		driver.close();
		//driver.quit();
		//driver.getTitle();
		
	}

}
