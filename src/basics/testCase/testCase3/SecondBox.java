package basics.testCase.testCase3;

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
 * 
TC#2 - Second Box
- Enter email
- Enter password
- verify message "You successfully clicked on it"
 */
public class SecondBox {
	
	WebDriver driver;
	@BeforeMethod
	 void start() {
		System.out.println("Step 1. Lounch Browser and go to automationbykrishna.com");
		System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		
	}
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	
	@Test
	void TestCase1() {
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Step 3. Enter email");
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("abc@gmail.com");
		System.out.println("Step 4. Enter Password");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("abc1234");
		System.out.println("VERIFY msg  - You Successfully clicked on it");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		String actualAlertText = alert.getText();
		String expectedAlertText = "You successfully clicked on it";
		Assert.assertEquals(actualAlertText, expectedAlertText);
		alert.dismiss();
	}
	
	@Test
	void TestCase2() {
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Step 3. Enter email");
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("");
		System.out.println("Step 4. Enter Password");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("");
		System.out.println("VERIFY msg  - You Successfully clicked on it");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		String actualAlertText = alert.getText();
		String expectedAlertText = "You successfully clicked on it";
		Assert.assertEquals(actualAlertText, expectedAlertText);
		alert.dismiss();
	}
	
}
