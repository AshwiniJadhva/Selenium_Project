package basics.testCase.testcase19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleIframe {
	

	WebDriver driver;
	@BeforeMethod
	 void start() {
		System.out.println("Step 1. Lounch Browser and go to automationbykrishna.com");
		System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.id("iframes")).click();
		
	}
	
	@Test
	void iFrameOperation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("site1")));
		int size = driver.findElements(By.xpath("//iframe")).size();
		System.out.println("Total frame - "+size);
		driver.switchTo().frame(0);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[@class='navbar-toggler-icon']")));
		element.click();

	}
	
	//@AfterMethod
	void tearDown() {
		driver.close();
	}

}
