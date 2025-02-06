package basics.testCase.testCase15.dataProvider;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelOperations;

public class TestCase16 {
	
	WebDriver driver;
	@BeforeMethod
	 void start() {
		System.out.println("Step 1. Lounch Browser and go to automationbykrishna.com");
		System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		System.out.println("Step 2. got to Registration Link ");
		driver.findElement(By.xpath("//a[text()='Registration']")).click();
		
	}
	
	@Test(dataProvider="loginDataProvider")
	void doLogin(String username , String password, String actualAlertMag) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("unameSignin")).sendKeys(username);
		driver.findElement(By.id("pwdSignin")).sendKeys(password);
		driver.findElement(By.id("btnsubmitdetails")).click();
		Alert alert = driver.switchTo().alert();
		String expectedAlertMsg = alert.getText();
		Assert.assertEquals(expectedAlertMsg, actualAlertMag);
		alert.accept();
	}
	
	@DataProvider(name = "loginDataProvider")
	Object[][] logindata() throws IOException {
		return ExcelOperations.readExcel("akLoginData.xlsx","data");
		
		
		
				
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	

}
