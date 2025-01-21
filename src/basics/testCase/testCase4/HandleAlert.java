package basics.testCase.testCase4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Javascript
TC#3
click Alert button
Verify - "You must be TechnoCredits student"
 */

public class HandleAlert {
	
	WebDriver driver;
	@BeforeMethod
	 void start() {
		System.out.println("Step 1. Lounch Browser and go to automationbykrishna.com");
		System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		
	}
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	
	@Test
	void testCase1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='javascriptAlert']")).click();
		Alert alert = driver.switchTo().alert();
		String actaulAlertmsg = alert.getText();
		String expectedAlertmsg = "You must be TechnoCredits student!!";
		Assert.assertEquals(actaulAlertmsg, expectedAlertmsg);
		alert.accept();
	}
	
	

}
