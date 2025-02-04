
/*
 * Test Case - 15  [20-06-2021]
Perform Login Test using data provider on AutomationByKrishna -> Registration
 */

package basics.testCase.testCase15.dataProvider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase15 {
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
	Object[][] logindata() {
		Object[][] data = new Object[4][3];
		data[0][0] = "ashwini";
		data[0][1] = "ashwini123";
		data[0][2] = "Success!";
		
		data[1][0] = "ajinkya";
		data[1][1] = "ajiknya23";
		data[1][2] = "Success!";
		
		data[2][0] = "agastya";
		data[2][1] = "agastya123";
		data[2][2] = "Success!";
		
		data[3][0] = "bal";
		data[3][1] = "bal123";
		data[3][2] = "Failed! please enter strong password";
		
		return data;
				
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	

}
