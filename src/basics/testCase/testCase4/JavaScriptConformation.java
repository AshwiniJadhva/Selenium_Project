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

public class JavaScriptConformation {
	
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
		System.out.println("Step 3. click on js alert");
		driver.findElement(By.xpath("//button[@id='javascriptConfirmBox']")).click();
		Alert alert = driver.switchTo().alert();
		String actualAlertmsg = alert.getText();
		String expectedAlertmsg = "Are you are doing your homework regularly, Press Okay else Cancel!!";
		Assert.assertEquals(actualAlertmsg, expectedAlertmsg);
		alert.accept();
		String actualOKmsg = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		String expectedOKmsg = "You pressed OK!";
		Assert.assertEquals(actualOKmsg, expectedOKmsg);
	}
	@Test
	void testCase2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Step 3. click on js alert");
		driver.findElement(By.xpath("//button[@id='javascriptConfirmBox']")).click();
		Alert alert = driver.switchTo().alert();
		String actualAlertmsg = alert.getText();
		String expectedAlertmsg = "Are you are doing your homework regularly, Press Okay else Cancel!!";
		Assert.assertEquals(actualAlertmsg, expectedAlertmsg);
		alert.dismiss();
		String actualCANCLEmsg = driver.findElement(By.xpath("//p[text()='You pressed Cancel!']")).getText();
		String expectedCANCELmsg = "uou pressed Cancel!";
		Assert.assertEquals(actualCANCLEmsg, expectedCANCELmsg);
	}
}
