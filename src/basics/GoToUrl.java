package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GoToUrl {
	WebDriver driver ;
	@BeforeMethod
	public WebDriver start() {
		System.out.println("Step 1.Go to AutomationByKrishna.com");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		System.out.println("Step 2.Go to Basic Element");
		WebElement basicelements = driver.findElement(By.id("basicelements"));
		basicelements.click();
		return driver;
	}
	@AfterMethod
	public void tearDonw() {
		System.out.println("Step 8.Close The Browser");
		driver.quit();
	}

}
