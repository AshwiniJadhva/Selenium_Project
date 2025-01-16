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
 * Test - 3
 
TC#1 - First Box
- Enter Fname, Lname and Company name.
- click submit.
- you should get alert; get that text and verify.

 */
public class FirstBox {
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
	void Test1() throws InterruptedException {
		
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Step 3. Enter Name");
		driver.findElement(By.xpath("//input[@name='ufname']")).sendKeys("Ashwini");
		System.out.println("Step 4. Enter Last name");
		driver.findElement(By.xpath("//input[@name='ulname']")).sendKeys("Jadhav");
		System.out.println("Step 5. Enter Company Name");
		driver.findElement(By.xpath("//input[@name='cmpname']")).sendKeys("Xoriant");
		System.out.println("Step 6. Click On Submit Button");
		driver.findElement(By.xpath("//button[@onclick='myFunctionPopUp()']")).click();
		System.out.println("Step 7. Get the alert Text and verify");
		Alert alert = driver.switchTo().alert();
		String actualAlerttext = alert.getText();
		String expectedAlerttext = "Ashwini and Jadhav and Xoriant";
		Assert.assertEquals(actualAlerttext, expectedAlerttext);
		alert.dismiss();
		//driver.close();
	}
	
	@Test
	void Test2() {
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Step 3. Enter Name");
		driver.findElement(By.xpath("//input[@name='ufname']")).sendKeys("");
		System.out.println("Step 4. Enter Last name");
		driver.findElement(By.xpath("//input[@name='ulname']")).sendKeys("");
		System.out.println("Step 5. Enter Company Name");
		driver.findElement(By.xpath("//input[@name='cmpname']")).sendKeys("");
		System.out.println("Step 6. Click On Submit Button");
		driver.findElement(By.xpath("//button[@onclick='myFunctionPopUp()']")).click();
		System.out.println("Step 7. Get the alert Text and verify");
		Alert alert = driver.switchTo().alert();
		String actualAlerttext = alert.getText();
		String expectedAlerttext = " and  and ";
		Assert.assertEquals(actualAlerttext, expectedAlerttext);
		alert.dismiss();
	}
	
	

}
